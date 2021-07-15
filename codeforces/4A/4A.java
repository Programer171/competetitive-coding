package FourA;

import java.util.Scanner;

public class FourA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if (input%2 == 0){
            System.out.println("YES");
            System.exit(0);
        }else{
            System.out.println("NO");
            System.exit(0);
        }
    }
}
