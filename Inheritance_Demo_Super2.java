class A{
    int a;

    A (int x){
        a=x;
    }

}

class B extends A {
    int b;
    B (int x, int y){
        super(x);
        b=y;
    }

    void show (){
        System.out.println("Superclass a value " +a);
        System.out.println("Subclass a value " +b);
    }
}
  

class  Inheritance_Demo_Super2 {
    public static void main(String args[]) {

        B obj = new B(10,40);

        obj.show();

        
    }
    
}
