CREATE TABLE ilk_raf(
	kitap_no INTEGER,
	kitap_adi VARCHAR(100) NOT NULL,
	yazar_adi VARCHAR(100) NOT NULL,
	PRIMARY KEY(kitap_no)
);

CREATE TABLE ikinci_raf(
	kitap_no INTEGER,
	kitap_adi VARCHAR(100) NOT NULL,
	yazar_adi VARCHAR(100) NOT NULL,
	PRIMARY KEY(kitap_no)
);

INSERT INTO ilk_raf(kitap_no, kitap_adi, yazar_adi)
	VALUES(1, 'Sherlock', 'arthur'),
	(2, 'Lord of the Rings', 'tolkien'),
	(3, 'Harry Potter', 'J.K.Rowling'),
	(4, 'Moving Castle', 'Diana Wynne');
TRUNCATE ikinci_raf; 
INSERT INTO ikinci_raf(kitap_no, kitap_adi, yazar_adi)
	VALUES(1, 'Simyacı', 'Paul Coelho'),
	(2, 'Lord of the Rings', 'tolkien'),
	(3, 'Spirited Away', 'Hayao Miyazaki'),
	(4, 'Moving Castle', 'Diana Wynne')
RETURNING kitap_adi, yazar_adi;
	
SELECT * FROM ilk_raf, ikinci_raf;
	
