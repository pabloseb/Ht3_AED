import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class Archivos {

     static void escribir() {
        Random rand = new Random();
        String txt = "";
        for (int i=0; i<3000; i++){
            txt += Integer.toString(Math.abs(rand.nextInt())) + " ";
        }
        try {
            FileWriter writer = new FileWriter("datos.txt");
            writer.append(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {

        }
    }

     static Integer[] leer(int n) {
        Integer[] data = new Integer[n];
        String[] input = new String[1];
        try{
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            input = reader.readLine().split(" ");
        } catch (IOException e) {
        }

        for (int i=0; i<n; i++) {
            data[i] = Integer.valueOf(input[i]);
        }
        return data;
    }

     static Comparable[] ReadComparable(int n) {
        Comparable[] data = new Comparable[n];
        String[] input = new String[1];
        try{
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            input = reader.readLine().split(" ");
        } catch (IOException e) {
        }

        for (int i=0; i<n; i++) {
            data[i] = Integer.valueOf(input[i]);
        }
        return data;
    }
}
