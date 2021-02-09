INSERT INTO products(name, price)
	VALUES('sehpa', 25.00);

SELECT * FROM products;

SELECT * FROM products
	WHERE price > 5.00;

DELETE FROM products
	WHERE name = 'kitap';

SELECT setval('products_product_no_seq', 10, true);

SELECT currval('products_product_no_seq');

INSERT INTO customers(first_name, last_name, email, phone)
	VALUES('asim', 'mert', 'ksnn.9@gmail.com', '905060600915');
	
SELECT * FROM customers;

INSERT INTO orders(product_no, quantity, customer_id)
	VALUES(2, 10, 1);
	
SELECT * FROM orders;