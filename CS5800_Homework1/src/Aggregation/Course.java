package Aggregation;

public class Course {
    private String courseName;
    Instructor instructor1 = new Instructor("Jim", "Jones", "A-0101");
    Instructor instructor2 = new Instructor("Steve", "Henson", "A-0102");
    Textbook textbook1 = new Textbook("Good Textbook", "Jim Jones", "Publishing Company 1");
    Textbook textbook2 = new Textbook("Decent Textbook", "Steve Henson", "Publishing Company 2");

    public Course(String newCourseName) {
        this.courseName = newCourseName;
    }

    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseInformation() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor One: " + instructor1.getFirstName() + " " + instructor1.getLastName() + ", Office#: " + instructor1.getOfficeNumber());
        System.out.println("Instructor Two: " + instructor2.getFirstName() + " " + instructor2.getLastName() + ", Office#: " + instructor2.getOfficeNumber());
        System.out.println("Textbook One: " + textbook1.getBookTitle() + ",  Publisher: " + textbook1.getBookPublisher() + ", Author: " + textbook1.getBookAuthor());
        System.out.println("Textbook Two: " + textbook2.getBookTitle() + ",  Publisher: " + textbook2.getBookPublisher() + ", Author: " + textbook2.getBookAuthor());
    }
}
