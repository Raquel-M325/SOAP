
cmake_minimum_required(VERSION 3.16)

project(BibliotecaCliente LANGUAGES CXX)

# Configuração da linguagem C++
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

# Bibliotecas externas
find_package(CURL REQUIRED)
find_package(tinyxml2 CONFIG REQUIRED)

# Arquivos que serão compilados
add_executable(biblioteca_cliente
    src/main.cpp
    src/clients/LivroCliente.cpp
)

# Diretório dos arquivos de cabeçalho
target_include_directories(biblioteca_cliente PRIVATE
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)

# Vinculação das bibliotecas
target_link_libraries(biblioteca_cliente PRIVATE
    CURL::libcurl
    tinyxml2::tinyxml2
)
