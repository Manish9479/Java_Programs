
class Show
{
    int a,b,c ;

    Show(int x){

       System.out.println(x);
    
    }
    Show(int x ,int y){

        System.out.println(x,y);
     
     }

     Show(int x,int y , int z){

        System.out.println(x,y,z);
     
     }
}

   public class Demo5 
    
   {
       public static void main(String[] args) 
        
    
        {
            int a =10 ; int b = 20; int c = 30;
            Show obj = new Show(a);
            Show obj1 = new Show(a,b);
            Show obj2 = new Show(a,b,c);


        }
    }


