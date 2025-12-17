package pl.edu.vistula.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentWorker {
    public static List<Student> loadFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try {
            Files.lines(Path.of(filePath)).forEach(line -> {
                        String[] parts = line.trim().split("\\s+");
                        String name = parts[0];
                        String surname = parts[1];
                        double score = Double.parseDouble(parts[2]);
                        students.add(new Student(name, surname, score));
                    });
        } catch (IOException e) {
            System.out.println("Error: " + filePath);
        }
        return students;
    }
}