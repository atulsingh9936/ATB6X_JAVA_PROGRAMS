package May.Exercise_02_05_2024.Arraypractice;

public class array_homework_3 {
    public static void main(String[] args) {
        int [] salary = {30,50,60,90,10,100,999};
        int max =salary[0];

        for(int i =0;i<salary.length;i++){
            if(salary[i]>max){
                max =salary[i];


            }

        }
        System.out.println(max);
    }
}
