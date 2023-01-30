package collectionHashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HashMapTraversing {

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<>();
		al.add("Pallavi");
		al.add("Prashant");
		al.add(123);
		al.add(25.52f);
		al.add(null);
		al.add(true);
		al.add('P');
		System.out.println();
		System.out.println("***********************Using For Loop***************************");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("***********************Using Iterator***************************");
		Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***********************Using List itrator***************************");
		ListIterator<Object> lit = al.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("***********************Using for each loop***************************");
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("*********************************End*********************************");
	
	}

}
