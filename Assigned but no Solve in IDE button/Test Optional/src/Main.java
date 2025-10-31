import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String message = null; // it may be null

        Optional<String> optMessage = Optional.ofNullable(message);

        System.out.println(optMessage.isPresent()); // true or false
    }
}