public class Outsidepractice {
    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public static int sumDouble(int a, int b) {
        int sum = a+b;
        if(a == b){
            return sum*=2;
        }else{
            return sum;
        }

    }
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n){
        int diff= n-21;
        if(n > 21){
            return diff *2;
        }else{
            return diff;
        }
    }

    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static boolean makes10(int a, int b) {
        int sum= a+b;
        if(a ==10){
            return true;
        }else if(b == 10){
            return true;
        }else if(sum==10){
            return true;
        }else{
            return false;
        }
    }
    // or we could do a shorthand way and do
    // public boolean makes10(int a, int b) {
    //  return (a == 10 || b == 10 || a+b == 10);
    //}

    public static void main(String[] args) {

        System.out.println("sumDouble() = " + sumDouble(9,9));
        System.out.println("diff21() = " + diff21(100));
        System.out.println("parrotTrouble(true,7) = " + parrotTrouble(true, 7));
        System.out.println("makes10(9,10) = " + makes10(9, 10));
    }


}
