import java.util.Locale;
import java.util.Scanner;

record Home(String address, String city, String state, String zipCode) {
    Home(String address, String city, String state, String zipCode) {
        this.address = address.toUpperCase(Locale.ENGLISH);
        this.city = city.toUpperCase(Locale.ENGLISH);
        this.state = state.toUpperCase(Locale.ENGLISH);
        if (zipCode == null) this.zipCode = "unknown";
        else this.zipCode = zipCode;
    }


}

/* class Home {
    private final String address;
    private final String city;
    private final String state;
    private final String zipCode;

    Home(String address, String city, String state, String zipCode) {
        if (zipCode == null) {
            this.zipCode = "unknown";
        } else {
            this.zipCode = zipCode;
        }

        this.address = address.toUpperCase(Locale.ENGLISH);
        this.city = city.toUpperCase(Locale.ENGLISH);
        this.state = state.toUpperCase(Locale.ENGLISH);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Home home = new Home(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(home);
    }
}