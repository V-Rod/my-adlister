# create schema for the database

CREATE DATABASE IF NOT EXISTS adlister_db;

USE adlister_db;

CREATE TABLE IF NOT EXISTS ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  title VARCHAR(400) NOT NULL,
  description TEXT,
  PRIMARY KEY (id)
);