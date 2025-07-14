# Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

### Formül

Kilo (kg) / Boy(m) * Boy(m)

### Örnek Çıktısı

    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173

---
## Cevap:

    // Create Scanner Object for take values from user
    Scanner scanner = new Scanner(System.in);

    // Take user height (m)
    System.out.print("Boyunuzu(m) giriniz: ");
    double height = scanner.nextDouble();

    // Take user weight (kg)
    System.out.print("Kilonuzu(kg) giriniz: ");
    double weight = scanner.nextDouble();

    // Calculate bmi by formula
    double bmi = weight / ( height * height);

    // Output
    System.out.println("Vücut kitle indeksiniz: " + bmi);

## Çıktı:

    Boyunuzu(m) giriniz: 1.72
    Kilonuzu(kg) giriniz: 105
    Vücut kitle indeksiniz: 35.49215792320173
---
    Boyunuzu(m) giriniz: 1.74
    Kilonuzu(kg) giriniz: 80
    Vücut kitle indeksiniz: 26.42356982428326

