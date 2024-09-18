
CREATE SCHEMA IF NOT EXISTS TS securecapita;

SET NAMES 'UTF8MB4';
SET TIME_ZONE = 'Europe/Vienna';
SET TIME_ZONE = '+2:00';

USE securecapita;

DROP TABLE IF EXISTS Users;

CREATE TABLE Users
(
    id                  BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    first_name          VARCHAR(50) NOT NULL ,
    last_name           VARCHAR(50) NOT NULL ,
    email               VARCHAR(100) NOT NULL ,
    password            VARCHAR(255) DEFAULT NULL,
    address             VARCHAR(255) DEFAULT NULL,
    phone               VARCHAR(30) DEFAULT NULL,
    title               VARCHAR(50) DEFAULT NULL,
    bio                 VARCHAR(255) DEFAULT NULL,
    enabled             BOOLEAN DEFAULT FALSE,
    non_locked          BOOLEAN DEFAULT TRUE,
    using_mfa           BOOLEAN DEFAULT FALSE,
    created_date        DATETIME DEFAULT CURRENT_TIMESTAMP,
    image_url           VARCHAR(255) DEFAULT 'https://cdn-icons-png.flaticon.com/512/149/149071.png',
    CONSTRAINT UQ_Users_Email UNIQUE (email)

);