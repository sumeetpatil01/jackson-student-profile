import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Student {

    // Maps "first_name" from JSON to this Java field
    @JsonProperty("first_name")
    private String firstName;

    // Maps "grade_point_average" from JSON to this Java field
    @JsonProperty("grade_point_average")
    private double gpa;

    // Other fields directly map (no annotation needed)
    private int age;
    private List<String> subjects;

    // Default constructor required by Jackson
    public Student() {}

    // Constructor without GPA (used in basic example)
    public Student(String firstName, int age, List<String> subjects) {
        this.firstName = firstName;
        this.age = age;
        this.subjects = subjects;
    }

    // Constructor with GPA (used in advanced example)
    public Student(String firstName, int age, double gpa, List<String> subjects) {
        this.firstName = firstName;
        this.age = age;
        this.gpa = gpa;
        this.subjects = subjects;
    }

    // Getters for all fields
    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public List<String> getSubjects() { return subjects; }
}
