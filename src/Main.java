import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();
        ArrayList<Integer> numbers = new ArrayList <> ();
        for (int i = 0; i < 50; i++)
            numbers.add(random.nextInt(0,100));
        myMethod(numbers);
    }
    public static void myMethod(ArrayList<Integer> numbers){
        ArrayList<Integer> tak = new ArrayList<>();
        ArrayList<Integer> jup = new ArrayList<>();
        for (Integer number : numbers) {
            if(number%2!=0)
                tak.add(number);
            else
                jup.add(number);
        }
        System.out.println("Так сандар : "+tak);
        System.out.println("Жуп сандар : "+  jup);
    }
}