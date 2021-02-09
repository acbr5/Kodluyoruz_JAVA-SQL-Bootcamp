-- Dvdrental veritabanı pgadmin'e eklendikten sonra o veritabanı için ayrı bir Query Tool açılır.

SELECT * FROM actor;

SELECT first_name, last_name FROM actor;

SELECT title, release_year FROM film;

SELECT a.first_name, a.last_name, f.title, f.release_year
FROM film_actor fa
INNER JOIN actor a,
ON a.actor_id = fa.actor_id
INNER JOIN film f
ON f.film_id = fa.film_id;

-- ORDER BY ifadesi
-- tablodaki belirli bir kolona göre sıralama yapmak için kullanılır. Bir ya da birden fazla kolon için sıralama yapılabilir. (azalan/artan). Default olarak artan sırada gelir.

--A'dan Z'ye sıralama yapar.Artan sıralama ile:
SELECT f.title, f.release_year 
FROM film f
ORDER BY f.title ASC;

-- Azalan sıra ile:
SELECT f.title, f.release_year 
FROM film f
ORDER BY f.title DESC;


-- Bir örnek veri eklendikten sonra sıralayalım:

INSERT INTO public.film(title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost, rating, last_update)
	VALUES ('Yürüyen Şato', 'Film Detayları', '2004', 1, 4, 4.99, 52, 20.85, 'G', '2020-01-04:22:35');
	
-- Film adına ve tarihine göre azalan sırada sıralama
-- İlk verilen parametreye göre hareket eder ama yılı da title'ı da azalan sırada sıralar.

SELECT f.title, f.release_year 
FROM film f
ORDER BY f.title DESC, f.release_year DESC;

-- LIMIT 
-- Yapılan select sorgusunda gelen kayıtların sayısında kısıtlama yapmak için kullanılır

SELECT kolonlar, ...
..
FROM tablo_adi
ORDER BY siralama_ifadesi
LIMIT satir_sayisi;

-- Aktördeki verileri soyada göre artan sırayla sıralar ve gelen sonuçların ilk 10 tanesini gösterir.

SELECT * 
FROM actor
ORDER BY last_name
LIMIT 10;

-- LIMIT, OFFSET anahtar kelimesi ile birlikte kullanılabilir. Origini sıfır değil verilen offsett değeri olarak ayarlar. Örneğin 3'ten başlayarak sonraki 10 tanesini görüntüler.

SELECT * FROM film
ORDER BY title
LIMIT 4 OFFSET 3;

-- GROUP BY
-- veri setindeki verileri istenilen bir kolona göre gruplandırmak için kullanılır.(rengi siyah olan telefonlar). Veri kümelerini gruplamak, bir veya birden fazla tabloyu gruplara bölmek için kullanılır.

SELECT title 
FROM film
GROUP BY title;


SELECT A.first_name, F.title, round(AVG(F.release_year))
FROM film_actor AS FA
INNER JOIN actor AS A
ON A.actor_id = FA.actor_id
INNER JOIN film AS F
ON f.film_id = FA.film_id
GROUP BY A.first_name, F.title;










