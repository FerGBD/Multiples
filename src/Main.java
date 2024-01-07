import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Type the first number:");
        int A = sc.nextInt();
        System.out.print("Type the second number:");
        int B = sc.nextInt();

            if(A % B == 0 || B % A ==0){
                System.out.println("They are multiples numbers");
            }else{
                System.out.println("They are not multiple numbers");
            }

     sc.close();
    }
}