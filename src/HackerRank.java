import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.

        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for( i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        N = 2;

        for( i = 0; i < 10; i++){
           int result = N*i;
            System.out.println(N + " x " + i +" = " + result );
        }
        bufferedReader.close();
    }
}
