DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id int NOT NULL AUTO_INCREMENT,
                       name varchar(100) NOT NULL,
                       PRIMARY KEY (id)
);

insert into users(id, name) values(1,'John'); 
insert into users(id, name) values(2,'Smith'); 
insert into users(id, name) values(3,'Siva');