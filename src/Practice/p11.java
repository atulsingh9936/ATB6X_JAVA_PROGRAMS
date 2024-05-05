package Practice;

public class p11 {
    public static void main(String[] args) {

        // program to find whether the given number is present in array or not

        float [] marks = {34.6F,34.9f,78.9f,67.5f,45.7f};
        float num = 32.9f;
        boolean isArray = false;
        for( float element:marks){
            if(num==element){
                isArray= true;
                break;

            }
        }

        if(isArray){
            System.out.println(" elements is present in array");

        } else{
            System.out.println("elements in not present in the array");
        }
    }
}
