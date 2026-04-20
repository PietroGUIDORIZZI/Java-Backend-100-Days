package hundredDays.phase1.day5_FizzBuzz_StarPyramid;

public class FizzBuzz_StarPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        for (int row = 1; row <= 5; row++) {
            for (int space = 0; space < 5 - row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

