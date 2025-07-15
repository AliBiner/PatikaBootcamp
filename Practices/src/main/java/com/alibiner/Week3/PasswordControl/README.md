# Ödev
Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.

1. En az 8 karakter içermeli
2. Space karakteri içermemeli
3. İlk harf büyük harf olmalı,
4. Son karakteri ? olmalı

# Cevap:

    Scanner scanner = new Scanner(System.in);

    System.out.print("Şifre giriniz: ");
    String password = scanner.nextLine();

    char firstLetter = password.charAt(0);
    char lastLetter = password.charAt(password.length()-1);

    if (password.length()<8)
        System.out.println("Geçersiz Şifre");
    else if (password.contains(" ")) 
        System.out.println("Geçersiz Şifre");
    else if (!Character.isUpperCase(firstLetter)) 
        System.out.println("Geçersiz Şifre");
    else if (!Character.valueOf('?').equals(lastLetter))
        System.out.println("Geçersiz Şifre");
    else
        System.out.println("Geçerli Şifre");

### Çıktı: 

    Şifre giriniz: A12 3456789?
    Geçersiz Şifre
---
    Şifre giriniz: a123456789?
    Geçersiz Şifre
---
    Şifre giriniz: A123456789
    Geçersiz Şifre
---
    Şifre giriniz: A123?
    Geçersiz Şifre
---
    Şifre giriniz: A12345678?
    Geçerli Şifre