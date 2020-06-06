package setAndMap;
import java.util.*;
public class LearningSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(3));
		System.out.println(set.contains(10));
		System.out.println(set.remove(3));
		System.out.println(set.contains(3));
		set.clear();
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		System.out.println(set.size());
	}

}
