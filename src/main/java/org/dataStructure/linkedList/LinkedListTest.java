package org.dataStructure.linkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // 初始化
        LinkedListImp linkedListImp = new LinkedListImp();
        // 新增值 o(1)
        linkedListImp.add(9);

        linkedListImp.add(10);

        linkedListImp.add(17);

        linkedListImp.add(23);

        linkedListImp.add(15);

        linkedListImp.add(31);

        linkedListImp.add(33);

        linkedListImp.add(37);

        linkedListImp.add(39);

        // 查詢 o(n)
        int val = linkedListImp.search(17);

        // 刪除 o(n)
        linkedListImp.remove(17);
    }
}
