-- Önce tablo içeriklerini kontrol edelim:
SELECT * FROM products;
SELECT * FROM customers;
SELECT * FROM orders;

-- iki tablodaki verilerin hepsini çekmek istediğimiz zaman * kullanılır. Sadece customer tablosundakiler için c.* ve orders için o.* yazılabilir.  
SELECT * FROM orders AS o
	INNER JOIN customers AS c 
ON o.customer_id = c.customer_id;

-- ürünler tablosunu da inner join yapalım:
SELECT c.customer_id, c.first_name, c.last_name, p.product_no, p.name FROM orders AS o
	INNER JOIN customers AS c ON o.customer_id = c.customer_id
	INNER JOIN products AS p ON o.product_no = p.product_no;

-- sorulan bir soru (fiyat * miktar çarpımı) için:
SELECT p.name, p.price, o.quantity, p.price * o.quantity AS total FROM orders AS o
	INNER JOIN products AS p ON o.product_no = p.product_no;