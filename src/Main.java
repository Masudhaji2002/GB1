import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i=0; i<array.length; i++){
            array[i] = rnd.nextInt(301);
            System.out.print(array[i] + " ");
        }

        //min
        int min = array[0];
        for (int i=0; i< array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("минимальное значение: " + min);

        //max
        int max = array[0];
        for (int i=0; i< array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("максильманое значение: " + max);

        //average
        int average = 0;
        for(int i=0; i< array.length;i++){
            average += array[i]/array.length;
        }
        System.out.println();
        System.out.println("среднее значение: " + average);
    }
}