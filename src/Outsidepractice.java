import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
        for(int i=0; i <str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i + 1 )=='x'){
                count++;
            }
        }
        return count;
    }

//    public static boolean doubleX(String str) {
//       for(int i =0; i< str.length()-1;i++){
//           if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
//               return true;
//               break;
//           }
//       }
//
//    }
    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
public static String stringBits(String str) {
    String skipChar ="";
    for(int i =0; i < str.length(); i+=2){
        skipChar+= str.charAt(i);
    }
    return skipChar;
}
    public static String stringSplosion(String str) {
        String result = "";
        String result1="";
        for(int i = 0; i < str.length(); i++){
            result += str.charAt(i);
            result1 += result;
        }
        return result1;
    }

   // Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
   public static boolean mixStart(String str) {
     return str.contains("ix");
    }

   // Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    public static String startOz(String str){
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    //Given three int values, a b c, return the largest.

    public static int intMax(int a, int b, int c){
        if(a > b && a> c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    public static int closer10(int a, int b){
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    public static boolean arrayFront9(int[] nums) {
        int last = nums.length;

        if (last > 4) last = 4;

        for (int i=0; i<last; i++) {
            if (nums[i] == 9)
                return true;
        }

        return false;
    }
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false;
        return str.charAt(i + 1) == 'x';
    }

    public static int divide(int a,int b){
        return a / b;
    }

    public String helloName(String name) {
        return "Hello " + name +'!';
    }
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
    public String makeTags(String tag, String word) {
        return '<'+tag+'>' + word + "</"+tag+'>';

    }
    public String makeOutWord(String out, String word) {
        String frontOut= out.substring(0,2);
        String endOut = out.substring(2);
        return frontOut + word + endOut;


    }
    public String extraEnd(String str) {
        String endTwo = str.substring(str.length()-2);
        return endTwo + endTwo + endTwo;
    }
    public String firstHalf(String str) {
        int half = str.length() / 2;
        return  str.substring(0,half);

    }

    public String withoutEnd(String str) {
        if (str != null && str.length() > 2) {
            str = str.substring(1, str.length() - 1);
            return str;
        }else{
            return "";
        }

    }

    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b+a+b;
        }else{
            return a+b+a;
        }

    }
    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }
    public boolean array123(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public String nonStart(String a, String b){
     String restA = a.substring(1);
     String restB = b.substring(1);
     return restA + restB;

    }

    public String theEnd(String str, boolean front){
   if(front){
       return str.substring(0,1);
   }else{
       return str.substring(str.length()-1);
   }

    }
public int areaOfTriangle(int base, int height){
        return (base*height)/2;
}
    public static int nextEdge(int side1, int side2) {
        return (side1 + side2)-1;
    }
    public static int power(int voltage, int current) {
        return voltage * current;
    }

    public static boolean lessThanOrEqualToZero(int num) {
        if(num <= 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
    public int[] makePi() {
        int [] pi = {3,1,4};
        return pi;
    }
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] maxEnd3(int[] nums) {
        int first = nums[0];
        int last = nums[2];
        int max = Math.max(first,last);
        nums[0]=max;
        nums[1]=max;
        nums[2]=max;
        return nums;
    }
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length-1]};
    }
    public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3)
            return false;
        return !(nums[1] == 2 || nums[1] == 3);
    }
    public int[] makeLast(int[] nums) {

        int newLength = nums.length * 2;
        int[] newArr = new int[newLength];
        newArr[newArr.length - 1] = nums[nums.length - 1];
        return newArr;
    }
    public boolean double23(int[] nums) {
        if(nums.length == 2 && nums[0] ==2 && nums[1] == 2){
            return true;
        }else if( nums.length == 2 && nums[0] == 3 && nums[1] == 3){
            return true;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3){
            nums[1] = 0;
        }else if(nums[1] == 2 && nums[2] == 3){
            nums[2] = 0;
        }
        return nums;
    }
    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length >=1 && a[0] == 1){
            count++;
        } if(b.length >=1 && b[0] == 1){
            count++;

        }
        return count;
    }
    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        if(aSum > bSum ){
            return a;
        }else if(bSum > aSum){
            return b;
        }else {
            return a;
        }
    }
    public int[] makeMiddle(int[] nums) {

        int half = nums.length/2;
        int [] mid = new int[2];
        mid[0] = nums[half-1];
        mid[1] = nums[half];
        return mid;
    }

    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length-1];

        nums[0] = last;
        nums[nums.length -1] = first;
        return nums;
    }
    public int[] plusTwo(int[] a, int[] b) {
        return new int [] {a[0],a[1],b[0],b[1]};
    }
    public int[] midThree(int[] nums) {
        int [] newArr = new int [3];
        int half = nums.length/2;
        newArr[0] = nums[half-1];
        newArr[1] = nums[half];
        newArr[2] = nums[half+1];
        return newArr;
    }
    public int maxTriple(int[] nums) {
        if(nums[0]>nums[nums.length/2]){
            return Math.max(nums[0], nums[nums.length-1]);
        }else {
            return Math.max(nums[nums.length/2], nums[nums.length-1]);
        }

    }
    public int[] frontPiece(int[] nums) {
        if(nums.length >2){
            return  new int []{nums[0], nums[1]};
        }else{
            return nums;
        }
    }
    public boolean unlucky1(int[] nums) {
        if(nums.length >= 2 && nums[0] == 1 && nums[1] == 3){
            return true;
        }else if(nums.length >= 2 && nums[1] ==  1 && nums[2] == 3){
            return true;
        }else if(nums.length >= 2 && nums[nums.length-2] == 1 && nums[nums.length-1] == 3){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {



//        System.out.println("sumDouble() = " + sumDouble(9,9));
//        System.out.println("diff21() = " + diff21(100));
//        System.out.println("parrotTrouble(true,7) = " + parrotTrouble(true, 7));
//        System.out.println("makes10(9,10) = " + makes10(9, 10));
//        System.out.println(notString("is not"));
//        System.out.println("frontBack(\"code\") = " + frontBack("code"));
//        System.out.println(front3("a"));
//        System.out.println(backAround("read"));
//        System.out.println(or35(100));
//        System.out.println(front22("kitten"));
//        System.out.println(startHi("hilarious"));
//        System.out.println(icyHot(-1,100));
//        System.out.println(nearHundred(93));
//        System.out.println(posNeg(1,-1, false));
//        System.out.println(loneTeen(13,99));
//        System.out.println(delDel("aadelbb"));
//        System.out.println(stringTimes("Hello",5));
//        System.out.println(frontTimes("Ab", 3));
//        System.out.println(countXX("xxxx"));
//        System.out.println(stringBits("Heeololeo"));
//        System.out.println(stringSplosion("Code"));
//        System.out.println(mixStart("mix snacks"));
//        System.out.println(mixStart("pix snacks"));
//        System.out.println(mixStart("piz snacks"));
//        System.out.println(startOz("ozymandias"));
//        System.out.println(startOz("bzoo"));
//        System.out.println(startOz("oxx"));
//        System.out.println(intMax(1,2,3));
//        System.out.println(intMax(-3,-1,-2));
//        System.out.println(arrayFront9(int [] ={1, 2, 9, 3, 4});
    }


}
