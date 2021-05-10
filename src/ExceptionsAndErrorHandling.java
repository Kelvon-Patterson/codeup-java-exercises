public class ExceptionsAndErrorHandling {

    //We can throw an exception!

    public static void main(String[] args)
            throws Exception {
//        throw new Exception("This has broken down! Exception!");
//        System.out.println("Will we see this ? :( Probably not right - top to bottom, this exception is above us down here , what do you think?");

        //try{
        //something that might go wrong}
        //catch(Exception e) {
        //handle the error}
// an example of an array exception:
        try{
            System.out.println("Let's see...");
            int result = 1/0;
            System.out.println("I can divide by zero!");
        }catch (ArithmeticException e){
            System.out.println("User attempted to divide by zero");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }catch(Exception e){
            // Expand down the line = moving towards less specificity with each catch block
        }

        int[] numbers = {1,2,3};
        int x;
        try{
            x = numbers[100];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
            x=0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("This will always run [For example : I have completed the operation message");
        }

        //Real Life scenario
      /*  try{
            //to connect to the database to get all of the user info
        }catch(SomethingWrongWithDBConnection connectionFailed){
            //of connection to Db failed: what's out game plan? ?
            //printStackTrace for the db connection failing
            //sout a message to myself: check DB connection - connection failed
        }*/
    }
}
