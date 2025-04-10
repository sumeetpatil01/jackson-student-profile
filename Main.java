import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // 1. Serialize Java object to JSON file
        Student student = new Student("Ravi", 21, List.of("Math", "Physics"));
        mapper.writeValue(new File("student.json"), student);

        // 2. Deserialize JSON file to Java object
        Student loaded = mapper.readValue(new File("student.json"), Student.class);
        System.out.println("Name: " + loaded.getFirstName());
        System.out.println("Subjects: " + loaded.getSubjects());

        // 3. Deserialize JSON with mismatched fields
        String json = "{\"first_name\":\"Neha\", \"grade_point_average\":8.5}";
        Student s2 = mapper.readValue(json, Student.class);
        System.out.println("First Name: " + s2.getFirstName());
        System.out.println("GPA: " + s2.getGpa());
    }
}
