package org.dataStructure.graph;
//鄰接矩陣
public class AdjacencyMatrix {
    private int[][] matrix;
    private int size;

    public AdjacencyMatrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void addEdge(int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1; // 無向圖
    }

    public boolean hasEdge(int i, int j) {
        return matrix[i][j] == 1;
    }
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printEdges() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println("Edge between Node " + i + " and Node " + j);
                }
            }
        }
    }

    public void printNeighbors(int node) {
        System.out.print("Neighbors of Node " + node + ": ");
        for (int j = 0; j < matrix[node].length; j++) {
            if (matrix[node][j] == 1) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

}

