package com.bridgelabz.csv.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class ModifyRecord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\EmplyeeDetails.csv";
        try{
            CSVReader reader = new CSVReader(new FileReader(filePath));
            List<String[]> updatedData = new ArrayList<>();
            String[] line;

            // Read header
            String[] header = reader.readNext();
            updatedData.add(header);

            // Process each row
            while ((line = reader.readNext()) != null) {
                // Check for IT department
                if (line[3].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(line[4]);
                    salary = salary + (salary * 0.10); // 10% increment
                    line[4] = String.valueOf(salary);  // Update salary in row
                }
                updatedData.add(line); // Add updated or unchanged row
            }

            reader.close(); // Close reader before writing

            // Write back to same file (overwrite)
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                writer.writeAll(updatedData);
                System.out.println("✅ File updated successfully with new salaries for IT department.");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
