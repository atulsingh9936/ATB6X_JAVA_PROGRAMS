package Practice;

public class p12_averageof_program {
    public static void main(String[] args) {
        float [] marks = {34.6F,34.9f,78.9f,67.5f,45.7f};
        float sum =0;

        for( float element:marks){
            sum = sum+element;

        }
        System.out.println(" THe sum of total marks is " + sum/marks.length);
    }
}
