package collectionFramework;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", new Integer(87));
		treeMap.put("forever", new Integer(98));
		treeMap.put("description", new Integer(75));
		treeMap.put("ever", new Integer(95));
		treeMap.put("zoo", new Integer(80));
		treeMap.put("cherry", new Integer(80));

		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for (Map.Entry<String, Integer> entry: rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
