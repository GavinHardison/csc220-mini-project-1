public class Person {
    //instance variables
    String firstName;
    String lastName;
    int age;
    String Address;

    static int personCount;
    //constructor
    public Person(String firstName, String lastName, int age, String Address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.Address = Address;
        personCount++;
    }
    //getDetails method
    public void getDetails(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + Address);
    }
    //getters/setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    //getPersonCount method
    static public int getPersonCount() {
        return personCount;
    }
}
