//
// Created by root on 26.12.23.
//

#include "thirdDayFirstExercise.hpp"

void solveFirstExercise()
{
    if (std::ifstream file("/home/vasilaki/CODES/AdventOfCode/2023/day3/thirdDayFirstExerciseInput"); file.is_open() )
    {
        std::string line;
        std::string spaceDelimiter = " ";

        std::vector<std::string> firstLine;
        std::vector<std::string> secondLine;
        std::vector<std::string> thirdLine;

        int sum = 0;
        bool numberMode = false;
        int temporaryNumber = 0;

        int lineCounter = 0;

        while( std::getline(file, line) )
        {
            if (lineCounter % 1 == 0)
            {
                firstLine.push_back(line);
            }
            if (lineCounter % 2 == 0)
            {
                secondLine.push_back(line);
            }
            if (lineCounter % 3 == 0)
            {
                thirdLine.push_back(line);
            }
            lineCounter++;
        }

        file.close();
        std::cout << "First line: " << std::endl;
        for (int i = 0; i < lines.size(); ++i) {
            std::cout << lines[i] << std::endl;
        }
    }
}