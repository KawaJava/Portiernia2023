--liquibase formatted sql
--changeset root:2

CREATE TABLE lecture_hall (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  number varchar(10) NOT NULL,
  activity varchar(5) NOT NULL,
  updated DATE NOT NULL,
  UNIQUE KEY id_UNIQUE (id),
  UNIQUE KEY number_UNIQUE (number)
)