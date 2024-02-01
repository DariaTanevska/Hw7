package hw7;

public class Hw7ex3t2 {
    public static void main(String[] args) {
        Hw7ex3.Konspet konspet = new Hw7ex3.Konspet("Daria Tanevska", "QA", 65, 2024, "Blue", "DAN.IT");
        System.out.println("Student Name: " + konspet.getStudentName());
        System.out.println("Subject Name: " + konspet.getSubjectName());
        System.out.println("Page Count: " + konspet.getPageCount());
        System.out.println("Year of Publication: " + konspet.getYearOfPublication());
        System.out.println("Cover Color: " + konspet.getCoverColor());
        System.out.println("Institution Name: " + konspet.getInstitutionName());
    }
}
