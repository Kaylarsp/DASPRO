public class gameMain15 {
    public static void main(String[] args) {
        game15 game = new game15();

        // Add points
        game.addPoint(1, "Sungai apa yang paling panjang di dunia?", "sungai nil", 2);
        game.addPoint(2, "232 x 219 = ", "50808", 3);
        game.addPoint(3, "Selalu bertambah tapi tidak pernah berkurang?", "usia", 4);
        game.addPoint(4, "Selalu datang tapi tidak pernah sampai?", "Besok", 5);
        game.addPoint(5, "Rumus gaya?", "m x a", 0);

        game.startGame();
    }
}