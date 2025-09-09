import java.util.ArrayList;
import java.util.Arrays;

public class RandomDistributor {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.addAll(Arrays.asList(19,19,20,20,20,20,21,21));
        ages.addAll(Arrays.asList(21,21,21,22,22,22,23,23));
        ages.addAll(Arrays.asList(24,24,24,25,25,25,25,26));
        ages.addAll(Arrays.asList(26,27,28,28,28,29,30,31,32,32));
        int studentCount = ages.size();



        for (int i = 1; i <= 1; i++){
            int x = (int)(Math.random()* (studentCount)); // Random number from 0 to array size minus 1
            System.out.println(x);
        }
    }

}
