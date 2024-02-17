package Aggregation;
/*
3)	AGGREGATION - “HAS A” Relationship
You will create a Course class that “has a” Instructor and “has a” textbook. The Instructor and textbook should be there own type(That means each is a class).
In the Course class you will instantiate the instructor and textbook objects as needed.
Create a Course Class which holds the following information:
1.	Course name(private String)
2.	An instructors first name, last name and office number. This information is accessed using the setter and getters of the instructor class.
3.	The textbooks title, author and publisher. This information is accessed using the setter and getters of the texbooks class.
4.	Print function that prints out Course name, instructor first and last name and the text book title and author.
5.	Create a driver program to show this information. You can use our course information: Instructor Nima Davarpanah office 3-2636, textbook Clean Code…etc
6.	Now modify the code to have two instructors and two textbooks.
7.	Create a driver program to show this information, make up the other information.
 */
public class AggregationDriver {
    public AggregationDriver() {
        Course course1 = new Course("Great Course On Things");
        course1.displayCourseInformation();
    }
}
