public class Main {
    public static void main(String[] args) {
        Greeter greeter = new GreeterImpl();
        System.out.println(greeter.greet("jonas" , "jonaitis"));

        Greeter greeter2 =new GreeterUpperCaseDecorator(new GreeterImpl());
        System.out.println(greeter2.greet("Petras" , "ensteinas"));

        Greeter greeter3 =new GreeterExclamationMarkDecorator(new GreeterImpl());
        System.out.println(greeter3.greet("Elton" , "John"));


    }

}
