COMMENT ON TABLE products IS 'ürünler tablosu';
CREATE TABLE products(
	product_no SERIAL,
	name TEXT,
	price NUMERIC,
	PRIMARY KEY(product_no)	
);

CREATE TABLE customers(
	customer_id SERIAL,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	phone VARCHAR(15),
	email VARCHAR(100),
	PRIMARY KEY(customer_id)
);

CREATE TABLE orders(
	order_id SERIAL,
	product_no INTEGER,
	quantity INTEGER,
	customer_id INTEGER,
	PRIMARY KEY(order_id),
	FOREIGN KEY(customer_id)
		REFERENCES customers(customer_id),
	FOREIGN KEY(product_no)
		REFERENCES products(product_no)
);
--SERIAL ile sequence önceden oluşturulmuş.
--CREATE SEQUENCE products_product_no_seq;
--Eğer daha önceden oluşturulmamışsa ->
	--ALTER SEQUENCE products_product_no_seq
		--OWNED BY products.product_no;
