package april.Excercise_27042024;

public class Lab_0114 {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even number --> " + i);
                continue;
            }
            System.out.println("odd number-->"+i);
        }
    }
}
