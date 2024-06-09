public class GraphMatriks15 {
    int vertex;
    int[][] matriks;

    public GraphMatriks15(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung "+ (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+ (char) ('A' + j) + " (" + matriks[i][j] +"m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int node) {
        int inDegreeCount = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegreeCount++;
            }
        }
        return inDegreeCount;
    }

    public int outDegree(int node) {
        int outDegreeCount = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != 0) {
                outDegreeCount++;
            }
        }
        return outDegreeCount;
    }
}