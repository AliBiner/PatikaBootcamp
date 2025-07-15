# Ödev - Girilen Sayılardan Min ve Max Değerleri Bulma
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo

    Kaç tane sayı gireceksiniz: 4
    Sayıyı giriniz: 16
    Sayıyı giriniz: -22
    Sayıyı giriniz: -15
    Sayıyı giriniz: 100 
    En büyük sayı: 100
    En küçük sayı: -22

## Algoritma:

    int min = 0;
    int max = 0;
    for (int i = 0; i < length; i++) {
        System.out.print( i+1 + ". sayıyı giriniz: ");
        int input = scanner.nextInt();
        if (i==0){
            min = input;
            max = input;
        }
        else {
            if (input > max){
                max = input;
            } else if (input<min) {
                min = input;
            }
        }
    }

## Çıktı:

    Kaç sayı girilecek: 5
    1. sayıyı giriniz: -100
    2. sayıyı giriniz: 500
    3. sayıyı giriniz: 900
    4. sayıyı giriniz: -1500
    5. sayıyı giriniz: 400
    En Küçük Sayı: -1500
    En Büyük Sayı: 900