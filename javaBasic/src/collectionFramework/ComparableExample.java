package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("È«±æµ¿", 45));
		treeSet.add(new Person("ÀÏÁö¸Å", 25));
		treeSet.add(new Person("ÀÌ¸ù·æ", 31));
		
		Iterator<Person> it = treeSet.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person.name + ":" + person.age);
			
		}
	}
}
