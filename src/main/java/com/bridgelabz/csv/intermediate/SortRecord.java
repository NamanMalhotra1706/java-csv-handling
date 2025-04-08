package com.bridgelabz.csv.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

public class SortRecord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\EmplyeeDetails.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> employeeList = new ArrayList<>();
            String[] line;

            String[] header = reader.readNext(); // skip header
            while ((line = reader.readNext()) != null) {
                employeeList.add(line);
            }


            employeeList.sort((a, b) -> {
                double salaryA = Double.parseDouble(a[4]);
                double salaryB = Double.parseDouble(b[4]);
                return Double.compare(salaryB, salaryA); // descending
            });

            System.out.println("Top 5 Highest Paid Employees:");
            System.out.println(String.join(", ", header));

            for (int i = 0; i < Math.min(5, employeeList.size()); i++) {
                System.out.println(String.join(", ", employeeList.get(i)));
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
