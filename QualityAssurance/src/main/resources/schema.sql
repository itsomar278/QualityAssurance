DROP TABLE IF EXISTS Currency;

CREATE TABLE Currency (
                          code VARCHAR(3) PRIMARY KEY,
                          name VARCHAR(255) NOT NULL
);
