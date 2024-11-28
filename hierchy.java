class One { // parent class One
    public void print_geek() // print_geek() is method for Class one
    {
        System.out.println("reena ");// behaviour of parent class
    }
}

class Two extends One { // child class derived from oarent class==DC1
    public void print_for() { 
        System.out.println("senthil");
        }
}
class Three extends One{// child class derived from BC and another DC but BC didnot put in this (DC1 include BC)
    public void print_reena()
    {
        System.out.println("kumar");
    }
}
class four extends One{// child class derived from BC and another DC but BC didnot put in this (DC1 include BC)
    public void print_s()
    {
        System.out.println("shalini");
    }
}

// Driver class
public class hierchy{
      // Main function
    public static void main(String[] args)
    {
        Two g = new Two(); // object creation if the class create the object it cant call from another object.
        g.print_geek();
        g.print_for();
         
         Three e=new Three();
         e.print_geek();
         e.print_reena();
         
        four h=new four();
        h.print_geek();
        h.print_s();
    }

}