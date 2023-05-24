--liquibase formatted sql
--changeset root:3

CREATE TABLE rental (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  date date NOT NULL,
  release_time time NOT NULL,
  return_time time DEFAULT NULL,
  deadline_time time DEFAULT NULL,
  notification tinyint NOT NULL,
  lecturer_id bigint NOT NULL,
  lecture_hall_id bigint NOT NULL,
  UNIQUE KEY id_UNIQUE (id),
  KEY lecturer_id(lecturer_id),
  KEY lecture_hall_id_idx (lecture_hall_id),
  CONSTRAINT lecture_hall_id FOREIGN KEY (lecture_hall_id) REFERENCES lecture_hall (id),
  CONSTRAINT lecturer_id FOREIGN KEY (lecturer_id) REFERENCES lecturer (id)
)