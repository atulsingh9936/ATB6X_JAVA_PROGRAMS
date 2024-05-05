package Practice;

public class add_two_matrices {
    public static void main(String[] args) {

        int [][] matrices1 ={{1,2,5},
                             {4,5,6}};
        int [][] matrices2 ={{12,21,9},
                             {3,7,8}};
        int [][] result ={{0,0,0},
                             {0,0,0}};
        for(int i=0; i<matrices1.length;i++) {   // row number of times
            for(int j=0; j<matrices1[i].length;j++) {  // column number of times
                System.out.format("Setting value for i=%d,j =%d \n",i,j);
                result[i][j] = matrices1[i][j] + matrices2[i][j];
            }
        }

        // printing the elements of 2-D array
        for(int i=0; i<matrices1.length;i++) {   // row number of times
            for(int j=0; j<matrices1[i].length;j++) {  // column number of times
                System.out.print(result[i][j]+ " ");
              // result[i][j] = matrices1[i][j] + matrices2[i][j];
            }
            System.out.println(" ");
        }


    }
}
