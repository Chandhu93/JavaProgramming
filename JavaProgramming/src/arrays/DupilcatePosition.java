package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DupilcatePosition {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,3,5,6,1,3,5 };
		LinkedHashMap<Integer, ArrayList> hash = new LinkedHashMap();
		for(int i=0; i<a.length; i++) {
			if(hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			}
			else {
				hash.put(a[i], new ArrayList());
			}
		}
		
		for(Entry<Integer, ArrayList> map:hash.entrySet()) {
			if(map.getValue().size()>0)
				System.out.println(map.getKey()+"-"+map.getValue());
		}
	}
}


class DuplicateIndexPrinter {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 3, 5, 6, 1, 3, 5};
        LinkedHashMap<Integer, ArrayList> hash = new LinkedHashMap();

        for (int i = 0; i < a.length; i++) {
            if (hash.containsKey(a[i])) {
                hash.get(a[i]).add(i);  // Only add duplicate positions
            } else {
                hash.put(a[i], new ArrayList());  // Initialize list
            }
        }

        for (Entry<Integer, ArrayList> map : hash.entrySet()) {
            if (map.getValue().size() > 0) {
                int key = map.getKey();
                ArrayList<Integer> list = new ArrayList<>();
                
                for (int i = 0; i < a.length; i++) {	// Add first occurrence index
                    if (a[i] == key) {
                        list.add(i);
                    }
                }
                System.out.println(key + " :- " + list);
            }
        }
    }
}
