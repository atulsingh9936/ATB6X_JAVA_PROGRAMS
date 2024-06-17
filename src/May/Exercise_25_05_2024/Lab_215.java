package May.Exercise_25_05_2024;

import javax.swing.*;

public class Lab_215 {

    public static void main(String[] args) {

        day d = day.friday;
        System.out.println(d);


        for(Size size:Size.values()){
            System.out.println("Size:"+ size+ ",Abbreviation:"+size.getSize());
        }

    }
}

enum day{
    Monday, tuesday, wednesday, thrusday, friday, saturday, sunday
}

enum Size{
    Small("S"), Medium("m"), Large("L"),Extra_Large("XL");
    private String size;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    Size(String s) {
        this.size = s;



    }
}
