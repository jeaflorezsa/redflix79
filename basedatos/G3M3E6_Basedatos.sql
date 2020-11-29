-- creamos la base de datos 
DROP DATABASE IF EXISTS G3M3E6;
CREATE DATABASE G3M3E6;
-- usar base datos 
USE G3M3E6;
-- creamos la tabla usuarios
CREATE TABLE IF NOT EXISTS usuario(
	alias_usuario VARCHAR(40) NOT NULL,  
	nombre_usuario  VARCHAR(100) NOT NULL,
    PRIMARY KEY(alias_usuario)
);
-- creamos la tabla peliculas
CREATE TABLE IF NOT EXISTS pelicula(
	id_pelicula INT AUTO_INCREMENT,  
	titulo_pelicula VARCHAR(100) NOT NULL,
    resumen_pelicula TEXT NOT NULL,
    year_pelicula INT NOT NULL, 
    nombre_director VARCHAR(100) unique,
    PRIMARY KEY(id_pelicula)
);
-- creamos la tabla series
CREATE TABLE IF NOT EXISTS serie(
	id_serie INT AUTO_INCREMENT,  
	titulo_serie VARCHAR(100) NOT NULL,
    num_temporadas INT NOT NULL,
    num_capitulos INT NOT NULL,
    PRIMARY KEY(id_serie)
); 