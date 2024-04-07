package org.dataStructure.linkedList;

public class LinkedListImp {
    static  class Node{
        public Integer val;
        public Node next;
        public  Node (int val){
            this.val = val;
        }
    }
    private  Node start;
    private  Node end;
    public  void add(int val){
        // 初始新增時
        if(start == null){
            start = new Node(val);
            end = start;
        }
        else {
            // 將原本的next 綁定新的node (當新增第二個值時 start.next 會被指定新的 node)
            end.next = new Node(val);
            // 變更  end  為 next
            end = end.next;
        }
    }
    /**
     * 查詢元素
     */
    public  Integer search(int val){
        if(start == null) return  null;

        Node node = start;
        while (true){
            if(node == null) break;

            if(node.val == val){
                return  node.val;
            }
            node = node.next;
        }
        return  null;
    }
    /**
     * 移除元素
     */
    public void remove(int val){
        /** step01 先查出位置 **/

        // 負責跑回圈的變數
        Node node = start;
        // 目標節點的變數
        Node nodeTarget = null;
        // 先前節點的變數
        Node nodePrev = null;
        // 遍歷 節點看有無符合
        while (true){
            if (node == null) break;

            if(node.val == val){
                nodeTarget = node;
                break;
            }
            //紀錄上一個節點
            nodePrev = node;
            node = node.next;
        }

        if(nodeTarget == null)
            return;

        /** step02 刪除  */
        //  如果目標是 start
        if(nodeTarget == start){
            start = start.next;
        } else{
            // 更新先前節點 綁定目標節點的 下個節點
            nodePrev.next = nodeTarget.next;

        }
    }
}
