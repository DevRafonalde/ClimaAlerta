CREATE DATABASE IF NOT EXISTS climaalerta;
USE climaalerta;

CREATE TABLE Station (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    latitude DOUBLE NOT NULL,
    longitude DOUBLE NOT NULL
);

CREATE TABLE Shelter (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    capacity INT NOT NULL,
    current_load INT NOT NULL DEFAULT 0
);

CREATE TABLE Reading (
    id INT PRIMARY KEY AUTO_INCREMENT,
    station_id INT NOT NULL,
    rainfall_mm DOUBLE NOT NULL,
    river_level DOUBLE NOT NULL,
    humidity DOUBLE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (station_id) REFERENCES Station(id)
);

CREATE TABLE Alert (
    id INT PRIMARY KEY AUTO_INCREMENT,
    reading_id INT NOT NULL,
    level VARCHAR(50) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (reading_id) REFERENCES Reading(id)
);
