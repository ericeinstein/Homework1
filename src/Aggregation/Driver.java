package Aggregation;

public class Driver {
    public static void main(String[] args) {
        Instructor nimaDavarpanah = new Instructor();
        nimaDavarpanah.setFirstName("Nima");
        nimaDavarpanah.setLastName("Davarpanah");
        nimaDavarpanah.setOfficeNumber("3-2636");

        Instructor lanYang = new Instructor();
        lanYang.setFirstName("Lan");
        lanYang.setLastName("Yang");
        lanYang.setOfficeNumber("8-345");

        Textbook cleanCodeTextBook = new Textbook();
        cleanCodeTextBook.setTitle("Clean Code");
        cleanCodeTextBook.setAuthorName("Robert C. Martin");
        cleanCodeTextBook.setPublisher("Prentice Hall");

        Textbook textbook2 = new Textbook();
        textbook2.setTitle("Concepts of Programming Languages");
        textbook2.setAuthorName("Robert W. Sebesta");
        textbook2.setPublisher("Pearson");

        Course cs4800 = new Course();
        Course cs4080 = new Course();

        cs4800.setCourseName("CS 4800 - Software Engineering");
        cs4080.setCourseName("CS 4080 - Concepts of Programming Languages");

        cs4800.setInstructor(nimaDavarpanah);
        cs4080.setInstructor(lanYang);

        cs4800.setTextbook(cleanCodeTextBook);
        cs4080.setTextbook(textbook2);

        cs4800.printCourseInfo();
        cs4080.printCourseInfo();
    }
}
