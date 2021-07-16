import java.util.Scanner;

public class wayToLongWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            String input = scanner.next();
            int l = input.length();
            if (input.length() >10){
                input =  input.charAt(0)+""+(l-2) + input.charAt(l-1);
                System.out.println(input);
            }else{
                System.out.println(input);
            }
        }


    }

}
