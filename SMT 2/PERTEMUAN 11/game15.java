import java.util.Scanner;

public class game15 {
    gameNode15 head;

    public void addPoint(int pointId, String question, String answer, int nextPointId) {
        gameNode15 newNode = new gameNode15(pointId, question, answer, nextPointId, null);

        if (head == null) {
            head = newNode;
        } else {
            gameNode15 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        gameNode15 currentNode = head;

        while (currentNode != null) {
            System.out.println("==========================================================");
            System.out.println("Point " + currentNode.pointId);
            System.out.println("Pertanyaan: " + currentNode.question);

            System.out.print("Jawaban: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(currentNode.answer)) {
                System.out.println("Jawaban benar!");
                currentNode = currentNode.next;
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }

        if (currentNode == null) {
            System.out.println("\nSelamat! Anda telah mendapatkan hadiahhh!");
            System.out.println("Hubungi nomor berikut untuk klaim hadiah xxxxx");
        }
    }
}