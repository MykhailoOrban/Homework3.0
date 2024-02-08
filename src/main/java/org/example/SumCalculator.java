package org.example;

public class SumCalculator {
    public static int sum(int a) throws IllegalArgumentException {
        int result = a;
        if(a>0){
            while(a>0){
                result += a-1;
                a--;
            }
        }
        else {
            throw new IllegalArgumentException("Zero is Zero");
        }
        return result;

    }

    public static void main(String[] args) throws IllegalArgumentException {
        SumCalculator sm = new SumCalculator();
        System.out.println(sm.sum(9));
    }
}