

import java.util.ArrayList;
import java.util.List;

public class Hello {

	public static void main(String agrs)
	{
		int ar[]= {3,6,9,5};
		List<Integer> list=new ArrayList<>();
		list.add(ar[0]);
		list.add(ar[2]);
		list.set(1, ar[0]);
		list.set(1, ar[1]);
		list.remove(0);
		list.add(ar[0]);
		System.out.println(list);
		
	}
}
