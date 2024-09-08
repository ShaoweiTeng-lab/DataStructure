package org.dataStructure.sort;

import org.dataStructure.util.PrintUtil;

/**
 * 選擇排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 100, 23, 17, 2, 11, 31};
        selectionSort(array);
        PrintUtil.printIntArray(array);
    }

    /**
     * 這段程式碼實現的是選擇排序法 (Selection Sort) 的一種變體。
     *
     * 選擇排序的核心概念是從數列中找到最小（或最大）的元素，然後將其放在已排序數列的最前面。這段程式碼中的邏輯與選擇排序非常相似，但有所不同：
     *
     * 外層迴圈 (i) 控制當前正在比較的數字。
     * 內層迴圈 (j) 用於遍歷數列並比較元素。
     * 當 num[j] > num[i] 時，它會交換 num[i] 和 num[j]，即將較小的數字移到前面。
     * */
    public static void selectionSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[j] > num[i]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

}
