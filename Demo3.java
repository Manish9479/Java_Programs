class Add
{
    int a,b,c ;

    void input(){

        a=10;
        b=20;
    
    }

    void sum(Add obj){
        c=obj.a+obj.b;
    }
    
    void show()
    {
        System.out.println("Addition of A+B ="+c);
    }
}



   public class Demo3 
    
   {
       public static void main(String[] args) 
        
    
        {
            Add obj = new Add();
            Add obj1 = new Add();
            obj.input();
            obj1.sum(obj);
            obj1.show();

        }
    }


