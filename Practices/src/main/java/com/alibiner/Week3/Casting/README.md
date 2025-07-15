# Pratik - Tip Dönüşümleri (Casting)
### Soru: 
Java'da tip dönüşümlerini anlamak için bir program yazınız. Bu program, öncelikle kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini istesin. Daha sonra bu tam sayıyı ondalıklı sayıya dönüştürerek ve bu ondalıklı sayıyı tam sayıya dönüştürerek sonuçları ekrana yazdırsın.

### İpucu 1: 
Kullanıcıdan giriş almak için Scanner sınıfını kullanabilirsiniz.

### İpucu 2: 
Tip dönüşümü yapmak için, dönüştürmek istediğiniz tipi parantez içinde öne koyabilirsiniz. Örneğin, double tipindeki bir değişkeni int tipine dönüştürmek için (int) ifadesini kullanabilirsiniz.

### İpucu 3: 
Tam sayıları ondalıklı sayılara dönüştürdüğünüzde, virgülden sonra her zaman .0 olacaktır. Örneğin, 5 tam sayısını double tipine dönüştürdüğünüzde sonuç 5.0 olacaktır.

### İpucu 4: 
Ondalıklı sayıları tam sayılara dönüştürdüğünüzde, virgülden sonraki kısmı kaybedersiniz. Örneğin, 5.99 ondalıklı sayısını int tipine dönüştürdüğünüzde sonuç 5 olacaktır.

Bu ipuçlarını kullanarak, Java'da tip dönüşümlerini uygulamalı bir şekilde gösteren bir program yazabilirsiniz. Bol şanslar!

# Cevap:

### Kod:
    Scanner scanner = new Scanner(System.in);

    System.out.print("Tam sayı giriniz: ");
    int integerNumber = scanner.nextInt();

    System.out.print("Ondalıklı sayı giriniz: ");
    float floatNumber = scanner.nextFloat();

    float integerToFloat = (float) integerNumber;
    System.out.println(integerNumber + " tam sayısının ondalıklı sayıya dönüşümü: " + integerToFloat );

    int floatToInteger = (int) floatNumber;
    System.out.println(floatNumber + " ondalıklı sayısının tam sayıya dönüşümü: " + floatToInteger);

### Çıktı:

    Tam sayı giriniz: 5
    Ondalıklı sayı giriniz: 9.10
    5 tam sayısının ondalıklı sayıya dönüşümü: 5.0
    9.1 ondalıklı sayısının tam sayıya dönüşümü: 9