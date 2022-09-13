interface Show{
    void display();
}

class A implements Show{
    public void display()
    {
        System.out.println("Interface Program");
    }
}
class B implements Show{
    public void display(){
        System.out.println("Interface Child");
    }
}

class  Inheritance_Implement_Interface {
    public static void main(String[] args){
        A obj1 =new A();
        obj1.display();
        
        B obj2 = new B();
        obj2.display();
        
    }
    
    
}
