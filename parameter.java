public class parameter
{
    int id;
    String name;
    
    parameter(int i,String n){  //parameter are avilable
        id=i;
        name=n;
    }
}
	public static void main(String[] args) {
		parameter s1=new parameter(111,"karan");    
		parameter s2=new parameter(222,"Aryan");
	System.out.println(s1.name + s1.id);
	System.out.println(s2.name + s2.id);
}
