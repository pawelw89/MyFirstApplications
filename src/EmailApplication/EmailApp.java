package EmailApplication;

public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Stefan", "Ryba");

        email1.setAlternateEmail("stefanryba@gmail.com");
        System.out.println("Your alternate email is: " + email1.getAlternateEmail());

        System.out.println(email1.showInfo());
    }
}
