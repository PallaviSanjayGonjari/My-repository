package collectionHashmap;

import java.util.ArrayList;

public class HashMap {

	public static void main(String[] args) 
	{
		System.out.println("***********************************************************");
		ArrayList<Object> al=new ArrayList<>();
		al.add("Pallavi");
		al.add("Prashant");
		al.add('S');
		al.add(null);
		al.add(123.45f);
		al.add(24);
		al.add(true);
		al.add(true);
		System.out.println();
		System.out.println(al);
		System.out.println();
		System.out.println("***********************************************************");
		ArrayList<Object> al1=new ArrayList<>();
		al1.add("Sharu");
		al1.add(58);
		al1.add(45.24f);
		al1.add(2, null);
		al1.add(true);
		al1.add('p');
		al1.add(true);
		System.out.println();
		System.out.println(al1);
		System.out.println();
		System.out.println("***********************************************************");
		/*al1.clear();
		System.out.println("clear method use");
		System.out.println(al1);*/
	
		System.out.println("clone");
		Object al2 = al1.clone();
		System.out.println("al1= "+al1);
		System.out.println("al2= "+al2);
		System.out.println("***********************************************************");
		System.out.println("Contains method use");
		System.out.println(al1.contains("Sharu"));
		System.out.println(al1.contains("Pallavi"));
		System.out.println("***********************************************************");
		System.out.println("get element by index");
		System.out.println(al.get(0));
		System.out.println(al1.get(5));
		System.out.println("***********************************************************");
		System.out.println("get index by element");
		System.out.println(al.indexOf("Pallavi"));
		System.out.println("***********************************************************");
		System.out.println("Remove by index & element");
		System.out.println(al.remove(2));
		System.out.println(al.remove("Pallavi"));
		System.out.println(al);
		System.out.println("***********************************************************");
		System.out.println("Replace and add new ele by Set method");
		al.set(2,"Pramila");
		System.out.println(al);
		System.out.println("***********************************************************");
		System.out.println("size");
		System.out.println(al.size());
		System.out.println(al1.size());
		System.out.println("***********************************************************");
		
		
		System.out.println("*********************************End*********************************");

	}

}
