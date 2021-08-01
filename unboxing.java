package add;

public class wrapper {

	public static void main(String[] args) {
		int a=100;
		Integer obj=new Integer(a);
		int x=obj.intValue();
		int y=obj;
		System.out.println(a+ " "+x+ " "+y+ " "+obj);
		

	}

}
