package May.exercise_04_05_2024;

public class Lab_0136 {
    public static void main(String[] args) {
       // double the array
        int[] arrays = {30,40,50};
        int[] arrays2 = new int[3];

        for (int i = 0; i < arrays.length ; i++) {
            arrays2[i] = arrays[i]*2;

        }

        System.out.println("Printing Arrays!!");
        for (int i = 0; i < arrays2.length ; i++) {
            System.out.println(arrays2[i]);
        }

    }
}
