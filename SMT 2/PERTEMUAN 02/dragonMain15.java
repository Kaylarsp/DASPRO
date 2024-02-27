import java.util.Scanner;

public class dragonMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dragon15 dragon = new dragon15(3, 5);
        
        while (true) {
            System.out.println();
            System.out.println("\nMove dragon");
            System.out.println("\n1. Move right\n2. Move left\n3. Move up\n4. Move down\n0. Exit");
            System.out.print("\nEnter number : ");
            int number = sc.nextInt();

            System.out.println();

            switch (number) {
                case 1:
                    dragon.moveRight();
                    break;
                case 2:
                    dragon.moveLeft();
                    break;
                case 3:
                    dragon.moveUp();
                    break;
                case 4:
                    dragon.moveDown();
                    break;
                default:
                System.exit(0);
                    break;
            }
            dragon.printPosition();
        }
    }
}
