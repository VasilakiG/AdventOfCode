//
// Created by root on 25.12.23.
//

#include "secondDayFirstExercise.h"

#include <vector>

std::vector<std::string> split(const std::string& s, const std::string& delimiter) {
    size_t pos_start = 0, pos_end;
    const size_t delim_len = delimiter.length();
    std::vector<std::string> res;

    while ((pos_end = s.find(delimiter, pos_start)) != std::string::npos) {
        std::string token = s.substr(pos_start, pos_end - pos_start);
        pos_start = pos_end + delim_len;
        res.push_back (token);
    }

    res.push_back (s.substr (pos_start));
    return res;
}

void solveFirstExercise()
{
    if (std::ifstream file("/home/vasilaki/CODES/AdventOfCode/2023/day2/secondDayFirstExerciseInput"); file.is_open() )
    {
        std::string line;
        std::string spaceDelimiter = " ";

        std::vector<std::string> lines;

        int id = 1;
        bool dontAdd = false;
        int sum = 0;

        while( std::getline(file, line) )
        {
            lines = split (line, spaceDelimiter);
            lines.erase(lines.begin(), lines.begin() + 2);

            for ( int i = 1; i < lines.size(); i+=2 )
            {
                if ( lines[i].rfind("red") == 0)
                {
                    if (constexpr int RED = 12; std::stoi( lines[i-1] ) > RED)
                    {
                        dontAdd = true;
                        break;
                    }
                }
                else if ( lines[i].rfind("green") == 0 )
                {
                    if (constexpr int GREEN = 13; std::stoi( lines[i-1] ) > GREEN)
                    {
                        dontAdd = true;
                        break;
                    }

                }
                else if ( lines[i].rfind("blue") == 0 )
                {
                    if (constexpr int BLUE = 14; std::stoi( lines[i-1] ) > BLUE)
                    {
                        dontAdd = true;
                        break;
                    }
                }
            }

            if (!dontAdd)
            {
                sum += id;
            }
            id++;
            dontAdd = false;
        }

        file.close();
        std::cout << sum << std::endl;
    }
}
