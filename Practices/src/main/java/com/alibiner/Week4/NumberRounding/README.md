# Ödev - Sayı Yuvarlama (OPSİYONEL)
Kullanıcının girdiği ondalıklı bir sayıyı aşağı, yukarı ve en yakın tam sayıya yuvarlayarak ekrana yazdıran kodu yazınız.

    Input: 5.7
    
    Output:
    
    Aşağı Yuvarlama: 5
    
    Yukarı Yuvarlama: 6
    
    En Yakın Tam Sayı: 6

# Cevap: 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ondalıklı bir sayı giriniz: ");
    double inputValue = scanner.nextDouble();

    double floorValue = Math.floor(inputValue);
    double ceilValue = Math.ceil(inputValue);
    double roundedValue = Math.round(inputValue);

    System.out.println("Aşağı Yuvarlama: " + (long) floorValue);
    System.out.println("Yukarı Yuvarlama: " + (long) ceilValue);
    System.out.println("En Yakın Tam Sayı: " + (long) roundedValue);

### Çıktı:
    Ondalıklı bir sayı giriniz: 5.7
    Aşağı Yuvarlama: 5
    Yukarı Yuvarlama: 6
    En Yakın Tam Sayı: 6