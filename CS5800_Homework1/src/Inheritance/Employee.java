package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setSocialSecurityNumber(String newSocialSecurityNumber) {
        this.socialSecurityNumber = newSocialSecurityNumber;
    }


}
