package Lesson5;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int [] numbers = {7, 0, 5, 9, 1, 2, 4};
        boolean isSorted = true;
        int i = 0;
        do {isSorted = true;
            for (int j=1; j<numbers.length-i; j++){
                if (numbers[j-1]<numbers[j]){
                    int tmp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=tmp;
                    isSorted=false;
                }
            }
            i++;
        }
        while (!isSorted);
        System.out.println(Arrays.toString(numbers));
    }
}