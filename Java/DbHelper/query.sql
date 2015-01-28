CREATE DATABASE company;

CREATE TABLE IF NOT EXISTS company.employee (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(20),
  surname VARCHAR(20),
  profession VARCHAR(20),
  sector VARCHAR(20),
  PRIMARY KEY (id)
) AUTO_INCREMENT = 1;

/*
-- add the sectors table here

CREATE TABLE IF NOT EXISTS company.sectors (
  id INT NOT NULL AUTO_INCREMENT
) AUTO_INCREMENT = 1;
*/

INSERT INTO company.employee (name, surname, profession, sector)
  VALUES ("John", "Doe", "IT specialist", "IT sector");

INSERT INTO company.employee (name, surname, profession, sector)
  VALUES ("Jack", "Smith", "Accountant", "Finance and Administration sector");

INSERT INTO company.employee (name, surname, profession, sector)
  VALUES ("Sarah", "Parker", "QA", "Production sector");

INSERT INTO company.employee (name, surname, profession, sector)
  VALUES ("Dolores", "Armstrong", "Lawyer", "Legal department");

INSERT INTO company.employee (name, surname, profession, sector)
  VALUES ("Ash", "Ketchum", "chemist", "R&D");

