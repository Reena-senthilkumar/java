class Grandpa 
{ // parent class One
    public void print_geek() // print_geek() is method for Class one
    {
        System.out.print("grandpa");// behaviour of parent class
    }
}

class father extends Grandpa
{ // child class derived from parent class==DC1
    public void print_for() 
    { 
        System.out.print("daddy");
        }
}
class daugther extends father
{//DC1 derived DC2
    public void print_reena()
    {
        System.out.println("son");
    }
}
class son extends father
{//DC1 derived DC3
    public void print_s()
    {
        System.out.println("daughter");
    }
}

// Driver class
public class hybrid{
      // Main function
    public static void main(String[] args)
    {
        daugther g = new daugther(); // object creation
        g.print_geek();
        g.print_for();
        g.print_reena();
        
        son e=new son(); //obeject creation
        e.print_geek();
        e.print_for();
        e.print_s();
    }

}
