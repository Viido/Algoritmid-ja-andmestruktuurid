import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Algoritmid {
    private static Random rand = new Random();

    public static void InsertionSort (ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++) { // i on ümbertõstetava elemendi indeks
            for (int j = 0; j < i; j++) { // itereerib läbi sorteeritud osa listist
                int temp = list.get(i);
                if (list.get(j) >= temp){ // paigutab ümbertõstetava elemendi kas sorteeritud osa sisse või jätab sinna kus ta on
                    list.remove(i);
                    list.add(j,temp);
                }
            }
        }
    }

    public static void QuickSort (ArrayList<Integer> list, int algus, int lõpp){
        if (algus < lõpp){
            int indeks = partition(list, algus, lõpp);
            QuickSort(list, algus, indeks-1);
            QuickSort(list, indeks+1, lõpp);
        }
    }

    public static int partition(ArrayList<Integer> list, int algus, int lõpp){
        int pivot = list.get(lõpp);
        int j = (algus-1);
        for (int i = algus; i < lõpp; i++) {
            if(list.get(i) <= pivot){
                j++;
                Collections.swap(list,i,j);
            }
        }
        Collections.swap(list,j+1,lõpp);
        return j+1;
    }

    public static ArrayList<Integer> createArray(int n){ // meetod tagastab n-liikmelise ArrayListi arvudest vahemikus [0,100]
        ArrayList<Integer> uus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            uus.add(rand.nextInt(101));
        }
        return uus;
    }
}
