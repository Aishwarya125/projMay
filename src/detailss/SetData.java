package detailss;
import java.util.Set;
import java.util.TreeSet;

public class SetData {
	

		public static void main(String[] args) {
			Set <Integer> s=new TreeSet<>();
			s.add(10);
			s.add(20);
			s.add(30);
			s.add(40);
			System.out.println(s);
			int size = s.size();
			System.out.println(size);
			boolean empty = s.isEmpty();
			System.out.println(empty);
		}
		
	}
	

