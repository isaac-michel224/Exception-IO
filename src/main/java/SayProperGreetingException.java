public class SayProperGreetingException extends Exception {

String greeting;
    public void SayProperGreetingException(String greeting) {
        this.greeting = greeting;
        System.out.println(greeting + "is not an apporopriate greeting. ");
    }

    public String sayHello() {
        return greeting;
    }

}






