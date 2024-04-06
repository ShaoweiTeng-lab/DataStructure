package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

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
    }
}