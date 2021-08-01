package swap;

public class Swa {

	public static void main(String[] args) {
	String str="hello";
	for(int i=str.length()-1;i>=0;i--) {
	System.out.println(str.charAt(i));
	
	}
	System.out.println("");
	StringBuffer  sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	System.out.println("");
	StringBuilder sbuilder=new StringBuilder(str);
	System.out.println(sbuilder.reverse());
	
	
	

	}

}
