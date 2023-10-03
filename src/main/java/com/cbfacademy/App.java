package main.java.com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.cbfacademy.Employee.Employee;

public class App {
    public static void main(String[] args) {
        
        public static List<Employee> readFile(String filePath) {
           
        Path filePath = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\java-json-exercise-YOkolo24\\src\\main\\java\\com\\cbfacademy\\Employee\\Employee.java");
        
        try {
            BufferedReader input = new BufferedReader(new FileReader(filePath));
                List<String> lines = Files.readAllLines(filePath2);

                // File sourceFile = Paths.get(filePath).toFile();
                // ObjectMapper objectMapper = new ObjectMapper();
                // List<Employee> employees = Arrays.asList(objectMapper.readValue(sourceFile, Employee[].class));

                // employees.forEach(System.out::println);

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        
        public static void saveToFile(Employee employee, String targetPath) {
            
            TypeToken<List<Employee>> employeeList = new TypeToken<List<Employee>>(){};
            List<Employee> newEmployeeAdded = gson.fromJson(json, employeeList);
        }
    }
}
