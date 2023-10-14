package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.cbfacademy.FileHandler.JSONFileHandler;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App {
    public static void main(String[] args) {

        JSONFileHandler newJsonFileHandler = new JSONFileHandler();

        Path filePath = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\java-json-exercise-YOkolo24\\src\\main\\resources");
                
        try {
            List<Employee> employees = readFile(filePath);
            Gson gson = new Gson();
            List<List<Employee>> employeesList = Arrays.asList(((Object) employees).readValue(Employee[].class));
            String json = gson.toJson(employeesList);
    
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        String targetPath = "src/main/resources/employees.json";

        try {public static void saveToFile(Employee employee, String targetPath) {
            TypeToken<List<Employee>> employeeList = new TypeToken<List<Employee>>(){};
            List<Employee> newEmployeeAdded = gson.fromJson(json, employeeList);
            }   
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
        
        // public static List<Employee> readFile(String filePath) {
           
        // Path filePath = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\java-json-exercise-YOkolo24\\src\\main\\java\\com\\cbfacademy\\Employee\\Employee.java");
        
        // try {
        //     BufferedReader input = new BufferedReader(new FileReader(filePath));
        //         List<String> lines = Files.readAllLines(filePath2);

        //         // File sourceFile = Paths.get(filePath).toFile();
        //         // ObjectMapper objectMapper = new ObjectMapper();
        //         // List<Employee> employees = Arrays.asList(objectMapper.readValue(sourceFile, Employee[].class));

        //         // employees.forEach(System.out::println);

        //     } catch (IOException e) {
        //         System.err.println(e.getMessage());
        //     }
        // }
    }
}
