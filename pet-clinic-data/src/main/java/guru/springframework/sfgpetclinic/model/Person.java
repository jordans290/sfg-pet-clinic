package guru.springframework.sfgpetclinic.model;

public class Person {
    private String firstName;
    private String lastName;

    //Press command "n" to open a shortcut to create getters and setters
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
}
