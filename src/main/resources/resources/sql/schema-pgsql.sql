--CREATE SEQUENCE person_id_seq START WITH 1 INCREMENT BY 1;
--CREATE TABLE person(
-- 	person_id   NUMERIC DEFAULT nextval('person_id_seq'),
--	first_name 	VARCHAR(150),
--	last_name 	VARCHAR(150),
--	age			INTEGER,
--	place		VARCHAR(100)
--);
--ALTER SEQUENCE person_id_seq OWNED BY person.id;

DROP TABLE person;
DROP TABLE location;
DROP TABLE care_site;

CREATE TABLE person(
  	person_id   		SERIAL PRIMARY KEY NOT NULL,
  	--location_id   		SERIAL REFERENCES location(location_id)
  	--care_site_id   		SERIAL REFERENCES care_site(care_site_id)
	first_name 			VARCHAR(150) NOT NULL,
	last_name 			VARCHAR(150) NOT NULL,
	age					INTEGER NOT NULL,-- (CHECK age > 17),
	--date_of_birth		DATE,
	email				VARCHAR(150) NOT NULL UNIQUE,
	password			VARCHAR(150) NOT NULL
);

CREATE TABLE location(
  	location_id   		SERIAL PRIMARY KEY NOT NULL,
  	address1 			VARCHAR(150) NOT NULL,
  	address2 			VARCHAR(150) NOT NULL,
  	town 				VARCHAR(150) NOT NULL,
  	city 				VARCHAR(150) NOT NULL,
  	county				VARCHAR(150) NOT NULL,
  	country				VARCHAR(150) NOT NULL,
  	zip					VARCHAR(150) NOT NULL
);

CREATE TABLE care_site(
  	care_site_id   		SERIAL PRIMARY KEY NOT NULL,
  	location_id   		SERIAL REFERENCES location(location_id),
  	place_of_service	VARCHAR(150) NOT NULL
);

