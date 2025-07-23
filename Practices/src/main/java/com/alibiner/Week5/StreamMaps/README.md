# Ödev - Map içindeki Entry'leri Satır Satır Yazdırma
Bir Java Map (HashMap, TreeMap veya LinkedHashMap) içindeki tüm key-value çiftlerini ekrana her satırda bir entry olacak şekilde yazdıran bir program yazınız.

Kurallar:

- Map türü HashMap<String, Integer> olarak tanımlanacaktır.
- Keyler (String), value’ler (Integer) olacaktır.
- Her bir giriş (entry) ayrı bir satırda olacak şekilde ekrana yazdırılacaktır.
- Map’e en az 5 farklı giriş (key-value pair) eklenmelidir.


Örnek Girdi (Map İçeriği):

    Map<String, Integer> scores = new HashMap<>();
    
    scores.put("Ali", 85);
    
    scores.put("Ayşe", 92);
    
    scores.put("Mehmet", 78);
    
    scores.put("Zeynep", 90);
    
    scores.put("Burak", 88);

Beklenen Çıktı:

    Ali = 85
    
    Ayşe = 92
    
    Mehmet = 78
    
    Zeynep = 90
    
    Burak = 88

# Cevap:

Beklenen çıktı incelendiğinde kayıtların map'e eklenme sırasına göre ekrana yazdırılması isteniyor. Bu nedenle giriş sırasına göre sıranan LinkedHashMap veya TreeMap kullanılabilir. HashMap kullanımında çıktı beklenenden farklı olacaktır.

