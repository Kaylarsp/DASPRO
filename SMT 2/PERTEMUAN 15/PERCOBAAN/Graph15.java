public class Graph15 {
    int vertex;
    DoubleLinkedList15 list[];
    int[][] matriks;

    public Graph15(int v) {
        vertex = v;
        matriks = new int[v][v];
        list = new DoubleLinkedList15[v];
        for (int i = 0; i < v; i++) {
            list[i] =new DoubleLinkedList15();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }
        // undirected graph:
        // list[tujuan].addFirst(asal, jarak);
        
    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' +asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' +asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + (totalIn + totalOut));

        // undirected graph
        // System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) +" ("+ list[i].getJarak(j) +"m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean adjacent(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            try {
                if (list[asal].get(i) == tujuan) {
                    System.out.print("Gedung "+ (char) ('A' + i) + " dan " + (char) ('A' + tujuan) + " bertetangga " + "\n");
                    return true;
                } else {
                    System.out.print("Gedung "+ (char) ('A' + i) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga " + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        matriks[asal][tujuan] = jarakBaru;
    }

    public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }
}