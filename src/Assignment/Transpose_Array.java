package Assignment;

public class Transpose_Array {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int [][] transpose = new int [3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transpose[i][j]= arr[j][i];





            }

        }

        // printing the orginal array

//        System.out.println(" Original Array ");
//        for ( int i=0; i< arr.length; i++){
//            for(int j=0; j< arr.length; j++){
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//        }

        System.out.println(" ---------------- ");
        System.out.println(" Transpose Array ");
        for ( int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }


    }
}