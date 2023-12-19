//
// Created by vasilaki on 19.12.23.
//
#include "firstDaySecondExercise.h"

void solveSecondExercise()
{
    if (std::ifstream file("/home/vasilaki/CODES/AdventOfCode/2023/day1/firstDaySecondExerciseInput"); file.is_open() )
    {
        std::string line;
        int sum = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        bool firstNumberFlag = true;

        while( std::getline(file, line) )
        {
            for (int i = 0; i < line.length(); i++)
            {
                if (firstNumberFlag)
                {
                    if ( isdigit(line.at(i)) )
                    {
                        firstNumber =  line.at(i) - '0';
                    }
                    else if (line.substr(i, 3) == "one")
                    {
                        firstNumber = 1;
                    }
                    else if (line.substr(i, 3) == "two")
                    {
                        firstNumber = 2;
                    }
                    else if (line.substr(i, 5) == "three")
                    {
                        firstNumber = 3;
                    }
                    else if (line.substr(i, 4) == "four")
                    {
                        firstNumber = 4;
                    }
                    else if (line.substr(i, 4) == "five")
                    {
                        firstNumber = 5;
                    }
                    else if (line.substr(i, 3) == "six")
                    {
                        firstNumber = 6;
                    }
                    else if (line.substr(i, 5) == "seven")
                    {
                        firstNumber = 7;
                    }
                    else if (line.substr(i, 5) == "eight")
                    {
                        firstNumber = 8;
                    }
                    else if (line.substr(i, 4) == "nine")
                    {
                        firstNumber = 9;
                    }

                    if (firstNumber != 0)
                    {
                        firstNumberFlag = false;
                    }
                }

                if ( isdigit(line.at(i)) )
                {
                    secondNumber = line.at(i) - '0';
                }
                else if (line.substr(i, 3) == "one")
                {
                    secondNumber = 1;
                }
                else if (line.substr(i, 3) == "two")
                {
                    secondNumber = 2;
                }
                else if (line.substr(i, 5) == "three")
                {
                    secondNumber = 3;
                }
                else if (line.substr(i, 4) == "four")
                {
                    secondNumber = 4;
                }
                else if (line.substr(i, 4) == "five")
                {
                    secondNumber = 5;
                }
                else if (line.substr(i, 3) == "six")
                {
                    secondNumber = 6;
                }
                else if (line.substr(i, 5) == "seven")
                {
                    secondNumber = 7;
                }
                else if (line.substr(i, 5) == "eight")
                {
                    secondNumber = 8;
                }
                else if (line.substr(i, 4) == "nine")
                {
                    secondNumber = 9;
                }
            }

            sum += (firstNumber * 10) + secondNumber;
            firstNumberFlag = true;
            firstNumber = 0;
            secondNumber = 0;
        }
        file.close();
        std::cout << sum << std::endl;
    }
}
