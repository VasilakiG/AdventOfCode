//
// Created by root on 26.12.23.
//

#include "secondDaySecondExercise.h"

#include <vector>

std::vector<std::string> split(const std::string& s, const std::string& delimiter);

void solveSecondExercise()
{
    if (std::ifstream file("/home/vasilaki/CODES/AdventOfCode/2023/day2/secondDaySecondExerciseInput"); file.is_open() )
    {
        std::string line;
        std::string spaceDelimiter = " ";

        std::vector<std::string> lines;

        int id = 1;
        int sum = 0;

        int maxRed = 1;
        int maxGreen = 1;
        int maxBlue = 1;

        while( std::getline(file, line) )
        {
            lines = split (line, spaceDelimiter);
            lines.erase(lines.begin(), lines.begin() + 2);

            for ( int i = 1; i < lines.size(); i+=2 )
            {
                if ( lines[i].rfind("red") == 0)
                {
                    if (std::stoi( lines[i-1] ) > maxRed)
                    {
                        maxRed = std::stoi( lines[i-1] );
                    }
                }
                else if ( lines[i].rfind("green") == 0 )
                {
                    if (std::stoi( lines[i-1] ) > maxGreen)
                    {
                        maxGreen = std::stoi( lines[i-1] );
                    }

                }
                else if ( lines[i].rfind("blue") == 0 )
                {
                    if (std::stoi( lines[i-1] ) > maxBlue)
                    {
                        maxBlue = std::stoi( lines[i-1] );
                    }
                }
            }

            sum += maxRed * maxGreen * maxBlue;
            maxRed = maxGreen = maxBlue = 1;
            id++;
        }

        file.close();
        std::cout << sum << std::endl;
    }
}
