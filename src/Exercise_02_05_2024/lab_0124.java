package Exercise_02_05_2024;

public class lab_0124 {
    public static void main(String[] args) {
        int [] ages = {21,34,56,78,89};

        // fixed elements
        int [] ages2 = new int[5];
           // case2 -> here  by default value of all the elements will be?
        System.out.println(ages2[0]);
        System.out.println(ages2[4]);

        ages2[0]= 11;
        System.out.println(ages2[0]);

        String [] breakfast_items= {"milk", "idli","Fruits","Coffee","tea","Poha"};
        System.out.println(breakfast_items.length);



    }
}
