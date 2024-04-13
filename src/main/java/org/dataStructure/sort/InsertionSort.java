package org.dataStructure.sort;

/**
 *
 * 插入排序法
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int [] array = new int[]{10 ,7,11,23,1,0};
        for(int i = 0 ; i< array.length-1 ; i++){
            for(int j = i - 1 ; j >= 0 ; j--){
                if(array[j+1] > array[j]){
                    int temp = array[j];
                    array[j] = array[ j +1 ];
                    array[ j +1 ] = temp;
                }
                else  // 當發現左邊比較大時 中止內部回權
                    break;
            }
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
