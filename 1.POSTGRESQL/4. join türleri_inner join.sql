--INNER JOIN:

SELECT * FROM ilk_raf;

SELECT * FROM ikinci_raf;

--Tabloların birleşme kriteri ON'dur. Koşul belirtiriz. Bundan sonra herhangi bir kıstlama yapmak istersek ON'dan sonra WHERE kullanabiliriz.
--ALIAS kullanmadan join sorgusu:

SELECT 
	ilk_raf.kitap_no, 
	ilk_raf.kitap_adi, 
	ikinci_raf.kitap_no, 
	ikinci_raf.kitap_no 
FROM 
	ilk_raf 
INNER JOIN ikinci_raf 
ON ;

--ALIAS (AS) takma isim anlamına gelir. Daha okunaklı ve hangi tabloya ait olduğunu belirtir: 

SELECT 
	ilk.kitap_no, 
	ilk.kitap_adi, 
	ikinci.kitap_no, 
	ikinci.kitap_no 
FROM 
	ilk_raf AS ilk
INNER JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi;

-- tablo adlarına takma isim koyulduğu gibi kolon isimlerine de takma isim koyulabilir. Sorgu sonucunda belirtilen takma isimlerle gösterilir. Where koşulunun içerisinde kolonun kendi adını kullanırız. ALIAS sadece kullanıcıya o şekilde gösterilmesi için kullanılır.

SELECT 
	ilk.kitap_no AS ilk_raftaki_kitap_numarasi, 
	ilk.kitap_adi AS ilk_raftaki_kitap_adi, 
	ikinci.kitap_no ikinci_raftaki_kitap_numarasi, 
	ikinci.kitap_no ikinci_raftaki_kitap_adi
FROM 
	ilk_raf AS ilk
INNER JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi;

-- ON iki tablonun birleşme kriteridir. WHERE kısıtlamasıdır.

SELECT 
	ilk.kitap_no AS ilk_raftaki_kitap_numarasi, 
	ilk.kitap_adi AS ilk_raftaki_kitap_adi, 
	ikinci.kitap_no ikinci_raftaki_kitap_numarasi, 
	ikinci.kitap_no ikinci_raftaki_kitap_adi
FROM 
	ilk_raf AS ilk
INNER JOIN ikinci_raf AS ikinci
	ON ilk.kitap_adi = ikinci.kitap_adi	
WHERE ilk.kitap_no > 2;


