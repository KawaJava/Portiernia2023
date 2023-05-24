--liquibase formatted sql
--changeset root:1

CREATE TABLE lecturer (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(100) NOT NULL,
  surname varchar(100) NOT NULL,
  email varchar(50) NOT NULL,
  abbreviation varchar(5) NOT NULL,
  activity varchar(5) NOT NULL,
  created DATE NOT NULL
);