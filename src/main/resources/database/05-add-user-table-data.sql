--liquibase formatted sql
--changeset root:5

INSERT INTO user (username, password, role) VALUES
('user', '$2a$12$zn8NRKuy5uf4SD/fz9WDR.QAOqWGoVJPod9bXrQxKz7tgWoTLhqN2', 'USER');
INSERT INTO user (username, password, role) VALUES
('admin', '$2a$12$zn8NRKuy5uf4SD/fz9WDR.QAOqWGoVJPod9bXrQxKz7tgWoTLhqN2', 'ADMIN');