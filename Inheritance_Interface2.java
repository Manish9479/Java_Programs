interface  A {
    int i = 10;
    void sum();
}

interface B {
    int i = 20;
    void sum();
}

class Add implements A,B {
    public void sum(){
        int add=A.i + B.i;
        System.out.println("Sum = "+add);
    }
}



class Inheritance_Interface2 {
    public static void main(String[] args) {
        Add obj1 = new Add ();
        obj1.sum();
    }
}
