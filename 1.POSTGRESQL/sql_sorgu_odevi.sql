-- 1 Nisan 2007 tarihten sonra ödeme yapan müşterileri listeleyen sorgu
SELECT c.customer_id, c.first_name, c.last_name, p.payment_date
FROM customer c
INNER JOIN payment p 
ON c.customer_id = p.customer_id
WHERE payment_date>'2007-04-01';

--hocanın yaptığı
SELECT c.customer_id, c.first_name, c.last_name FROM payment AS p
INNER JOIN customer AS c
ON c.customer_id = p.customer_id
WHERE p.payment_date>'2007-04-01'
GROUP BY c.customer_id, c.first_name, c.last_name, c.customer_id
ORDER BY customer_id;



-- Aksiyon ve Animasyon kategorisindeki filmlerin çıkış tarihlerini, başlığını ve kategorisini listeleyen sorgu
SELECT f.release_year, f.title, ca.name
FROM film f
INNER JOIN film_category fc 
ON fc.film_id = f.film_id
INNER JOIN category ca
ON ca.category_id = fc.category_id
WHERE ca.category_id = 1 OR ca.category_id = 2; 

--hocanın yaptığı
SELECT f.release_year AS release, f.title, c.name
FROM category AS c
INNER JOIN film_category AS fc 
ON c.category_id = fc.category_id
INNER JOIN film AS f
ON f.film_id = fc.film_id
WHERE c.name in ('Action','Animation'); 



-- Film kiralama ödemesini en yakın tarihte yapan müşterilerin adı, soyadını ve ödeme tarihini listeleyen sorgu
SELECT c.first_name, c.last_name, p.payment_date
FROM customer c
INNER JOIN payment p
ON p.customer_id = c.customer_id
WHERE p.payment_date IN 
(SELECT payment_date FROM payment
WHERE payment_date > '2007-05-13' 
ORDER BY payment_date DESC);

--hocanın yaptığı
SELECT c.first_name, c.last_name, p.payment_date
FROM customer AS c
INNER JOIN payment AS p
ON c.customer_id = p.customer_id
WHERE to_date(to_char(payment_date, 'DD/MM/YYYY'), 'DD/MM/YYYY') = 
(SELECT MAX(to_date(to_char(payment_date, 'DD/MM/YYYY'), 'DD/MM/YYYY')) FROM payment);



-- P ve P'den sonraki harflerle başlayan ve stokta bulunmayan filmleri listeleyen sorgu
SELECT * FROM film f
WHERE f.film_id NOT IN 
(SELECT i.film_id FROM inventory i) 
AND (f.title LIKE 'P%' OR f.title LIKE 'Q%' OR f.title LIKE 'R%' OR f.title LIKE 'S%' OR f.title LIKE 'T%' 
OR f.title LIKE 'U%' OR f.title LIKE 'V%' OR f.title LIKE 'W%' OR f.title LIKE 'X%' OR f.title LIKE 'Y%' OR f.title LIKE 'Z%');

--Bu sorunun alternatif çözümü, (bir arkadaşla beraber araştırdık):
SELECT * FROM film f
WHERE f.film_id NOT IN 
(SELECT i.film_id FROM inventory i) 
AND f.title ~ E'^[p-zP-Z].*';

--hocanın yaptığı
SELECT * FROM film AS f
LEFT JOIN inventory as i
ON f.film_id = i.film_id
WHERE i.film_id IS NULL AND f.title >= 'P%'
ORDER BY f.title;



--B harfi ile başlayan müşterileri, film kiralamak için ödedikleri toplam miktarları ile birlikte listeleyen sorgu
SELECT c.customer_id AS Kullanıcı_IDsi, c.first_name AS AD, round(SUM(p.amount), 2) AS Toplam_Ödeme_Miktarı
FROM payment p 
INNER JOIN customer c
ON c.customer_id = p.customer_id
WHERE c.first_name LIKE 'B%'
GROUP BY c.customer_id, c.first_name
ORDER BY c.first_name;

--hocanın yaptığı
SELECT c.first_name, c.last_name, SUM(p.amount), 2 AS total_amount
FROM payment AS p 
INNER JOIN customer AS c
ON c.customer_id = p.customer_id
GROUP BY c.first_name, c.last_name
HAVING c.first_name LIKE 'B%'
ORDER BY total_amount;

