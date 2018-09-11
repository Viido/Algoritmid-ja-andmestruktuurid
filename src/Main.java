import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arvud = {5,4,9,11,100,120,0,2,4,7};

        ArrayList<Integer> arvud2 = Algoritmid.createArray(10);
        ArrayList<Integer> arvud3 = Algoritmid.createArray(10);


        System.out.println(arvud2);

        Collections.sort(arvud2);

        System.out.println(arvud2 + "\n");

        System.out.println(arvud3);

        Algoritmid.InsertionSort(arvud3);

        System.out.println(arvud3);

    }
}
