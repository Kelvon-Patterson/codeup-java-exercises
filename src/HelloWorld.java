public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello World !");
//
//        //TODO:Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 34;
//    System.out.println("My favorite number is " + myFavoriteNumber);
////TODO:Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//    String myString = "I like Java so far!";
//    System.out.println(myString);

    //TODO:Change your code to assign a character value to myString. What do you notice?

       //myString= 'K';
        //you cannot change the varible once its set
// TODO:Change your code to assign the value 3.14159 to myString. What happens?

        //myString = 3.14159;
        //You cannot reassign variable my string to a number because of the type.

// TODO:Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

     // long myNumber = ;
//        System.out.println(myNumber);
        // Error: java: illegal start of expression
//TODO:Change your code to assign the value 3.14 to myNumber. What do you notice?

//        myNumber= 3.14;

        //here i cannot reassign a value with no number maybe because it's a float?
//TODO:Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

      //  myNumber =  123L;

        // Here the value is assigned because I have the proper type with that matches the description of the "Long" type with a following "L" after.
//TODO:Change your code to assign the value 123 to myNumber.

      //  myNumber= 123;

// this variable is never used because it has already been declared higher in the scope.
//TODO:Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does

        //Because the number has a floating point. It does not meet the type requirements.
// TODO:Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        //float myNumber= 3.14F;

        //Here we are using the same variable name therefore it will not be declared properly.
// TODO:Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //Here since x is already defined we get this error: -- java: variable x is already defined in method main(java.lang.String[])
        // TODO:  What is the difference between the above code blocks? Explain why the code outputs what it does.
        // In our first code block we increment after x is ran vise-versa for the second code block.
        //TODO: Try to create a variable named class. What happens?
//            class =  main;

            //we get an unexpected token, an identifier can also not be one of the reserved words in Java. Words reserved by the Java language that may not be used as an identifier are called reserved words, or keywords
        //TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //TODO: Copy and paste the code above and then run it. Does the result match with your expectation?
// the local variable theNumberThree is redundant
        //the object 'o' is redundant
        //Error = Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:70)
        //TODO:  How is the above example different from the code block below?

        //the code is declared as a integer. not initally declared as a string but a string is ran so i dont believe it will compile.

//        int three = (int) "three";
       //TODO:  What are the two different types of errors we are observing?
            //incompatible types and class errors
        //TODO: Rewrite the following expressions using the relevant shorthand assignment operators:


//        int x = 4;
//        x = x + 5;
//          x+=x

//        int x = 3;
//        int y = 4;
//        y = y * x;
//          y*=x
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        // x /=y
        //y-=x
        //TODO: What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //the value runs an error we can only use casting to assign a value of a less precise data type to a variable whose types is of a higher precision, or going from a more specific to a less specific type.(implicit)
        //or going from a less specific type to a more specific type, or going from a higher precision type to a lower precision type(explicit)
        //TODO: Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

    }
}
