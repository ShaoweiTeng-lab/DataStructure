package org.dataStructure.sort;

/**
 *
 * 氣泡排序
 * */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{10 ,7,11,23,1,0};
        for(int i = 0 ; i< array.length-1 ; i++){
            // 提生效能 ,確立每輪 sort 扣除已經sort 的部分就不用再跑 (右至左)
            for(int j =0 ; j < array.length - i -1 ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[ j +1 ];
                    array[ j +1 ] = temp;
                }
            }
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
