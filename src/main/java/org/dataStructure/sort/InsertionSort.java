package org.dataStructure.sort;

/**
 *
 * 插入排序法
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int [] array = new int[]{10 ,7,11,23,1,0};
        for(int i_start = 0 ; i_start< array.length-1 ; i_start++){
            for(int j_run = i_start - 1 ; j_run >= 0 ; j_run--){
                if(array[j_run+1] > array[j_run]){
                    int temp = array[j_run];
                    array[j_run] = array[ j_run +1 ];
                    array[ j_run +1 ] = temp;
                }
                else  // 當發現左邊比較大時 中止內部回圈
                    break;
            }
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
