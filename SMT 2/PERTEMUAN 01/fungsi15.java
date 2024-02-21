import java.util.Arrays;

public class fungsi15 {
    public static void main(String[] args) {

        // Flower species names and their available stock in each RoyalGarden area
        String[][] flowerStocks = {
            {"-------------------------------------------------------"},
            {"             |", " Aglonema  |", "Keladi |", "Alocasia |", "Mawar |"},
            {"-------------|------------|--------|----------|-------|"},
            {"RoyalGarden1 |", "    10     |", "   5   |", "   15    |", "  7   |"},
            {"-------------|------------|--------|----------|-------|"},
            {"RoyalGarden2 |", "     6     |", "  11   |", "    9    |", " 12   |"},
            {"-------------|------------|--------|----------|-------|"},
            {"RoyalGarden3 |", "     2     |", "  10   |", "   10    |", "  5   |"},
            {"-------------|------------|--------|----------|-------|"},
            {"RoyalGarden4 |", "     5     |", "   7   |", "   12    |", "  9   |"},
            {"-------------|------------|--------|----------|-------|"},
        };
        System.out.println();
        
        // Print the flower stocks
        // for (tipe_data variabel : array)
        for (String[] flowerStock : flowerStocks) { // access line
            for (String stock : flowerStock) { // access column
                System.out.print(stock + " ");
            }
            System.out.println();
        }

        pendapatan();
        royalGarden4();
    }

    static void pendapatan() {
        // menghitung total pendapatan tiap cabang
        int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
        double totalPendapatan1 = (10 * aglonema) + (5 * keladi) + (15 * alocasia) + (7 * mawar);
        double totalPendapatan2 = (6 * aglonema) + (11 * keladi) + (9 * alocasia) + (12 * mawar);
        double totalPendapatan3 = (2 * aglonema) + (10 * keladi) + (10 * alocasia) + (5 * mawar);
        double totalPendapatan4 = (5 * aglonema) + (7 * keladi) + (12 * alocasia) + (9 * mawar);
        System.out.println("\nTotal pendapatan dari RoyalGarden apabila semua bunga terjual habis : Rp." + totalPendapatan1);
        System.out.println("Total pendapatan dari RoyalGarden apabila semua bunga terjual habis : Rp." + totalPendapatan2);
        System.out.println("Total pendapatan dari RoyalGarden apabila semua bunga terjual habis : Rp." + totalPendapatan3);
        System.out.println("Total pendapatan dari RoyalGarden apabila semua bunga terjual habis : Rp." + totalPendapatan4);
    }

    static void royalGarden4() {
        System.out.println("\nTerdapat pengurangan stok pada RoyalGarden 4, menjadi :\n");

        String[][] royalGarden4 = {
            {"-------------------------------------------------------"},
            {"RoyalGarden4 |", "     4     |", "   5   |", "   12    |", "  4   |"},
            {"-------------------------------------------------------"},
        };

        for (String[] rg4 : royalGarden4) {
            for (String stocks : rg4) {
                System.out.print(stocks + " ");
            }
            System.out.println();
        }
    }
}