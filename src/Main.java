import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter("tulemused.xls"));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 15000; i = i+100){
            ArrayList<Integer> arvud1 = Algoritmid.createArray(i);
            ArrayList<Integer> arvud2 = Algoritmid.createArray(i);
            ArrayList<Integer> arvud3 = Algoritmid.createArray(i);

            long start1 = System.currentTimeMillis();
            Algoritmid.InsertionSort(arvud1);
            long stop1 = System.currentTimeMillis();

            long start2 = System.currentTimeMillis();
            Algoritmid.QuickSort(arvud2,0,arvud2.size()-1);
            long stop2 = System.currentTimeMillis();

            long start3 = System.currentTimeMillis();
            Collections.sort(arvud3);
            long stop3 = System.currentTimeMillis();

            writer.write(i + "\t" + (stop1-start1) + "\t" + (stop2-start2) + "\t" + (stop3-start3) + "\n");
        }
        writer.close();
    }
}
