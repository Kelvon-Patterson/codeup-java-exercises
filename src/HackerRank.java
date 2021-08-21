import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerRank {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;

    }




    static int B;
    static int H;
    static boolean flag = true;

    static{
        Scanner scanner = new Scanner(System.in);
        B= scanner.nextInt();
        H=scanner.nextInt();
        scanner.close();


        try{
            if(B<=0 || H <=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);

        }
    }
    int n = 100;
    String s = Integer.toString(n);

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder input = new StringBuilder();

        input.append(A);
        input.reverse();

        if(A.equalsIgnoreCase(String.valueOf(input))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en","IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a += b;

                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.print("\n");
        }
        in.close();


        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.

        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("================================");
        for (i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
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

        for (i = 0; i < 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
        bufferedReader.close();
    }
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
        String pattern = in.nextLine();
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
        testCases--;
    }

//    Scanner scan = new Scanner(System.in);
//    int t =scan.nextInt();
//    for(int i=0; i<t; i++)
//    {
//
//        try
//        {
//            long x=sc.nextLong();
//            System.out.println(x+" can be fitted in:");
//            if(x>=-128 && x<=127)System.out.println("* byte");
//            if(x>=-32768 && x<=32767)System.out.println("* short");
//            if(x>= (int)Math.pow(-2,31) && x<= (int)Math.pow(2,31))System.out.println("* int");
//            if(x>= (long) Math.pow(-2,63) && x<= (long)Math.pow(2,63))System.out.println("* long");
//            //Complete the code
//        }
//        catch(Exception e)
//        {
//            System.out.println(scan.next()+" can't be fitted anywhere.");
//        }
//
//    }
//    Scanner sc = new scan(System.in);
//    int counter = 1;
//
//        while(scan.hasNext())
//                System.out.print(counter + " " + scan.nextline());
//    counter++;
//}
//        sc.close();

    static boolean isAnagram(String a, String b) {
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }else{
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }


}


