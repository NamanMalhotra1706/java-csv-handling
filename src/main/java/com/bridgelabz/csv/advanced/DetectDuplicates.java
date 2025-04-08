package com.bridgelabz.csv.advanced;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.HashSet;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\DuplicatesDetails.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            HashSet<Integer> set = new HashSet<>();

            reader.readNext();
            String[] line;

            while((line=reader.readNext())!=null){
                if(set.contains(Integer.parseInt(line[0]))){
                    System.out.println("duplicate entry: ");
                    for(String val : line){
                        System.out.print(val +" ");
                    }
                }
                else{
                    set.add(Integer.parseInt(line[0]));
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
