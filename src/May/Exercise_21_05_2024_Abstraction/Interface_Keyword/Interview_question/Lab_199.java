package May.Exercise_21_05_2024_Abstraction.Interface_Keyword.Interview_question;

public class Lab_199 {

    interface I1{}
    interface I2{}

    class A {}
    class b{}

    abstract class c{}
    class Test1 extends A{}   // -> single inheritance
    class Test2 extends b{}
  //  class Test3 extends A,b{}  // multiple inheritance which is only possible through interface

    class Test4 implements I1,I2{} // mutiple inheritance

    class Test5 extends A implements I1,I2{}

   // class test6 implements I1 extends A{} -> not ok

  //  interface I3 extends A{}

  //  interface I4 implements A{}
 //   interface extends A,B{}

    interface I6 extends I1,I2{}

  //  interface I7 extends C{}


}
