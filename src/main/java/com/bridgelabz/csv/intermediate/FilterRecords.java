package com.bridgelabz.csv.intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        try{
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\Stundent-Record.csv"));
            String[] line;

            reader.readNext();
            while((line = reader.readNext())!=null){
                if (line.length < 4 || line[0].startsWith("#")) continue;

                if (Double.parseDouble(line[3]) >= 80) {
                    for (String value : line) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        } catch (CsvValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
