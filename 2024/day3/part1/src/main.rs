use std::fs::File;
use std::io::{self, BufRead};
use regex::Regex;

fn main() -> std::io::Result<()> {
    let file_path = "../input.txt";
    let file = File::open(file_path)?;
    let reader = io::BufReader::new(file);

    let mut result: i32 = 0;

    for line in reader.lines() {
        let line = line?;

        let pattern = Regex::new(r"mul\((\d{1,3}),(\d{1,3})\)").unwrap();

        for capture in pattern.captures_iter(&line) {
            let first_number = &capture[1];
            let second_number = &capture[2];

            result += first_number.parse::<i32>().unwrap() * second_number.parse::<i32>().unwrap();
        }
    }

    println!("Result: {}", result);
    Ok(())
}
