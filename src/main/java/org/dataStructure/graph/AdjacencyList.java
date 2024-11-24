package org.dataStructure.graph;

import java.util.*;

// 鄰接表
public class AdjacencyList {
    // 第一層：Map：
    // 表示每個節點和其鄰接節點列表的對應關
    // 第二層：List：
    // 每個節點的鄰接節點列表是一個一維陣列（List），存儲該節點的鄰接節點

    /**
     * 1 - 2
     * |   |
     * 3 - 4
     * 節點：1, 2, 3, 4
     * 邊：1-2, 1-3, 2-4, 3-4
     * 其鄰接表表示為：
     * {
     *     1 -> [2, 3],
     *     2 -> [1, 4],
     *     3 -> [1, 4],
     *     4 -> [2, 3]
     * }
     * */
    private final Map<Integer, List<Integer>> adjList;

    // 初始化鄰接表
    public AdjacencyList() {
        adjList = new HashMap<>();
    }

    // 添加邊（無向圖）
    public void addEdge(int u, int v) {
        // 用來在指定鍵（Key）不存在時才插入一個值（Value）。如果鍵已經存在，則不會覆蓋原有的值
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // 無向圖
    }

    // 獲取某節點的所有鄰接節點
    public List<Integer> getNeighbors(int u) {
        return adjList.getOrDefault(u, new ArrayList<>());
    }

    // 列出所有節點
    public void printAllNodes() {
        System.out.println("All nodes in the graph:");
        for (int node : adjList.keySet()) {
            System.out.println(node);
        }
    }

    // 列出所有邊
    public void printAllEdges() {
        System.out.println("All edges in the graph:");
        Set<String> visited = new HashSet<>(); // 避免無向圖重複列出邊
        for (int u : adjList.keySet()) {
            for (int v : adjList.get(u)) {
                String edge = u + "-" + v;
                String reverseEdge = v + "-" + u;
                if (!visited.contains(edge) && !visited.contains(reverseEdge)) {
                    System.out.println(edge);
                    visited.add(edge);
                }
            }
        }
    }

    // 刪除邊
    public void removeEdge(int u, int v) {
        if (adjList.containsKey(u)) {
            adjList.get(u).remove(Integer.valueOf(v));
        }
        if (adjList.containsKey(v)) {
            adjList.get(v).remove(Integer.valueOf(u));
        }
    }

    // 刪除節點
    public void removeNode(int u) {
        if (adjList.containsKey(u)) {
            for (int neighbor : adjList.get(u)) {
                adjList.get(neighbor).remove(Integer.valueOf(u)); // 移除與該節點相連的邊
            }
            adjList.remove(u);
        }
    }

    // 打印整個鄰接表
    public void printGraph() {
        System.out.println("Adjacency List of the graph:");
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (int neighbor : adjList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
