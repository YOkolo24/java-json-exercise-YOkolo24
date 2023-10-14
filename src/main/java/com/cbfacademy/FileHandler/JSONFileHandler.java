package com.cbfacademy.FileHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONFileHandler {
    
    public static List<Employee> readFile(String filename) {
        List<Employee> employees = new ArrayList<Employee>();
        return employees;
    }

    public static void save(Employee employee, String outputFile) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(outputFile)) {
            gson.toJson(employee, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
