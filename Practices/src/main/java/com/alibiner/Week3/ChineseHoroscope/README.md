# Pratik - Çin Zodyağı Hesaplama
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

## Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

## Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

### Senaryo

    Doğum Yılınızı Giriniz : 1990
    Çin Zodyağı Burcunuz : At

---

# Cevap:

### Algoritma:
- Kullanıcıdan doğum yılı istenir.
- Doğum yılının 12'ye göre mod'u alınır ve "mod" değişkene atanır.
- Switch-case ile "mod" değişkeni kontrol edilir.
- Hangi burca denk geliyorsa ekrana yazdırılır.

### Kod:
        // Create a Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their birth year
        System.out.println("Doğum yılınızı giriniz: ");
        int birthYear = scanner.nextInt();

        // Calculate the remainder when birth year is divided by 12
        byte mod = (byte) (birthYear % 12);

        // Define an empty string for the Chinese horoscope
        String horoscope = "";

        // Find the horoscope animal according to the remainder
        switch (mod){
            case 0 :
                horoscope = "Maymun";
                break;
            case 1 :
                horoscope = "Horoz";
                break;
            case 2 :
                horoscope = "Köpek";
                break;
            case 3 :
                horoscope = "Domuz";
                break;
            case 4 :
                horoscope = "Fare";
                break;
            case 5 :
                horoscope = "Öküz";
                break;
            case 6 :
                horoscope = "Kaplan";
                break;
            case 7 :
                horoscope = "Tavşan";
                break;
            case 8 :
                horoscope = "Ejderha";
                break;
            case 9 :
                horoscope = "Yılan";
                break;
            case 10 :
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                break;

        }

        // Print the horoscope animal name
        System.out.println(horoscope);

### Çıktı:

    Doğum yılınızı giriniz : 1997
    Çin Zodyağı Burcunuz : Öküz
---
    Doğum yılınızı giriniz : 2001
    Çin Zodyağı Burcunuz : Yılan