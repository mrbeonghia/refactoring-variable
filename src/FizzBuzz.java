import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isBuzz && isFizz) return "FizzBuzz ";
        if (isFizz) return "Fizz ";
        if (isBuzz) return "Buzz ";
        return number + " ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int num = scanner.nextByte();
        for (int i = 1; i <= num; i++) {
            System.out.print(fizzBuzz(i));
        }
    }
}
