package addition;

public class sum {

	int a,b,total;
	void add()
	{
		total=a+b;
	}
}
class ex{
	public static void main(String args[])
	{
		sum obj=new sum();
		obj.a=10;
		obj.b=20;
		obj.add();
		System.out.println("Addition = "+obj.total);
		
	}

}
