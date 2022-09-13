/*write a program to tescher clss which have 3 att
 name 
age
 sal
get value

extend the feature class in child class 
name
 age
void show 
get value*/


class Teacher{
    String name;
    int age;
    int sal;

    void getvalue(int x, String a, int b){
        age = x;
        name = a;
        sal = b;

        
    }
}


class Student extends Teacher{

void show(){
    System.out.println("name & age & sal are : " + name +' ' +age +' '+ sal);
}
}


class Inheritance_Demo2 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.getvalue(4,"Ram",400393);
        obj1.show();
    }
    
}
