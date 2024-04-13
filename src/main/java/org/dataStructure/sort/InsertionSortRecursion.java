package org.dataStructure.sort;

/**插入排序法 遞迴*/
public class InsertionSortRecursion {
    public static void main(String[] args) {
        int [] array = new int[]{10 ,7,11,23,1,0};
        insertionSortRecursion(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    public static void insertionSortRecursion(int [] nums ){
        // 代表迴圈開頭
        int i_start = 0;
        insertionSortRecursionHelp1(nums,i_start);
    }
    /**代表第一層回圈*/

    public static void insertionSortRecursionHelp1(int [] nums , int start){
        //超出範圍
        if(start >= nums.length){
            return;
        }
        //進入第二層遞迴
        int run = start -1;
        insertionSortRecursionHelp2(nums ,run);
        //進入下層回圈
        insertionSortRecursionHelp1(nums, start +1);

    }
    /**代表第二層回圈*/
    public static void insertionSortRecursionHelp2(int [] nums , int j_run){

        if(j_run <0){
            return;
        }
        // 主邏輯： 如果右邊比左邊大 對調
        if(nums[j_run + 1] > nums[j_run]){
            int temp = nums[j_run];
            nums[j_run] = nums[ j_run +1 ];
            nums[ j_run +1 ] = temp;
        }
        else  // 當發現左邊比較大時 中止內部回圈
            return;
        insertionSortRecursionHelp2(nums ,j_run -1);

    }
}
