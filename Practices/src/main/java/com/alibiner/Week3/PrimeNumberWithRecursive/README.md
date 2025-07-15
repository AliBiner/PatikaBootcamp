# Ödev - Asal Sayı Bulan Program
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

Senaryo

    Sayı Giriniz : 22
    22 sayısı ASAL değildir !
---

    Sayı Giriniz : 2
    2 sayısı ASALDIR !
---

    Sayı Giriniz : 39
    39 sayısı ASAL değildir !
---

    Sayı Giriniz : 17
    17 sayısı ASALDIR !

### Algoritma:
    public static boolean isPrimeNumber(int number, int count,int temp){
        if (number%temp==0)
            count++;
        if (count>2)
            return false;
        else if (temp==1 && count == 2)
            return true;
        else {
            return isPrimeNumber(number,count,--temp);
        }
    }

### Çıktı: 

    Sayı giriniz: 11
    11 sayısı ASALDIR !

---

    Sayı giriniz: 12
    12 sayısı ASAL değildir !