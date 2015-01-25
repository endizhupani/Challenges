CREATE TABLE people
(
  id serial NOT NULL,
  name character(20),
  surname character(20),
  age integer,
  CONSTRAINT people_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);

ALTER TABLE people
  OWNER TO postgres;
  
insert into people (name, surname, age) values ('Bruce','Scott',65);
insert into people (name, surname, age) values ('John','Doe',40);
insert into people (name, surname, age) values ('Jane','Doe',35);