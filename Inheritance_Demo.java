class A{
    int a;

    void get(int x){
        a =x;
    }

}

class B extends A {
    int b;
    void in(int x){
        b=x;
    }

    void show (){
        System.out.println("a and b are " +a +b);
    }
}


class Inheritance_Demo {
    public static void main(String args[]) {

        B obj = new B();
        obj.get(20);
        obj.in(30);
        obj.show();

        
    }
    
}
