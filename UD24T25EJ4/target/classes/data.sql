
DROP TABLE IF EXISTS salas;
DROP table IF EXISTS peliculas;

CREATE TABLE peliculas(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(100) not null,
    calificacionedad int not null
);

CREATE TABLE salas(
	id int NOT NULL  PRIMARY KEY,
    nombre nvarchar(250) not null,
    pelicula int not null,
CONSTRAINT peliculas_fk FOREIGN KEY (pelicula) REFERENCES peliculas(id)
);


insert into peliculas (nombre,calificacionedad)values('Pelicula 1',16);
insert into peliculas (nombre,calificacionedad)values('Pelicula 2',12);
insert into peliculas (nombre,calificacionedad)values('Pelicula 3',6);
insert into peliculas (nombre,calificacionedad)values('Pelicula 4',18);
insert into peliculas (nombre,calificacionedad)values('Pelicula 5',8);


insert into salas (id, nombre,pelicula)values(12,'A',1);
insert into salas (id,nombre,pelicula)values(13,'B',2);
insert into salas (id,nombre,pelicula)values(14,'C',3);
insert into salas (id,nombre,pelicula)values(15,'D',4);
insert into salas (id,nombre,pelicula)values(16,'E',5);