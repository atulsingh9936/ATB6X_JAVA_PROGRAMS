package Assignment;

public class Element_in_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean isarray = false;
        int exist = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == exist) {
                    isarray = true;
                    break;
                }


            }
        }
            if (isarray) {
                System.out.println("element is present in array which is " + exist);
            } else {
                System.out.println(exist + " is element not present in the array");
            }

        }

    }