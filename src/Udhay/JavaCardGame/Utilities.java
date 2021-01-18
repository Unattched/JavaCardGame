package Udhay.JavaCardGame;

import java.util.stream.IntStream;

public class Utilities {
    static int getRandom(int max){
        return (int) (Math.random()*max); // returns 0 <= n < max
    }
    static CardMethods[] removeIndex(CardMethods[] array, int index) {
        CardMethods[] newArray = new CardMethods[array.length -1];

        for(int i = 0, k = 0; i < array.length; i++) {
            if(index == i) {
                continue;
            }
            newArray[k++] = array[i];
        }

        return newArray;
    }
}
