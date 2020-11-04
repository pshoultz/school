CREATE DATABASE IF NOT EXISTS Gallery;
USE Gallery;
DROP TABLE IF EXISTS Photos;

CREATE TABLE Photos (
  Title VARCHAR(45) NOT NULL,
  Type VARCHAR(45) NOT NULL,
  CreatorName VARCHAR(45) NOT NULL,
  CreatorURL VARCHAR(45) NOT NULL,
  MimeType VARCHAR(45) NOT NULL,
  Location VARCHAR(45) NOT NULL,
  Keywords VARCHAR(45) NOT NULL,
  PRIMARY KEY (Title)
);

INSERT INTO Photos VALUES ("title 1", "stock", "paul", "www.url1.com", "text/html", "www.location1.com", "apple,banana");