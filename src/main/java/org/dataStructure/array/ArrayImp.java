package org.dataStructure.array;

/**
 * 資料結構Array 實作
 * */
public class ArrayImp {
    public Integer [] array ;
    private Integer i_end;
    /**
     * 初始化長度
     * */
    public  ArrayImp(int size){
        array = new Integer[size];
        i_end = -1;
    }
    /**
     * 透過 index 新增
     * @param  i_add 新增index
     * @param  val 新增值
     * */
    public void addByIndex(int i_add , int val ){
            //長度額滿(i_end 到達 array 的最後 )時 擴增
            if(i_end + 1 == array.length)
                expandSpace();
            if(i_add > i_end+1 || i_add < 0)
                return;
            // 先向後移動
            for(int i = i_end ; i >= i_add ; i--){
                array[i+1] = array[i];
                array[i] = null;
            }
            //在插值
            array[i_add] = val;
            //變更 i_end index
            i_end++;
    }
    /**
     * 透過 val 新增 在最後
     * @param  val 新增值
     * */
    public  void addByValue(int val ){
        addByIndex(i_end + 1 , val);
    }
    /**
     * 擴充陣列
     * */
    public  void expandSpace(){
        Integer[] arrayNew = new Integer[array.length * 2];
        for(int i = 0; i < array.length ; i++){
            arrayNew[i] = array[i];
        }

        array = arrayNew;
    }
}
