package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array={4,56,18,30,50,22,98};
        for(int i=0;i<array.length;i++ ){
            if (i%2!=0) array[i]=array[i]*array[i-1];
            System.out.println(array[i]);
        }
    }
}
