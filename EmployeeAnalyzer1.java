package com.bluejay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java. util.ArrayList;
import java. util.List;


public class EmployeeAnalyzer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFileName = "C:\\Users\\Azhar\\Downloads\\employee_data.txt"; // Replace with your file name
        String outputFileName = "C:\\Users\\Azhar\\Downloads\\output.txt";

        try {
			readEmployeeData(inputFileName);
		}
		catch (Exception e) {

			
			e.printStackTrace();
		}

		System. out.println("Analysis complete. Results written to " + outputFileName);
        }
		//private void warnings("unused")
		@SuppressWarnings("unused")
		private static List<String> Main() {
		return null;
	}
		private static List<Employee> readEmployeeData(String inputFileName2) {
			return null;
		}
    }

    
    class employee1 {
        String name;
        int consecutiveDaysWorked;
        int hoursPerShift;

        employee1(String name, int consecutiveDaysWorked, int hoursPerShift) {
            this.name = name;
            this.consecutiveDaysWorked = consecutiveDaysWorked;
            this.hoursPerShift = hoursPerShift;
        }
    
    static List<Employee> readEmployeeData(String fileName) throws IOException {
        List<Employee> employees = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                String name = parts[0].trim();
                int consecutiveDays = Integer.parseInt(parts[1].trim());
                int hoursPerShift = Integer.parseInt(parts[2].trim());
                employees.add(new Employee(name, consecutiveDays, hoursPerShift));
            }
        }

        reader.close();
        return employees;
    }

    
    static List<String> analyzeEmployees(List<Employee> employees) {
        List<String> results = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.consecutiveDaysWorked >= 7) {
                results.add("Name: " + employee.name + ", Position: Consecutive Days Worked");
            }

            if (employee.hoursPerShift > 14) {
                results.add("Name: " + employee.name + ", Position: Worked More Than 14 Hours in a Shift");
            }

            if (employee.hoursPerShift < 10 && employee.hoursPerShift > 1) {
                results.add("Name: " + employee.name + ", Position: Less Than 10 Hours Between Shifts");
            }
        }

        return results;
    }

   
    static void writeOutput(String fileName, List<String> lines) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (String line : lines) {
            writer.write(line + "\n");
        }
        writer.close();
    }
    }




