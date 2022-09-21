package com.company;

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("Voyna.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);
        for (int i = 0, l = lines.size(); i < l; ++i) {
            lines.set(i, lines.get(i).toLowerCase());
        }
////  System.out.println(lines);

        int count = 0;
        int sumString = 0;
        for (String line : lines) {


            if (line.contains("страдан")) {
                count++;
            }
       }
        sumString = sumString + count;
        System.out.println("Задание 1. \"Война и мир\" содержит слово \"страдание\" в его различных модификациях " + sumString + " раз.");

        //Задание 2

        ArrayList<String> arrayVoyna = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("Voyna.txt")).useDelimiter("\\s*-\\s*")) {

            while (sc.hasNext()) {
                arrayVoyna.add(sc.next());
            }
        }
        catch (FileNotFoundException e) {
            // Handle the potential exception
        }
        for (int i = 0, l = arrayVoyna.size(); i < l; ++i) {
            arrayVoyna.set(i, arrayVoyna.get(i).toLowerCase());
        }
//  System.out.println(lines);

        int countWords = 0;
        int sumWords = 0;
        for (String line : arrayVoyna) {


            if (line.contains("страдан")) {
                countWords++;
            }
        }
        sumWords = sumWords + countWords;
        System.out.println("Задание 2. \"Война и мир\" содержит слово \"страдание\" " + sumWords + " раз.");

//      Задание 3. Вывести таблицу умножения

        int i=1,n=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            while(n<=9)
            {
                n++;
                System.out.print(i*n+" ");
            }
            i++;
            n=1;
            System.out.println("");
        }
    }
}
    



    



