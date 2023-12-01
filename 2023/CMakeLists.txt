cmake_minimum_required(VERSION 3.27)

project(AdventOfCode2023)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

set(SOURCE_FILES firstDayFirstExerciseInput.cpp)

add_executable(AdventOfCode2023 ${SOURCE_FILES})