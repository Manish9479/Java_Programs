class A{
    int a;

    void get(){
        a=5;
    }

}

class B extends A {
    int a;
    void in(){
        a=10;
    }

    void show (){
        System.out.println("Subclass a value " +a);
        System.out.println("Superclass a value " +super.a);
    }
}
  


class Inheritance_Demo_Super {
    
    public static void main(String args[]) {

        B obj = new B();
        obj.get();
        obj.in();
        obj.show();

        
    }
}
