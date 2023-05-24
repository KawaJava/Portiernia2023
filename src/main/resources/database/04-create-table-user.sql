--liquibase formatted sql
--changeset root:4

CREATE TABLE user (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username varchar(50) NOT NULL,
  password varchar(100) NOT NULL,
  role varchar(5) NOT NULL,
  UNIQUE KEY `id_UNIQUE` (id),
  UNIQUE KEY `username_UNIQUE` (username)
)