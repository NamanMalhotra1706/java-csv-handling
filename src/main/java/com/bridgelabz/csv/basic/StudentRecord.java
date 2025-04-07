package com.bridgelabz.csv.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentRecord {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\Stundent-Record.csv"));

            String line;
            while((line = br.readLine())!=null){
                String data[] = line.split(",");
                for(String val : data){
                    System.out.print(val +"\t");
                }
                System.out.println();
            }
        }
        catch(FileNotFoundException e){

        } catch (IOException e) {

        }

    }
}
