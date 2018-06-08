import java.util.*;
public class arrayList {


	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("initial size"+al.size());
		al.add("e");
		al.add("a");
		al.add("i");
		al.add("o");
		al.add("u");
		al.add(1,"z");
		System.out.println("size "+al.size());
		System.out.println("element of list"+al);
		al.remove(1);
		al.remove(3);
		System.out.println("size"+al.size());
		System.out.println(al);
		
	
	}

}
