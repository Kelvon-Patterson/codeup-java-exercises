public class Outsidepractice {

    //WARM UP

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
   // Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public static boolean nearHundred(int n){
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

  //  Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

    public static boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a < 0 && b< 0);
        }else{
            return   (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

  //  We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public static String delDel(String str){
       if(str.length()>=4 && str.substring(1,4).equalsIgnoreCase("del")){
           return str.substring(0,1) + str.substring(4);
       }
       return str;
    }

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

//STRINGS
//Given a string and a non-negative int n, return a larger string that is n copies of the original string.


    public static String stringTimes(String str, int n){
        //My solution:
        return str.repeat(n);
        //CODING BAT SOLUTION
        //public String stringTimes(String str, int n) {
        //  String result = "";
        //  for (int i=0; i<n; i++) {
        //    result = result + str;  // could use += here
        //  }
        //  return result;
        //}
    }


//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

    public static String frontTimes(String str, int n) {
//        String firstThree = str.substring(0, 3);
        //MY SECONDARY SOLUTION TO THIS PROBLEM
        String result = "";
        if(str.length() >=3){
            for(int i = 0; i<n; i++){
                result+= str.substring(0,3);
            }
        }else if(str.length() <=2){
            for(int i=0; i<n; i++){
                result+=str;
            }
        }
        return result;
        //MY INITIAL SOLUTION TO THIS PROBLEM
//        if(str.length()<=2){
//            return str.repeat(n);
//        }else{
//            return str.substring(0,3).repeat(n);
//        }
    }

  //  Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    public static int countXX(String str){
        int count = 0;
        for(int i=0; i <str.length(); i++){
            //here we are grabbing the substring at the index of i- i+2 to grab the two charachters in a row at index. the we check to see if it is equal to "xx" and if it is the we increment the count up 1.
            if(str.substring(i,i+2).equalsIgnoreCase("xx")){
                count++;
            }
        }
        return count;
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
        System.out.println(nearHundred(93));
        System.out.println(posNeg(1,-1, false));
        System.out.println(loneTeen(13,99));
        System.out.println(delDel("aadelbb"));
        System.out.println(stringTimes("Hello",5));
        System.out.println(frontTimes("Ab", 3));
        System.out.println(countXX("xxx"));
    }


}
