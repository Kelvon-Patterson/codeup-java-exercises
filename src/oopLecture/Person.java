package oopLecture;

public class Person {

    public String firstName;
    public String lastName;
    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static long worldPop = 7_860_000_000L;


    public static void main(String [] args){
        Person kelvon = new Person();
        Person vanessa = new Person();
        Person amirah   = new Person();
//        System.out.println( kelvon);

        kelvon.firstName= "Kelvon";
        kelvon.lastName = "Patterson";

//        System.out.println(kelvon.firstName);
//        System.out.println(kelvon.lastName);


        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

//        System.out.println(vanessa.firstName);
//        System.out.println(vanessa.lastName);

        amirah.firstName = "Amirah";
        amirah.lastName = "Beal";



        System.out.println("vanessa.joinsChat()= " + vanessa.joinsChat());
        System.out.println("Kelvon.joinsChat() " + kelvon.joinsChat());

        System.out.println("worldPop = " + Person.worldPop);
        Person.worldPop +=1;// a new person was created, we need to adjust out world population!!

        System.out.println("worldPop = " + Person.worldPop);

        //Hey, we can do this )instanceObject.classField, but ehhh let's try not to
        //DONT USE!!!!
        System.out.println("amirah.worldPop = " + amirah.worldPop);

        //Cannot say Class let me access your unique Object
//        System.out.println("Person.firstName = " + Person.firstName);//This will not compile!!!



    }

}
