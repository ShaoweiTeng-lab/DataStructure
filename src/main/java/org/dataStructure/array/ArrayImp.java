package org.dataStructure.array;

/**
 * 資料結構Array 實作
 */
public class ArrayImp {
    public Integer[] array;
    private Integer i_end;

    /**
     * 初始化長度
     */
    public ArrayImp(int size) {
        array = new Integer[size];
        i_end = -1;
    }

    /**
     * 透過 index 新增
     *
     * @param i_add 新增index
     * @param val   新增值
     */
    public void addByIndex(int i_add, int val) {
        //長度額滿(i_end 到達 array 的最後 )時 擴增
        if (i_end + 1 == array.length)
            expandSpace();
        if (i_add > i_end + 1 || i_add < 0)
            return;
        // 先向後移動
        for (int i = i_end; i >= i_add; i--) {
            array[i + 1] = array[i];
            array[i] = null;
        }
        //在插值
        array[i_add] = val;
        //變更 i_end index
        i_end++;
    }

    /**
     * 透過 val 新增 在最後
     *
     * @param val 新增值
     */
    public void addByValue(int val) {
        addByIndex(i_end + 1, val);
    }

    /**
     * 透過index 查詢元素
     */
    public Integer searchByIndex(int index) {
        if (index > i_end || index < 0)
            return null;
        return array[index];
    }

    /**
     * 透過 val 查詢元素
     */
    public Integer searchByValue(int value) {
        for (int i = 0; i <= i_end; i++) {
            if (array[i] == value)
                return array[i];
        }
        return null;
    }
    /**
     * 透過 index 移除元素
     */
    public void removeByIndex(int index) {
        if (index > i_end || index < 0)
            return;
        array[index] = null;
        // 往左移
        for (int i = index; i <= i_end; i++) {
            array[i] = array[i+1];
            array[i+1] = null;
        }

        i_end --;
    }

    /**
     * 透過 val 移除元素
     */
    public void removeByValue(int val) {
        // 查出index
        for(int i = 0 ; i <= i_end ; i++){
            if(array[i] == val) {
                removeByIndex(i);
            }
        }
    }


    /**
     * 擴充陣列
     */
    public void expandSpace() {
        Integer[] arrayNew = new Integer[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }

        array = arrayNew;
    }
}
