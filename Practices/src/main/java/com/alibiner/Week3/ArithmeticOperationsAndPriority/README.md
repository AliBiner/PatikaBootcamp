# Pratik - Aritmetik İşlemler ve İşlem Önceliği
### Soru: 
Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın. İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

### Örnek: 
Kullanıcıdan alınan sayılar 10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun. İşlemleri kullanıcı girmeyecek olup kodunuzda yazmış olmalısınız.

#### İpucu 1: 
Kullanıcıdan veri almak için `Scanner` sınıfını kullanabilirsiniz.

#### İpucu 2: 
Sonucu ekrana yazdırmak için `System.out.println()` metodunu kullanabilirsiniz.

Bol şanslar!

---

### Cevap:

    // Create Scanner Object for take input from user
    Scanner scanner = new Scanner(System.in);

    // Take 3 numbers for user (a,b,c)
    System.out.print("1. Sayıyı giriniz: ");
    int a = scanner.nextInt();
    System.out.print("2. Sayıyı giriniz: ");
    int b = scanner.nextInt();
    System.out.print("3. Sayıyı giriniz: ");
    int c = scanner.nextInt();

    // calculate result by operation priority
    int result = a + b * c - b;

    // Output result
    System.out.println("Sonuç: " + result);

    // Close scanner
    scanner.close();

### Çıktı: 

    1. Sayıyı giriniz: 10
    2. Sayıyı giriniz: 2
    3. Sayıyı giriniz: 3
    Sonuç: 14 // 10 + 2 * 3 - 2
---
    1. Sayıyı giriniz: 20
    2. Sayıyı giriniz: 10
    3. Sayıyı giriniz: 50
    Sonuç: 510 // 20 + 10 * 50 - 10

