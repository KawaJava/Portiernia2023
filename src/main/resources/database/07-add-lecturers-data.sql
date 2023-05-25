--liquibase formatted sql
--changeset root:7

INSERT INTO lecturer (name, surname, email, abbreviation, activity, created)
VALUES ('Jan', 'Nowak', 'email.email.com', 'JNow', 'ACT', '2023-05-25');
INSERT INTO lecturer (name, surname, email, abbreviation, activity, created)
VALUES ('Jan', 'Kowalski', 'email.email.com', 'JNow', 'ACT', '2023-05-25');
INSERT INTO lecturer (name, surname, email, abbreviation, activity, created)
VALUES ('Kamil', 'Nowak', 'email.email.com', 'KNow', 'INACT', '2023-05-25');
INSERT INTO lecturer (name, surname, email, abbreviation, activity, created)
VALUES ('Anna', 'Kowalska', 'email.email.com', 'AKow', 'ACT', '2023-05-25');