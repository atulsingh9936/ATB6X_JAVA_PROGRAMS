package May.Excercise_11_05_2024;

public class Person {

        // Attribute
        String name;
        byte age;
        long phone_number;
        String[] address;
        double height;
        boolean ismale;
        float salary;
        String dob;
        String eye_color;


        // behaviour/ functionality



        void walk(){
            System.out.println("I cam walk");
        }
        void talk(String msg){
            System.out.println("I will say"+ msg);
        }
        String sleep(){
            return "sleeping";
        }
        String eat(String item){
            return item;
        }

        }


