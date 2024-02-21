import java.util.Scanner;

public class PemilihanPercobaan2_15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner (System.in);

        float uas, uts, quiz, task;
        double finalscore;

        System.out.println("Enter uas score : ");
        uas = input15.nextFloat();
        System.out.println("Enter uts score : ");
        uts = input15.nextFloat();
        System.out.println("Enter quiz score : ");
        quiz = input15.nextFloat();
        System.out.println("Enter task score : ");
        task = input15.nextFloat();

        finalscore = (uas * 0.4) + (uts * 0.3) + (quiz * 0.1) + (task * 0.2);

        if (finalscore >= 0 && finalscore <= 100) {
                if (finalscore > 80 && finalscore <= 100) {
                System.out.println("Grade : A \nEquivalent value : 4 \nQualified as : Sangat baik ");
            } else if (finalscore > 73 && finalscore <= 80) {
                System.out.println("Grade : B+ \nEquivalent value : 3.5 \nQualified as : Lebih dari baik ");
            } else if (finalscore > 65 && finalscore <= 73) {
                System.out.println("Grade : B \nEquivalent value : 3 \nQualified as : Baik");
            } else if (finalscore > 60 && finalscore <= 73) {
                System.out.println("Grade : C+ \nEquivalent value : 2.5 \nQualified as : Lebih dari cukup ");
            } else if (finalscore > 50 && finalscore <= 60) {
                System.out.println("Grade : C \nEquivalent value : 2 \nQualified as : Cukup ");
            } else if (finalscore > 39 && finalscore <= 50) {
                System.out.println("Grade : D \nEquivalent value : 1 \nQualified as : Kurang ");
            } else {
                System.out.println("Grade : E \nEquivalent value : 0 \nQualified as : Gagal ");
            }
        } else {
            System.out.println("The value you entered is not recognized ");
        }

    }
}
