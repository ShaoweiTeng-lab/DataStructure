package org.dataStructure.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        for(int i = 0; i < 20 ; i++){
            System.out.println(fibonacci(i));
        }
    }
    public static  Integer fibonacci(int n){
        if(n == 0 ) return 0;
        if(n == 1) return 1;
        return fibonacci(n-2)+fibonacci(n-1);
    }
}
