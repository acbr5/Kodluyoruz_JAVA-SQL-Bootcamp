-- INTERSECT
-- İki sorgunun sonucunda kesişen ifadeleri getirir. farklı iki sql sorgusundan çıkacak olan aynı sonuçları getirir
-- inner joinde kolon kesişimi yapar, intersectte veri kesişimi yapar

SELECT kitap_adi, kitap_no
FROM ilk_raf
INTERSECT
SELECT kitap_adi, kitap_no
FROM ikinci_raf


--IN
-- Listedeki değerleri içeren kayıtları gösterir (1 nolu kitap var mı? varsa göster gibi). Kullanımı:

SORGUMUZ
...
WHERE kolon_adi IN (deger1,deger2,deger3,..);

kolon_adi = deger1 ya da kolon_adi=deger2 ise

-- Alternatif Kullanımı:

SORGUMUZ
...
WHERE kolon_adi IN (SELECT kolon_adi FROM tablo_adi)

-- NOT IN
SORGUMUZ
...
WHERE kolon_adi NOT IN (deger1,deger2,deger3,..)
deger1, deger2 ya da deger3 olmayan kayıtları getirir.

-- Önce kayıtları görelim:
SELECT * FROM products;

-- Sorgu yazalım:
SELECT * FROM products
WHERE price IN (5.00,20.21);

SELECT * FROM products
WHERE price NOT IN (25);

-- BETWEEN
-- belirli bir değer aralığına düşen kayıtları görüntülemek için kullanılır. Where koşulunda kullanılır

SORGUMUZ
..
WHERE kolon_adi BETWEEN alt_sinir AND ust_sinir;

-- ust sinir >= kolon_adi >= alt_sinir

--NOT BETWEEN: iki değer arasında olmayan kayıtları görüntüler

WHERE kolon_adi NOT BETWEEN alt_sinir AND ust_sinir;

SELECT * FROM products
WHERE price BETWEEN 10 AND 30;

-- TOPLAMA FONKSİYONLARI

-- Belirli bir kolon değeri için kayıtların sayısını, ortalamasını, toplamlarını gösteren Toplama Fonksiyonları vardır.

-- AVG(): ortalama
-- COUNT(): toplam kayıt sayısı
-- SUM(): seçilen kolondaki değerler toplamı
-- MAX(): seçilen tablodaki maximum değer
-- MIN(): seçilen tablodaki minimum değer

SELECT AVG(price)
FROM products;

SELECT SUM(price)
FROM products;

SELECT AVG(price), SUM(price)
FROM products;

SELECT COUNT(*)
FROM products;

-- Fiyatı 5 ile 20 olan kayıtların sayısını döndür
SELECT COUNT(*)
FROM products
WHERE price IN(5,20);

SELECT MAX(price)
FROM products;

SELECT MIN(price)
FROM products;

-- Alt Sorgu: select sorgusunun içerisinde tekrar bir select sorgusu tanımlanması 

-- maksimum değere sahip ürünün ismini
SELECT name FROM products
WHERE price = (SELECT MAX(price) FROM products);

-- round(): değeri yuvarlamak için kullanılır. noktadan sonra 2 değer göstermek için:
SELECT round(AVG(price), 2)
FROM products;



 













