package board_infinity.fundamentals_java_programmin;

class Person {
    private String firstName;
    private String lastName;
    private int Age;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Adrián");
        person.setLastName("Constandse");
        person.setAge(27);
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
    }
}
