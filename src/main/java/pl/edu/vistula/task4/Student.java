package pl.edu.vistula.task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String toString() {
        return name + " " + surname + " (" + score + ")";
    }
}