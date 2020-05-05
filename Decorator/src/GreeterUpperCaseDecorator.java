public class GreeterUpperCaseDecorator implements Greeter {
    private Greeter gr;

    public GreeterUpperCaseDecorator(Greeter gr) {
        this.gr=gr;
    }

    @Override
    public String greet(String firstname , String lastname ) {
        return  String.format("%s, %s" , firstname.toUpperCase(), lastname.toUpperCase());
    }

}
