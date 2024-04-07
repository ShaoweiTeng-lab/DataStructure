package org.dataStructure.array;

import org.dataStructure.array.ArrayImp;


public class ArrayMain {

    public static void main(String[] args) {
        testArray ();
    }

    public static  void testArray (){
        ArrayImp arrayImp = new ArrayImp(5);
        /** 新增在最後 時間複雜度 o(1) **/
        arrayImp.addByValue(9);
        arrayImp.addByValue(7);
        arrayImp.addByValue(11);
        arrayImp.addByValue(10);
        arrayImp.addByValue(37);

        /** 新增時因長度滿 需更改 長度  時間複雜度為 o(1) + expand o(n)**/
        arrayImp.addByValue(77);


        /** 新增在特定index , 需將其他元素向右移動,時間複雜度： o(n) **/
        int i_add = 1;
        arrayImp.addByIndex(i_add, 51);

        /** 查詢在特定value ,時間複雜度： o(n) **/
        int va1001 = arrayImp.searchByValue(10);

        /** 查詢在特定index ,時間複雜度： o(1) **/
        int va1002= arrayImp.searchByIndex(3);

        /*** remove by value 時間複雜度：  o(n) **/
        arrayImp.removeByValue(77);
        /*** remove by index 時間複雜度：  o(n) **/
        int iRemove = 3;
        arrayImp.removeByIndex(iRemove);


    }
}