import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class CollectionsPractice {

    public static String upperLastElement(ArrayList<String> cohortMember){
      String last=  cohortMember.get(cohortMember.size()-1);

        if (cohortMember.isEmpty()) {
            return "";
        } else {
            return last.toUpperCase();
        }

    }



    public static void main(String[] args) {
        ArrayList<String> cohortMember = new ArrayList<>();
        cohortMember.add("Jake");
        cohortMember.add("Shan");
        cohortMember.add("Serg");

        System.out.println("upperLastElement(cohortMember) = " + upperLastElement(cohortMember));


    }
}
