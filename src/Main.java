public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", "Smith", 25, "123 Main Street");
        Person person2 = new Person("Sam", "Brown", 36, "234 Main Street");
        Student student1 = new Student("Dan", "Williams", 21, "345 Cross Road",
                              "123456789", "Computer Science");

        person1.getDetails();
        System.out.println();
        person2.getDetails();
        System.out.println();
        student1.getDetails();
        System.out.println();
        student1.getDetails(false);
        System.out.println();

        System.out.println("Number of people: " + Person.getPersonCount());
    }
}