package Strings;

public class funcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char namearr[]={'j','o','h','n'};
//		for(int i=0;i<name.length;i++)
//		{
//			System.out.print(namearr[i]+" ");
//		}
		//String Class - immutable
		//String literals
		//string pool area
//		String name = "John";
//		String name2 = "John";
//		System.out.println(name);
//		if(name==name2)
//		{
//			System.out.println("Names are Equal");
//		}
//		else
//		{
//			System.out.println("Names are Not Equal");
//		}
//		System.out.println("Name == name2: "+(name==name2));
		//new keyword calls the constructors of the class
//		String colour = new String("Red");
//		System.out.println(colour);
//		String colour2=new String("Red");
//		if(colour==colour2)//comparing references
//		{
//			System.out.println("Colours are Equal");
//		}
//		else
//		{
//			System.out.println("Colours are Not Equal");
//		}
//		System.out.println(colour.equals(colour2));//comparing value
//		String class functions
		//1
//		String s=new String();//object created
//		String s2 = null;//no object created
//		System.out.println(s);
		//3
//		String sname=new String(namearr);
//		System.out.println(sname);
		//4
//		String partName=new String(namearr,2,2); //index and length
//		System.out.println(partName);
		//5
//		byte b[]= {65,66,67,68};
//		String bs = new String(b,2,2);
//		System.out.println(bs);
		//Methods 6
		String s = "CipherSchools";
//		System.out.println(s.toUpperCase());
//		System.out.println(s);
//		s=s.toUpperCase();
//		System.out.println(s);
		//7
//		System.out.println(s.toLowerCase());
		//8
		String we="Welcome to Java Developers Group CS!";
		String sarr[] = we.split(" ");//pass a regExp(regex) returns array of String
		for(int i=0;i<sarr.length;i++)
		{
			//array length is a variable of array object
			System.out.println(sarr[i]);
		}
		//9
		//length of a string is found by a function call
		System.out.println(s.length());
		//10 - indexOf(Character)
		int index = we.indexOf('e');
		System.out.println(index);
		System.out.println(we.indexOf('e'));
		int i = we.indexOf('e',2);//index passed or after it(inclusive)
		System.out.println(i);
		//11 - - indexOf(String)
		int index2 = we.indexOf("Java");
		System.out.println(index2);
		int index3 = we.indexOf("Corona");
		System.out.println(index3);
		//12 - substring
		String sub =we.substring(11); //starting index inclusive
		System.out.println("SubString is: "+sub);
		String sub2 = we.substring(11,32);//startIndex to endIndex-1
		System.out.println("SubString2 is: "+sub2);
		String sub3= s.substring(9,12);//9-11
		System.out.println(sub3);
		//13 - charAt() - something like - arr[i]
		System.out.println(s.charAt(0));
		System.out.println(we.charAt(11));
		//14 String to Character Array
		char ch[] = s.toCharArray();
		for(int j=0;j<ch.length;j++)
			{
				System.out.print(ch[j]+" ");
			}
		System.out.println();
		//15
		System.out.println(s.isEmpty());
		String es="";
		System.out.println(es.isEmpty());
		//16 - Comparing two Strings - lexicographically
		String s1 = "A";//1
		String s2="B";//2
		String s3="AA";
		String s4="AC";
		String s5 = "C";//3
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s5));
		System.out.println(s3.compareTo(s4));
		//17 - Concatenation
//		String concatenated = s.concat(we);
		String concatenated = s+we;//concatenation
		System.out.println(concatenated);
		//18 - trim (removes spaces from starting and ending only)
		String nameless="    Hello    There    ";
		System.out.println(nameless);
		nameless = nameless.trim();
		System.out.println(nameless);
		//19 - replace
//		s - CipherSchools
		System.out.println(s.replace('o', '*'));
		//replaceAll
		String numbers = "one one two three four";
		System.out.println(numbers.replaceAll("one","five" ));
		System.out.println(we.replaceAll("[AEIOUaeiou]", "*"));
		//20 Convert any DT to String
		int x =5;
		String sx=5+"";//not a good method
		System.out.println(sx);
		String sxgood = String.valueOf(x);
		System.out.println(sxgood);
		
		//21 - HW
		System.out.println(s.contains("School"));
		
	}

}
