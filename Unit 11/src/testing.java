import java.util.ArrayList;
public class testing {
	public static void main(String[] args){
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(89);
		intlist.add(70);
		intlist.add(40);
		intlist.remove(new Integer(44));
		intlist.add(32);
		System.out.println(intlist);
	}
	
}
