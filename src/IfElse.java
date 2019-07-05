import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int score = scanner.nextInt();
        if (score >= 9.0)
            System.out.print("Excellent!");
        if (score >= 8.5)
            System.out.print("A!");
        else if (score >= 7.0)
            System.out.print("B!");
        else if (score >= 5.5)
            System.out.print("C!");
        else if (score >= 4.0)
            System.out.print("D!");
        else
            System.out.print("F!");
    }


}
