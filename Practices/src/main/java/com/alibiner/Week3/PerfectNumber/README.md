# Ödev - Mükemmel Sayı Bulan Program
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

### Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

### Senaryolar
    Bir sayı giriniz: 28
    28 Mükemmel sayıdır
    Bir sayı giriniz: 1
    1 Mükemmel sayı değildir.
    Bir sayı giriniz: 496
    496 Mükemmel sayıdır

### Algoritma:

    long sum = 0;
    for (int i = 1; i < input; i++) {
        if (input%i == 0)
        sum += i;
    }

    if (sum == input)
        System.out.println(input + " Mükemmel sayıdır.");
    else
        System.out.println(input + " Mükemmel sayı değildir.");

### Çıktı:
    Bir sayı giriniz: 496
    496 Mükemmel sayıdır.