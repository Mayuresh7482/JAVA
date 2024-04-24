package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class E110delete {
    public static void main(String[] args) {
        File myFile = new
                File("CWH_file1.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
        File myFile1 = new
                File("CWH_file1.txt");
        try {
            Scanner sc = new
                    Scanner(myFile1);
            while(sc.hasNextLine()){
                String line =
                        sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
