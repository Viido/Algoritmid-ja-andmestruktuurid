import java.util.ArrayList;
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

    public static ArrayList<Integer> createArray(int n){ // meetod tagastab n-liikmelise ArrayListi arvudest vahemikus [0,100]
        ArrayList<Integer> uus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            uus.add(rand.nextInt(101));
        }
        return uus;
    }
}
