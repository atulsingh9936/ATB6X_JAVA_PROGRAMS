package May.Exercise_14_05_2024;

public class Lab_171 {
    public static void main(String[] args) {
        ATB_person amitref1 = new ATB_person(); // default constructor
        ATB_person pramod = new ATB_person("Pramod",76646666664l,"atul.singh2189@gmail.com ", true,   "ATB");//PC1
        ATB_person ratul = new ATB_person("ratul",76646666699l,"rtaul.singh2189@gmail.com ", true,   "ATB");  //PC2
        ATB_person ratul1 = new ATB_person("ratul",76646666699l);// PC3
      //  ATB_person devakaref1 = new ATB_person(123,7757776778689l);
         for(int i=0; i<100;i++){
            new ATB_person("A+i",76646666664l,"atul.singh2189@gmail.com ", true,   "ATB");
         }
    }

}
