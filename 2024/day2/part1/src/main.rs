use std::fs::File;
use std::io::{self, BufRead};

fn is_valid_increasing(report: &Vec<i32>) -> bool {
    report
        .windows(2)
        .all(|pair| pair[0] < pair[1] 
            && (pair[1] - pair[0]).abs() <= 3 )
}

fn is_valid_decreasing(report: &Vec<i32>) -> bool {
    report
        .windows(2)
        .all(|pair| pair[0] > pair[1] 
            && (pair[1] - pair[0]).abs() <= 3)
}

fn main() -> std::io::Result<()> {
    let file_path = "../input.txt";
    let file = File::open(file_path)?;
    let reader = io::BufReader::new(file);

    let mut reports: Vec<Vec<i32>> = Vec::new();
    
    for line in reader.lines() {
        let line = line?;
        
        let parts: Vec<&str> = line.split_whitespace().collect();
        
        let mut report: Vec<i32> = Vec::new();
        for part in parts {
            report.push(part.trim().parse().unwrap_or_default());
        }

        reports.push(report);
    }

    let increasing_reports: i32 = reports
        .iter()
        .filter(|report| is_valid_increasing(report))
        .count()
        .try_into()
        .unwrap();
    
    let decreasing_reports: i32 = reports
        .iter()
        .filter(|report| is_valid_decreasing(report))
        .count()
        .try_into()
        .unwrap();

    println!("Result: {:?}", increasing_reports + decreasing_reports);

    Ok(())
}
