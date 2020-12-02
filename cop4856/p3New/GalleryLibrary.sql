CREATE DATABASE IF NOT EXISTS GalleryLibrary;
USE GalleryLibrary;
DROP TABLE IF EXISTS Gallery;

CREATE TABLE Gallery (
	id INTEGER UNSIGNED NOT NULL,
	cName VARCHAR(45) NOT NULL,
	cURL VARCHAR(45) NOT NULL,
	keywords VARCHAR(45) NOT NULL,
	location VARCHAR(45) NOT NULL,
	mime VARCHAR(45) NOT NULL,
	title VARCHAR(45) NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO Gallery VALUES (1, "leonardo da vinci", "https://en.wikipedia.org/wiki/Mona_Lisa", "leonardo, smile, mona", "Louvre Museum", "text/html", "mona lisa");
INSERT INTO Gallery VALUES (2,"Mchelangelo", "https://en.wikipedia.org/wiki/The_Last_Judgment_(Michelangelo)", "michaelangel, church, italy", "sistine chapel", "text/html", "the last judgement");
INSERT INTO Gallery VALUES (3, "Vincent Van Goh", "https://en.wikipedia.org/wiki/The_Starry_Night", "vincent, ear", "the museum of modern art", "text/html", "the starry night");