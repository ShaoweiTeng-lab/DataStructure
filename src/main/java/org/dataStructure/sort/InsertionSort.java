package org.dataStructure.sort;
/**插入排序*/
public class InsertionSort {
    public static void insertion_sort(int[] nums) {
        for (int i_start = 0; i_start < nums.length; i_start++) {
            for (int j_run = i_start - 1; j_run >= 0; j_run--) {
                if (nums[j_run + 1] > nums[j_run]) {
                    swap(nums,j_run + 1, j_run);
                }else {
                    break;
                }
            }
        }
    }

    public static void insertion_sort_recursion(int[] nums) {

        int i_start = 0;
        insertion_sort_recursion_help01(nums, i_start);

    }

    private static void insertion_sort_recursion_help01(int[] nums, int i_start) {
        /** end condition **/
        if (i_start >= nums.length) {
            return;
        }

        /** main logic **/
        int j_run = i_start - 1;
        insertion_sort_recursion_help02(nums, j_run);

        /** data flow **/
        insertion_sort_recursion_help01(nums, i_start + 1);

    }

    private static void insertion_sort_recursion_help02(int[] nums, int j_run) {
        /** end condition **/
        if (j_run < 0) {
            return;
        }

        /** main logic **/
        if (nums[j_run + 1] > nums[j_run]) {
            swap(nums,j_run + 1, j_run);
        }else {
            return;
        }

        /** data flow **/
        insertion_sort_recursion_help02(nums, j_run - 1);
    }

    private static void swap(int[] nums, int i_left, int i_right) {
        int tmp = nums[i_left];
        nums[i_left] = nums[i_right];
        nums[i_right] = tmp;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{8, 2, 6, 10, 4};
//         insertion_sort(nums);
//
//        System.out.println();

        int[] nums = new int[]{10, 7, 11, 23,1, 0};
        insertion_sort_recursion(nums);
        for(int i : nums){
            System.out.println(i);
        }
        System.out.println();

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
