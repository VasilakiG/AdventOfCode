use std::fs::File;
use std::io::{self, BufRead};
use regex::Regex;

fn main() -> std::io::Result<()> {
    let file_path = "../input.txt";
    let file = File::open(file_path)?;
    let reader = io::BufReader::new(file);

    let mut result: i32 = 0;
    let mut good_mode: bool = true;

    let combined_pattern = Regex::new(r"do\(\)|don't\(\)|mul\((\d{1,3}),(\d{1,3})\)").unwrap();

    for line in reader.lines() {
        let line = line?;

        for token in combined_pattern.find_iter(&line) {
            let token = token.as_str();

            if token == "do()" {
                good_mode = true;
            }
            else if token == "don't()" {
                good_mode = false;
            }
            else if good_mode {
                if let Some(captures) = combined_pattern.captures(token) {
                    let first_number: i32 = captures[1].parse().unwrap();
                    let second_number: i32 = captures[2].parse().unwrap();

                    result += first_number * second_number;
                }
            }
        }
    }

    println!("Result: {}", result);
    Ok(())
}
