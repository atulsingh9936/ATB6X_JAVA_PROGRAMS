package exercise_04_05_2024;

public class Lab_0135 {
    public static void main(String[] args) {
        // Arrays
        // Collection of similar Data Type.

        // Find the Max in the Arrays

        int [] salaries ={20,50,67,89,90};
        // How do we find the Max Sal in the array?
        // Loop -> Logic -> max = 0, for i - 0 to length
        // salaries[i] > max -> max ... 0 to l - max
        int max = Integer.MIN_VALUE;  // //-2147483648
        // -2147483648 to 2147483647
        for(int i=0;i<salaries.length;i++){
            if(salaries[i]>max){
                max= salaries[i];
            }
        }

//        int j = 0; // j=9
//        while (j < salaries.length) {
//            if (salaries[j] > max) {
//                max = salaries[j];
//            }
//            j++;
//        }

        System.out.println(max);
    }
}
