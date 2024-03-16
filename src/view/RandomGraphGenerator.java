package src.view;

import java.util.*;

public class RandomGraphGenerator {
    public int[][] adjacencyMatrix;
    public int numNodes;

    public RandomGraphGenerator(int numNodes) {
        this.numNodes = numNodes;
        adjacencyMatrix = new int[numNodes][numNodes];
    }

    public void generateRandomGraph() {
        System.out.println("Generating random graph...");
        Random random = new Random();
        for (int i = 0; i < numNodes; i++) {
            for (int j = i + 1; j < numNodes; j++) {
                if (random.nextDouble() < 0.5) {
                    adjacencyMatrix[i][j] = 1;
                    adjacencyMatrix[j][i] = 1;
                }
            }
        }
    }

    public void printGraph() {
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
