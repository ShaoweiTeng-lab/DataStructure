package org.dataStructure.graph;

public class GraphTest {
    public static void main(String[] args) {
        // 測試鄰接矩陣
//        testAdjacencyMatrix();
        // 測試鄰接表
        testAdjacencyList();
    }
    static  void  testAdjacencyMatrix(){
        // 創立[5,5]大小的矩陣
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);
        adjacencyMatrix.addEdge(0,1);
        adjacencyMatrix.addEdge(3,1);
        adjacencyMatrix.addEdge(2,1);
        // 打印整個矩陣
//        adjacencyMatrix.printMatrix();

        // 列出所有邊
//        adjacencyMatrix.printEdges();

        // 查詢某個節點的鄰接節點
        adjacencyMatrix.printNeighbors(1);
    }
    static  void  testAdjacencyList(){
        AdjacencyList graph = new AdjacencyList();

        // 添加邊
        graph.addEdge(0,1);
        graph.addEdge(3,1);
        graph.addEdge(2,1);

        // 打印所有節點
        graph.printAllNodes();

        // 打印所有邊
        graph.printAllEdges();

        // 打印整個鄰接表
        graph.printGraph();

        // 查詢節點的鄰接節點
        System.out.println("Neighbors of node 2: " + graph.getNeighbors(2));

        // 刪除邊
        graph.removeEdge(1, 3);
        System.out.println("\nAfter removing edge 1-3:");
        graph.printGraph();

        // 刪除節點
        graph.removeNode(2);
        System.out.println("\nAfter removing node 2fu:");
        graph.printGraph();
    }
}
