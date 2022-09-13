class A{
   A (){
        System.out.println("Parent");
    }

}

class B extends A {

    B (){
        System.out.println("Child");
    }

}
  

public class Inheritance_Default_Constructor {
    
    public static void main(String[] args) {
        B obj1=new B();
    }
}