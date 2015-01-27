CREATE DATABASE bookstore;

CREATE TABLE IF NOT EXISTS bookstore.book (
  id int NOT NULL AUTO_INCREMENT,
  book_title VARCHAR(30) NOT NULL,
  book_author VARCHAR(30) NOT NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS bookstore.series (
  id INT NOT NULL AUTO_INCREMENT,
  series_title VARCHAR(30) NOT NULL,
  series_author VARCHAR(30) NOT NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT = 1;

-- insert all 7 Harry Potter books
INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Philosopher's Stone", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Chamber of Secrets", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Goblet of Fire", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Order of the Phoenix", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Half-Blood Prince", "J. K. Rowling");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Harry Potter and the Deathly Hallows", "J. K. Rowling");

-- insert all the Harry Potter books in a series of books
INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Philosopher's Stone");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Chamber of Secrets");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Prisoner of Azkaban");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Goblet of Fire");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Order of the Phoenix");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Harry Potter series", "Harry Potter and the Half-Blood Prince");

INSERT INTO bookstore.series (series_title, series_author)
VALUES ("Harry Potter series", "Harry Potter and the Deathly Hallows");




-- Philosophiae Naturalis Principia Mathematica
INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Book 1: De motu corporum", "Isaac Newton");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Book 2", "Isaac Newton");

INSERT INTO bookstore.book (book_title,book_author)
  VALUES ("Book 3: De mundi systemate", "Isaac Newton");

-- insert Newton's books into a series
INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Philosophiae Naturalis Principia Mathematica", "Book 1: De motu corporum");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Philosophiae Naturalis Principia Mathematica", "Book 2");

INSERT INTO bookstore.series (series_title, series_author)
  VALUES ("Philosophiae Naturalis Principia Mathematica", "Book 3: De mundi systemate");


-- insert some more books
INSERT INTO bookstore.book (book_title,book_author)
VALUES ("Love in the time of cholera", "Gabriel Garcia Marquez");

INSERT INTO bookstore.book (book_title,book_author)
VALUES ("100 years of solitude", "Gabriel Garcia Marquez");

INSERT INTO bookstore.book (book_title,book_author)
VALUES ("A brief history of time", "Stephen Hawking");
