package Practice;

public class min_numberinarray {
    public static void main(String[] args) {
        int [] arr = {1,8,9,7,-44444674,0};
        int min = Integer.MAX_VALUE;
        for( int ele:arr){
            if(ele<min){
                min= ele;
            }
        }
        System.out.println(min);
    }
}
