package Practice;

public class Max_numberinarray {
    public static void main(String[] args) {
        int [] arr ={34,56,789,900,678,89,3456};
        int max =0;
        for( int ele:arr){
            if(ele>max){
                max= ele;
            }
        }
        System.out.println("The value of maximum elelment in array is "+ max);
    }
}
