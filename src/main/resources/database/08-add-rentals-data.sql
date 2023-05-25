--liquibase formatted sql
--changeset root:8

INSERT INTO rental (date, release_time, return_time, deadline_time, notification, lecturer_id, lecture_hall_id)
VALUES ('2023-05-24', '18:00:00', '20:12:41', '20:00:00', '1', '2', '5');
INSERT INTO rental (date, release_time, deadline_time, notification, lecturer_id, lecture_hall_id)
VALUES ('2023-05-25', '14:00:00', '16:10:00', '0', '4', '6');
INSERT INTO rental (date, release_time, deadline_time, notification, lecturer_id, lecture_hall_id)
VALUES ('2023-05-25', '16:00:00', '18:10:00', '0', '4', '4');
INSERT INTO rental (date, release_time, deadline_time, notification, lecturer_id, lecture_hall_id)
VALUES ('2023-05-25', '18:00:00', '20:10:00', '0', '2', '2');