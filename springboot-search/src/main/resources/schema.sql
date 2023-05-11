use content;
CREATE TABLE books (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(500),
  description VARCHAR(5000),
  date_Created date
);