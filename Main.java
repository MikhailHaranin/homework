import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark ", "23", 2));
        students.add(new Student("Misha", "24", 3));
        students.add(new Student("Olya", "25", 7));
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student.getGroup() + " " + student.getMark());
            }
        }

    }
}
