create table users
(
    id         INTEGER      NOT NULL AUTO_INCREMENT,
    name       VARCHAR(100) NOT NULL,
    email      VARCHAR(255) NOT NULL,
    phone      VARCHAR(13)  NOT NULL,
    zipcode    VARCHAR(7)   NOT NULL,
    address    VARCHAR(500) NOT NULL,
    birthdate DATE         NOT NULL,
    PRIMARY KEY (id)
);