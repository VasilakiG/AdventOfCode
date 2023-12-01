//
// Created by vasilaki on 1.12.23.
//

#include <iostream>
#include <fstream>
#include <string>

int main ()
{
    std::string line;

    std::ifstream file("firstDayFirstExerciseInput.txt");

    if ( file.is_open() )
    {
        while( std::getline(file, line) )
        {
            std::cout << line << "\n";
        }
        file.close();
    }

    return EXIT_SUCCESS;
}
