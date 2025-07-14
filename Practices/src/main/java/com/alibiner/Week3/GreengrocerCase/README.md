# Pratik - Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

##### Meyveler ve KG Fiyatları

- Armut : 2,14 TL
- Elma : 3,67 TL
- Domates : 1,11 TL
- Muz: 0,95 TL
- Patlıcan : 5,00 TL

##### Örnek Çıktı;

- Armut Kaç Kilo ? :0
- Elma Kaç Kilo ? :1
- Domates Kaç Kilo ? :1
- Muz Kaç Kilo ? :2
- Patlıcan Kaç Kilo ? :3
- Toplam Tutar : 21.68 TL
---
# Cevap:

### Yapılan işlemler:

1- GreengrocerCase ve Product isminde 2 sınıf oluşturuldu.

2- Product sınıfının nitelikleri:
##### Sabitler
- name
- pricePerKg

##### Değişkenler
- weight

3- Product sınıfının methodları:
- Product (name,pricePerKg) // constructor - Product sınıfı instance edildiğinde name ve pricePerKg değerlerini oluşturur. weight değişkenine 0 değeri verilir.
- getName() // sınfın name niteliğini getirir.
- getPricePerKg() // sınıfın pricePerKg niteliğini getirir.
- getWeight() // sınıfın weight niteliğini getirir.
- setWeight() // sınıfın weight 
- calculateTotal() // Product nesnesinin sahip olduğu weight ile pricePerKg değerini çarpar ve geriye float tipinde bir değer döner.

4- GreengrocerCase Sınıfının nitelikleri:
##### Sabitler
- products (List<Product>) kullanıcıdan aldığımız bilgileri product listesine eklemek için kullanılır.

5- GreengrocerCase Sınıfının Methodları:
- GreengrocerCase() // Constructor - products (List<Product>) niteliğine ürünleri (elma,muz,...) eklemek için kullanılır. 

- collectWeightsFromUser() // Kullanıcıdan products (List<Product>) listesine göre ilişkili product'ların weight değerleri alınır ve Product.setWeight() methodu ile değerler atanır.

- calculateTotalPrice() // foreach ile products(List<Product>) listesindeki her eleman için Product.calculateTotal() methodu çalışır ve dönen sonuçların toplamı hesaplanır.


### Çıktı: 

    Armut Kaç Kilo ? : 0
    Elma Kaç Kilo ? : 1
    Domates Kaç Kilo ? : 1
    Muz Kaç Kilo ? : 2
    Patlıcan Kaç Kilo ? : 3
    Toplam Tutar : 21.68 TL