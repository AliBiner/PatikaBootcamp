# Ödev - Ters Üçgen Yapımı
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

### Örnek
Basamak Sayısı : 10

    *******************
    *****************
    ***************
    *************
    *********** 
    ********* 
    ******* 
    ***** 
    *** 
    *

### Algoritma:
    for (int i = 0; i < range; i++) {
        for (int j = (range-i)*2-1; j > 0; j--) {
            System.out.print("*");  
        }
        System.out.println();
    }

### Çıktı:

    *******************
    *****************
    ***************
    *************
    ***********
    *********
    *******
    *****
    ***
    *