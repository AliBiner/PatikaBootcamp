# Pratik - Uçak Bilet Fiyatı Hesaplama

Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

- Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

### İpucu

    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
    Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
    İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
    Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
    Toplam Tutar = (135-27)* 2 = 216 TL

### Senaryolar

##### Senaryo 1

    Mesafeyi km türünden giriniz : 1500
    Yaşınızı giriniz : 20
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
    
    Toplam Tutar = 216 TL
##### Senaryo 2

    Mesafeyi km türünden giriniz : -500
    Yaşınızı giriniz : 1
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
    
    Hatalı Veri Girdiniz !
##### Senaryo 3

    Mesafeyi km türünden giriniz : 200
    Yaşınızı giriniz : 35
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
    
    Toplam Tutar = 20.0 TL

---

# Cevap:

### Yapılan İşlemler:

1- İşlemlerin kontrol edilebilmesi ve daha rahat geliştirilebilmesi için 3 adet sınıf + 1 adet enum oluşturuldu.

- Flight Sınıfı: Bu sınıf aracılığı ile her uçusun kendine özel bir mesafesi ve mesafe başı ücretlendirmesi oluşturuldu. Bu sadece birden fazla uçuş oluşturulmak istenebilir ve her uçusun kendi ücreti olur. (ileride uçuş tarihi, uçusun nereden nereye gideceği gibi özellikler eklenebilir.)
- Passenger Sınıfı: Birden fazla yolcu verisi olmasına karşın oluşturulmuştur. Bu sınıf sayesinde her yolcu oluşturulduğunda yolcu ile ilgili kontrolleri burada sağlayabiliriz. Örneğin negatif yaş girememesi gibi. (ileride yolcuya ait ekstra bilgiler eklenebilir. Örn; isim, doğum tarihi, cinsiyet gibi)
- FlightDirection Enum'ı: bu enum sayesinde seferin yönünü kolaylıkla tutabilir ve buna göre kontroller sağlayabiliriz.
- FlightTicket Sınıfı: Bu sınıf aracılığı ile her yolcu ve her sefer kombinasyonu için kolaylıkla bilet oluşturulabilir. bilet ile ilişkili yolcu(Passenger) ve uçuş (Flight) durumlarına göre fiyatlandırma hesaplanır. (ileride ekstra indirim kampanyaları ve özellikleri eklenebilir.)

### Sınıfların Özellikleri:
##### Flight Sınıfı:
1- Sabitler
- pricePerKm
2- Değişkenler
- distance
3- Method'lar:
- Flight(pricePerKm) // Constructor - instance edilirken pricePerKm değerini alır ve ekstra olarak kullanıcıdan distance değerini otomatik olarak ister.
- calcFlightPrice() // distance * pricePerKm değerini döndürür.

##### Passenger Sınıfı:
1- Değişkenler
- age
2- Method'lar
- Passenger() // Constructor - instance edildiğinde otomatik olarak console'dan yolcunun yaşını alır ve değerin pozitif olup olmadığını kontrol eder.

##### FlightTicket Sınıfı:
1- Değişkenler
- passenger (Passanger Sınıf ile ilişki kurulur)
- flight (Flight Sınıfı ile ilişki kurulur)
- flightDirection (FlightDirection Enum'ı ile ilişki kurulur)
2- Method'lar
- FlightTicket(passenger, flight) // Constructor - instance edildiğinde Passenger ve Flight nesneleri ister ve otomatik olarak kullanıcıdan uçuş yönü seçtirir.
- calculateDiscountForAge() // bu method ile yolcunun yaşına göre kampanya uygulanır.
- calcTotalPrice() // bu method ile indirim miktarına ve uçuş yönüne göre final bilet tutarı hesaplanır. String türünde değer döner.

##### Main Sınıfı ile tüm yapının oluşturulması ve kullanımı:
    Passenger passenger = new Passenger(); // Kullanıcıdan otomatik olarak yaşını ister.
    Flight flight = new Flight(0.10f); // km başı ücret olarak 0.10 TL atanmış olur ve kullanıcıdan otomatik olarak uçuş mesafesini ister.
    FlightTicket flightTicket = new FlightTicket(passenger,flight); // passenger ve flight nesneleri ile bilet oluşturur. Kullanıcıdan otomatik olarak uçul yönünü ister.
    System.out.println(flightTicket.calcTotalPrice()); // flightTicket nesnesindeki niteliklere göre uçusun indirimler dahil son fiyatını ekrana yazar.




### Çıktı:
    Yaşınızı (pozitif değer) giriniz : 35
    Mesafeyi km türünde (pozitif değer) giriniz: 200
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
    Toplam Tutar = 20.0 TL