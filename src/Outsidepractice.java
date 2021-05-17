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
            return Math.abs(diff* 2);
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
//    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    public static String notString(String str) {
        if(str.startsWith("not")){
            return str;
        }else{
            return "not " + str;
        }
    }
    //Given a string, return a new string where the first and last chars have been exchanged.
    public static String frontBack(String str) {
        if(str.length() < 2){
            return str;
        }
        char[] ch =  str.toCharArray();

        char temp = ch[0];

        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;

        return String.valueOf(ch);



    }
    //Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    public static String front3(String str) {

if(str.length()>=3) {
    String firstThreeLetters = str.substring(0,3);
    return firstThreeLetters.repeat(3);
}else{
    return str+str+str;
}
}
//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    public static String backAround(String str) {
        if(str.length()<2){
            return str+str+str;
        }else{
            char [] ch= str.toCharArray();

            char last = ch[ch.length-1];

            return last + str + last;
        }
    }
    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    public static boolean or35(int n) {
        if(n % 3==0 || n % 5 ==0){
            return true;
        }else{
            return false;
        }
    }
//    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    public  static String front22(String str) {
        if(str.length() > 2){
            String firstTwo = str.substring(0,2);
            return firstTwo + str + firstTwo;
        }else{
            return str + str + str;
        }
    }
//Given a string, return true if the string starts with "hi" and false otherwise.
public static boolean startHi(String str) {
    return str.startsWith("hi");
}
//Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public static boolean icyHot(int temp1, int temp2) {
    return (temp1<0 && temp2 > 100)|| (temp1>100 && temp2 < 0);
}
    public static void main(String[] args) {

        System.out.println("sumDouble() = " + sumDouble(9,9));
        System.out.println("diff21() = " + diff21(100));
        System.out.println("parrotTrouble(true,7) = " + parrotTrouble(true, 7));
        System.out.println("makes10(9,10) = " + makes10(9, 10));
        System.out.println(notString("is not"));
        System.out.println("frontBack(\"code\") = " + frontBack("code"));
        System.out.println(front3("a"));
        System.out.println(backAround("read"));
        System.out.println(or35(100));
        System.out.println(front22("kitten"));
        System.out.println(startHi("hilarious"));
        System.out.println(icyHot(-1,100));
        
    }


}
