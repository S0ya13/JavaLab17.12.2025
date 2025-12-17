package pl.edu.vistula.task4;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = StudentWorker.loadFromFile("src/main/resources/static/txt/studentsEN.txt");

        students.stream()
                .filter(s -> s.getScore() == 5.0)
                .forEach(System.out::println);

        double average = students.stream()
                .mapToDouble(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("Average score: " + average);

        long count5 = students.stream()
                .filter(s -> s.getScore() == 5.0)
                .count();
        System.out.println("Number of students with grade 5: " + count5);
    }
}