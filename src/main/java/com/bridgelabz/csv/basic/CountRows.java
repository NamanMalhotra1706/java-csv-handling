package com.bridgelabz.csv.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountRows {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\java-csv-handling\\src\\main\\java\\com\\bridgelabz\\csvFiles\\Stundent-Record.csv"));
            int rows = 0;
            String line;

            br.readLine();
            while((line=br.readLine())!=null){
                System.out.println(line+" ");
                rows+=1;
            }

            System.out.println("Total number of rows excluding header: " + rows);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
