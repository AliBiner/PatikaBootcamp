# Ödev - Birbirine En Yakın 2 Sayıyı Bulma
Integer veri tipinde bir ArrayList oluşturunuz ve içerisine 10 adet benzersiz ve pozitif eleman ekleyiniz. Bu listteki elemanlardan birbirine en yakın iki elamanı veren kodu yazınız.

# Cevap


    int firstClosestNumber = 0;
    int secondClosestNumber = 0;
    int distanceFromEachOther = Integer.MAX_VALUE;
    for (Integer outerIndex : array){
        for (Integer innerIndex : array){
            int tmpDistance = Math.abs(innerIndex - outerIndex);
            if (tmpDistance<distanceFromEachOther && tmpDistance!=0){
                distanceFromEachOther = tmpDistance;
                firstClosestNumber = outerIndex;
                secondClosestNumber = innerIndex;
            }
        }
    }