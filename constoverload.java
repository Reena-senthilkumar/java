public class constoverload
{
    constoverload(){
    System.out.println("hi reena");
}
constoverload(int a){//----------> constructor 1 int dataype is stored
        int temp=a;
        System.out.println(a);
    }
    constoverload(String name ){  //----------------->constructor 2 int data typr not able to declare another time bcoz its alredy declare in another constructor
        String  temp1=name;
        System.out.println(name);
    }
	public static void main(String[] args) {
		constoverload s1=new constoverload();   
		constoverload s2=new constoverload(222);
        constoverload s3=new constoverload("reena");
	
}}