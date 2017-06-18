import java.util.Scanner;

public class LoopedConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while(condition)
        {
            int i = scanner.nextInt();
            condition = false;
            System.out.println(i * 9 / 5 + 32);
            if (scanner.hasNextInt())
                condition = true;
            else break;
        }
    }
}
