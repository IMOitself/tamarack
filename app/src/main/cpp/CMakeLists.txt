cmake_minimum_required(VERSION 3.22.1)

set(CMAKE_C_STANDARD 17)
set(CMAKE_C_EXTENSIONS OFF)
set(CMAKE_C_STANDARD_REQUIRED ON)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_EXTENSIONS OFF)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

project("tamarack")

add_library(${CMAKE_PROJECT_NAME} SHARED
        native-lib.c)

target_link_libraries(${CMAKE_PROJECT_NAME}
        android
        log)