import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

public class Archivos {

    public static void escribir() {
        Random rand = new Random();
        String txt = "";
        for (int i=0; i<3000; i++){
            txt += Integer.toString(rand.nextInt()) + " ";
        }
        try {
            FileWriter writer = new FileWriter("datos.txt");
            writer.append(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {

        }
    }

    public static Integer[] leerInt(int n) {
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

    public static Comparable[] leerComp(int n) {
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
