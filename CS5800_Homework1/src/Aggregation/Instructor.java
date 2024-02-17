package Aggregation;
//An instructors first name, last name and office number. This information is accessed using the setter and getters of the instructor class.
public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String newFirstName, String newLastName, String newOfficeNumber) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.officeNumber = newOfficeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
