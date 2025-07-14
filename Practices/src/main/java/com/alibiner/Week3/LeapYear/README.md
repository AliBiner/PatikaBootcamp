# Pratik - Artık Yıl Hesaplama
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

### Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

### Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

- 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.

100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

- Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

##### Not:
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

Senaryo

    Yıl Giriniz : 2020
    2020 bir artık yıldır !
---
    Yıl Giriniz : 2021
    2021 bir artık yıldır değildir!

# Cevap:

### Algoritma: 

1. Kullanıcıdan yıl değeri istenir.

2. Durum - Eğer Yılın 4'e bölümünden kalan sıfır ise; 
   1. Durum: Eğer Yılın 400'e bölümünden kalan sıfır ise, ekrana (yıl + " artık yıldır! ") yazılır.

    2. Durum: Eğer Yılın 400'e bölümünden kalan sıfır değilse ve Yılın 100'e bölümünden kalan sıfır ise, ekrana (yıl + " artık yıl değildir! ") yazılır.

   3. Durum:  Eğer Yılın 400'e bölümünden kalan sıfır değilse ve Yılın 100'e bölümünden kalan 0 değilse, ekrana (yıl + " artık yıldır! ") yazılır.
3. Durum - Eğer Yılın 4'e bölümünden kalan sıfır değilse  ekrana (yıl + " artık yıl değildir! ") yazılır.

### Kod:

    // Create a Scanner object to read data from console
    Scanner scanner = new Scanner(System.in);

    // Ask user to enter a year
    System.out.print("Yıl giriniz : ");
    int year = scanner.nextInt(); // Read year as integer

    // Check if the year is divisible by 4
    if (year % 4 == 0){
        // If year is divisible by 400, it is a leap year
        if (year % 400 == 0)
            System.out.println(year +  " Artık yıldır.");

        // If year is divisible by 100 but not by 400, it's not a leap year
        else if (year % 100 ==0)
            System.out.println(year + " Artık yıl değildir.");

        // If year is divisible by 4 but not by 100, it's a leap year
        else
            System.out.println(year + " Artık yıldır.");
    }
    // If year is not divisible by 4, it's not a leap year
    else
        System.out.println(year + " Artık yıl değildir.");

### Çıktı:
      Yıl giriniz : 2020
      2020 Artık yıldır.
---
      Yıl giriniz : 2021
      2021 Artık yıl değildir.
---
      Yıl giriniz : 1600
      1600 Artık yıldır.
---
      Yıl giriniz : 1700
      1700 Artık yıl değildir.