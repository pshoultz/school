CREATE DATABASE IF NOT EXISTS GalleryLibrary;
USE GalleryLibrary;
DROP TABLE IF EXISTS Gallery;

CREATE TABLE Gallery (
	Cname VARCHAR(45) NOT NULL,
	CuRL VARCHAR(45) NOT NULL,
	Id INTEGER UNSIGNED NOT NULL,
	Keywords VARCHAR(45) NOT NULL,
	Location VARCHAR(45) NOT NULL,
	Mime VARCHAR(45) NOT NULL,
	Title VARCHAR(45) NOT NULL,
	PRIMARY KEY (Id)
);

INSERT INTO Gallery VALUES ("leonardo da vinci", "https://en.wikipedia.org/wiki/Mona_Lisa", 1, "leonardo, smile, mona", "Louvre Museum", "text/html", "mona lisa");
INSERT INTO Gallery VALUES ("Mchelangelo", "https://en.wikipedia.org/wiki/The_Last_Judgment_(Michelangelo)", 2, "michaelangel, church, italy", "sistine chapel", "text/html", "the last judgement");
INSERT INTO Gallery VALUES ("Vincent Van Goh", "https://en.wikipedia.org/wiki/The_Starry_Night", 3, "vincent, ear", "the museum of modern art", "text/html", "the starry night");