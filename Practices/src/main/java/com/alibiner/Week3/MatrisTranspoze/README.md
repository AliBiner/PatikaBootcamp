# Ödev
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.





Senaryo

    Matris :
    2    3    4    
    5    6    4    
    Transpoze :
    2    5    
    3    6    
    4    4


Matris :
    1    2    3    
    4    5    6    
    Transpoze :
    1    4    
    2    5    
    3    6  

---
# Cevap:

### Algoritma:
- Kullanıcıdan matris'in satır sayısını iste
- Kullanıcıdan matris'in sütun sayısını iste
- Kullanıcıdan alınan değerler ile içi boş bir 2 boyutlu dizi oluştur.
- iç içe for ile bu içi boş dizinin tek tek index'lerine git ve kullanıcıdan bu diziyi doldurmasını iste
- Dizi dolduktan sonra iç içe döngü ile dizinin matris'ini bul.
- ekrana yazdır

### Kod: 
    Scanner scanner = new Scanner(System.in);

    // ask the user to enter a row count of matrix
    System.out.print("Dizinin satır sayısını giriniz: ");
    int row = scanner.nextInt();

    // ask the user to enter a column count of matrix
    System.out.print("Dizinin sütun sayısını giriniz: ");
    int column = scanner.nextInt();

    // Instance an 2D array (matrix) by take input from user
    int[][] array = new int[row][column];

    // ask the user to fill value of 2D array(matrix)
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            System.out.print( i + 1 + ". satır " + (j + 1) + ". sütun değerini giriniz. ");
            array[i][j] = scanner.nextInt();
        }
    }

    //Find the transpose of the 2D array (matrix)
    int [][] transpoze = new int[column][row];
    for (int i = 0; i < array[0].length; i++) {
        for (int j = 0; j < array.length; j++) {
            transpoze[i][j] = array[j][i];
        }
    }

    //Matrix output
    System.out.println("Matris: ");
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length ; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }

    // Transpose output
    System.out.println("Transpoze: ");
    for (int i = 0; i < transpoze.length; i++) {
        for (int j = 0; j < transpoze[i].length; j++) {
            System.out.print(transpoze[i][j] + " ");
        }
        System.out.println();
    }

### Çıktı:
    Dizinin satır sayısını giriniz: 3
    Dizinin sütun sayısını giriniz: 3
    1. satır 1. sütun değerini giriniz. 1
    1. satır 2. sütun değerini giriniz. 2
    1. satır 3. sütun değerini giriniz. 3
    2. satır 1. sütun değerini giriniz. 4
    2. satır 2. sütun değerini giriniz. 5
    2. satır 3. sütun değerini giriniz. 6
    3. satır 1. sütun değerini giriniz. 7
    3. satır 2. sütun değerini giriniz. 8
    3. satır 3. sütun değerini giriniz. 9
    Matris:
    1 2 3
    4 5 6
    7 8 9
    Transpoze:
    1 4 7
    2 5 8
    3 6 9
