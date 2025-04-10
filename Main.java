import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create ObjectMapper instance from Jackson
        ObjectMapper mapper = new ObjectMapper();

        // 1 Serialize Java object to JSON file
        // Create a Student object
        Student student = new Student("Ravi", 21, List.of("Math", "Physics"));

        // Write the object to a JSON file
        mapper.writeValue(new File("student.json"), student);

        // 2 Deserialize JSON file to Java object
        // Read the JSON file and convert it back to a Student object
        Student loaded = mapper.readValue(new File("student.json"), Student.class);

        // Print deserialized values
        System.out.println("Name: " + loaded.getFirstName());
        System.out.println("Subjects: " + loaded.getSubjects());

        // 3 Deserialize JSON with mismatched field names
        // JSON string uses snake_case keys: first_name and grade_point_average
        String json = "{\"first_name\":\"Neha\", \"grade_point_average\":8.5}";

        // Jackson maps them correctly using @JsonProperty annotations
        Student s2 = mapper.readValue(json, Student.class);

        // Print mapped values
        System.out.println("First Name: " + s2.getFirstName());
        System.out.println("GPA: " + s2.getGpa());
    }
}
