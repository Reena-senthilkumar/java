class One { // parent class One
    public void print_geek() // print_geek() is method for Class one
    {
        System.out.print(" Geeks ");// behaviour of parent class
    }
}

class Two extends One { // child class derived from oarent class==DC1
    public void print_for() { 
        System.out.print(" for "); }
}
class Three extends Two{// child class derived from BC and another DC but BC didnot put in this (DC1 include BC)
    public void print_reena()
    {
        System.out.println("geeks is good");
    }
}

// Driver class
public class multilevel{
      // Main function
    public static void main(String[] args)
    {
        Three g = new Three(); // object creation
        g.print_geek();
        g.print_for();
        g.print_reena();
    }

}