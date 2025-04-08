package com.bridgelabz.csv.intermediate;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\EmplyeeDetails.csv"));
            String[] line;
            String name = sc.nextLine().toLowerCase();
            reader.readNext();
            boolean employeeFound = false;
            while((line = reader.readNext())!=null){
                String csvName = line[1].toLowerCase();
                if(csvName.equals(name)){
                    System.out.print(line[3] + " " + line[4]);
                    employeeFound = true;
                }
            }
            if(!employeeFound){
                System.out.println("No Employee Found with this name: " + name);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
