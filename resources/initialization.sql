# drop database
DROP DATABASE IF EXISTS shortrent;

# create database
CREATE DATABASE IF NOT EXISTS shortrent;

# use database
USE shortrent;

CREATE TABLE user(
  id BIGINT AUTO_INCREMENT,
  username VARCHAR(100),
  email VARCHAR(100),
  password VARCHAR(100),
  PRIMARY KEY (id)
);

INSERT INTO user(username, email, password) values('liudonghua', 'liudonghua123@gmail.com', 'liudonghua');