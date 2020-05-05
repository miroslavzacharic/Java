
public class GreeterImpl implements Greeter{

    @Override
    public String greet(String firstname , String lastname) {

        return String.format("%s, %s",firstname, lastname);
    }
}
