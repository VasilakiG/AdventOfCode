use std::fs::File;
use std::io::{self, BufRead};

fn main() -> std::io::Result<()> {
    let file_path = "../input.txt";
    let file = File::open(file_path)?;
    let reader = io::BufReader::new(file);

    let mut first_list: Vec<i32> = Vec::new();
    let mut second_list: Vec<i32> = Vec::new();

    for line in reader.lines() {
        let line = line?;

        let parts: Vec<&str> = line.split("   ").collect();
        if parts.len() == 2 {
            first_list.push(parts[0].trim().parse().unwrap_or_default());

            second_list.push(parts[1].trim().parse().unwrap_or_default());
        } else {
            println!("Line format is incorrect: {}", line);
        }
    }

    let result: i32 = first_list
        .iter()
        .filter(|&&first_element| second_list.contains(&first_element))
        .map(|&first_element| {
            let count = second_list.iter().filter(|&&second_element| second_element == first_element).count();
            first_element * count as i32
        })
        .sum();

    println!("Result: {:?}", result);

    Ok(())
}