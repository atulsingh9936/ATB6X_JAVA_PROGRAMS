package Assignment;

public class max_2D_Array {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max =0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              //  System.out.println(arr[i][j]);
                if(arr[i][j]> max);
             max = arr[i][j];
            }
        }
        System.out.println(max);



    }
}
