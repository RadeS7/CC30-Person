public class Main {

    public static void main(String[] args) {

        Person person = new Person();

    person.setFirstName("Rade");
    person.setLastName("Stojakovic");
    person.setAge(42);
        System.out.println("full name is " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("");
        System.out.println("full name is " + person.getFullName() );

    }
}
