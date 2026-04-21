package hundredDays.phase1.day4_GradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your test score 1-10: ");
        int score = sc.nextInt();

        char grade;
        boolean atRisk = score<=6;
        
        if (!(score < 1 || score > 11)) {

            if (score >= 9) {
                grade = 'A';

            } else if (score >= 8) {
                grade = 'B';

            } else if (score >= 7) {
                grade = 'C';

            } else if (score >= 6) {
                grade = 'D';

            } else if(score < 4){
                grade = 'F';
                System.out.println("You failed. try again next year.");

            } else {
                grade = 'F';
            }
        } else {
            System.out.println("You've Cheated! Invalid Score! You are enrolled for the next year.");
            grade = 'F';
            score = 0;
            atRisk = true;
        }
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("At risk: " + atRisk);
    }
}
