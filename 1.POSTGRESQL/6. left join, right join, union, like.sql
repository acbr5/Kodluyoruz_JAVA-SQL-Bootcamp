-- LEFT JOIN

-- Left join'de A kümesi ve A ve B kesişim verilerini kapsar. Left Outer Join'de sadece A'nın içerisindeki değerleri kapsar. Kesişim kümesi dahil değil. Right Outer Join'de de kesişim kümesi dahil olmamak üzere B kümesini kapsar. Full Outer Join tüm kesişim kümesini, A ve B kümelerini kapsar.


--tabloloları görüntüleyelim:
SELECT * FROM ilk_raf;
SELECT * FROM ikinci_raf;

-- LEFT JOIN
-- ilk raftaki elemanlar + ilk_raf ve ikinci_raf'ın ortak elemanları
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
LEFT JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi;
	
	
--LEFT OUTER JOIN 
-- Sadece soldaki tablo değerleri (kesişim dahil değil)
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
LEFT JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi
WHERE ikinci.kitap_no IS NULL;


-- RIGHT JOIN
-- Kesişim kümesi + sağdaki küme elemanları
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
RIGHT JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi;


-- RIGHT OUTER JOIN
-- Sadece sağdaki tablonun elemanları (kesişim dahil değil)
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
RIGHT JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi
WHERE ilk.kitap_no IS NULL;


-- FULL OUTER JOIN
-- İki kümenin kesişim dahil tüm verileri:
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
FULL OUTER JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi; 

-- ikinci kullanımı:
-- İki kümenin kesişim hariç tüm verileri:
SELECT 
	ilk.kitap_no,
	ilk.kitap_adi,
	ikinci.kitap_no,
	ikinci.kitap_adi
FROM ilk_raf AS ilk
FULL OUTER JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi
WHERE ilk.kitap_adi IS NULL OR ikinci.kitap_adi IS NULL; 

-- UNION KAVRAMI
-- İki tablodaki verileri direkt birleştiriyoruz. Tekrar eden veriler tek bir kayıt olarak görünür. Matematikteki birleşim yapısı gibidir. UNION ALL işleminde de iki tablodaki veriler birleşir fakat aynı kayıtlar tekrar ederek gösterilir. İki tablodan seçilen kolonların sayısı eşit olmalı. Örneğin aşağıdaki sorguda SELECT ile çekilen kolon sayıları her iki tablo için de eşit olmalıdır.

SELECT tablo_1_kolonlar, ...
FROM tablo_1
UNION
SELECT tablo-2_kolonlar, ...
FROM tablo_2;

SELECT kitap_adi, kitap_no
FROM ilk_raf
UNION
SELECT kitap_adi, kitap_no
FROM ikinci_raf;



-- LIKE
-- Karakter dizisi ile sınırlama işlemi yapılır. Büyük harf küçük harf duyarlılığı vardır. Duyarlılığı görmezden gelmek için LIKE yerine ILIKE kullanılır. Aşağıdaki ilk örnek s ile başlayan kitapları getirir: Tek bir karakter için _ , çok karakter için %

SELECT * FROM ilk_raf
WHERE kitap_adi LIKE 's%' 

SELECT * FROM ilk_raf
WHERE kitap_adi LIKE '_üzükler%'

SELECT * FROM ilk_raf
WHERE kitap_adi NOT LIKE '_her%'

-- Eğer tablo varsa oluşturmaz:
CREATE TABLE IF NOT EXIST ilk_raf(...);	