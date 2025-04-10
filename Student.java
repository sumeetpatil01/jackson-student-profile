import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Student {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("grade_point_average")
    private double gpa;

    private int age;
    private List<String> subjects;

    public Student() {}

    public Student(String firstName, int age, List<String> subjects) {
        this.firstName = firstName;
        this.age = age;
        this.subjects = subjects;
    }

    public Student(String firstName, int age, double gpa, List<String> subjects) {
        this.firstName = firstName;
        this.age = age;
        this.gpa = gpa;
        this.subjects = subjects;
    }

    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public List<String> getSubjects() { return subjects; }
}
