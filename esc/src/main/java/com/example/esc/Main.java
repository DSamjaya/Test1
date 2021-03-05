package com.example.esc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        try {
            System.out.println(new File(".").getAbsolutePath());
            File myObj2 = new File(new File(".").getAbsolutePath() + "filename.txt");

            File myObj = new File("C:\\Users\\joshu\\Downloads\\NeuralNetwork\\esc\\src\\main\\java\\com\\example\\esc\\filename.txt");
            System.out.println(myObj);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}