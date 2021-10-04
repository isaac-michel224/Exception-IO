public class ExceptionExample {

    //here we have a try block
    //this code will be attempted but is denoted
    //as having the possiblity of throwing an exception
public static void main(String[] args) {
    try {
        throw new Exception();
        //any code below where the exception is explicity thrown
        //is considered unreachable
        //System.out.println("Can you read this code?");
    } catch (Exception e) {
        System.out.println("Looks like an exception was thrown :(");
        e.printStackTrace();
    } finally {
        System.out.println("This statement will always be seen!");
    }
}
}
