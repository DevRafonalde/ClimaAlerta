CREATE DATABASE IF NOT EXISTS climaalerta;
USE climaalerta;

CREATE TABLE station (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    latitude DOUBLE NOT NULL,
    longitude DOUBLE NOT NULL
);

CREATE TABLE shelter (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    capacity INT NOT NULL,
    current_load INT NOT NULL DEFAULT 0
);

CREATE TABLE reading (
    id INT PRIMARY KEY AUTO_INCREMENT,
    station_id INT NOT NULL,
    rainfall_mm DOUBLE NOT NULL,
    river_level DOUBLE NOT NULL,
    humidity DOUBLE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (station_id) REFERENCES station(id)
);

CREATE TABLE alert (
    id INT PRIMARY KEY AUTO_INCREMENT,
    reading_id INT NOT NULL,
    level VARCHAR(50) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (reading_id) REFERENCES reading(id)
);
