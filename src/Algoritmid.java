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

    public static void QuickSort (ArrayList<Integer> list){
        int pivot = rand.nextInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > 0; j--) {
                if (list.get(i) > pivot && list.get(j) < pivot){
                    Collections.swap(list,i,j);
                }
            }
        }
    }

    private int partition(ArrayList<Integer> list, int algus, int lõpp){
        int pivot = list.get(rand.nextInt(lõpp-algus+1)+algus);

        for (int i = algus; i < lõpp+1; i++) {
            if(list.get(i) <= pivot){

            }
        }
        return 0;
    }

    public static ArrayList<Integer> createArray(int n){ // meetod tagastab n-liikmelise ArrayListi arvudest vahemikus [0,100]
        ArrayList<Integer> uus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            uus.add(rand.nextInt(101));
        }
        return uus;
    }
}
