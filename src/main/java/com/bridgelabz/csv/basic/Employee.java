package com.bridgelabz.csv.basic;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\EmplyeeDetails.csv"));

            bw.write("SNo\t Name\t\t\t\t Age\t Department");
            bw.newLine();

            bw.write("1\t Naman Malhotra \t 21 \t CSE");
            bw.newLine();

            bw.close();

            System.out.println("Data added file successfully");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}