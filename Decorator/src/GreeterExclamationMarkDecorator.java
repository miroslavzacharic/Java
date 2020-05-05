public class GreeterExclamationMarkDecorator implements Greeter {
    private Greeter gr;

    public GreeterExclamationMarkDecorator(Greeter gr) {
        this.gr = gr;
    }

    @Override
    public String greet(String lastname, String firstname) {
        return String.format("%s, %s",lastname,firstname+ "!!!");
    }
}
