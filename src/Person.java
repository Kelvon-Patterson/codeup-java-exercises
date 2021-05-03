public class Person {

    private String name;



    public String getName(){
    //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
    //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.println(" Hello " + name);
    }

    public Person (String name){
        this.name= name;
    }
    public static void main(String[] args){
        Person amirah = new Person("Amirah");
        amirah.sayHello();
        amirah.setName("Todd");
        amirah.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// false
//        System.out.println(person1 == person2);//true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//Evaluates to true;

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//John
//        System.out.println(person2.getName());//John
//        person2.setName("Jane");//sets name to Jane
//        System.out.println(person1.getName());//John-- I was wrong here since the Person person2 = person1; it will set the name to Jane and not John.
//        System.out.println(person2.getName());//Jane


    }
}
