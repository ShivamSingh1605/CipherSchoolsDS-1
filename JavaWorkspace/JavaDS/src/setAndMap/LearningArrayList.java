package setAndMap;
import java.util.*;
public class LearningArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();// is an indexed collection
		System.out.println(list.size());
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(3);
		System.out.println(list.size());
		System.out.println(list.get(0));//element at index 0
		System.out.println(list.get(4));
		System.out.println(list.contains(3));
		System.out.println(list.contains(4));
		System.out.println(list.remove(3));//delete at index
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.clear();
		System.out.println(list.size());
		
	}

}
