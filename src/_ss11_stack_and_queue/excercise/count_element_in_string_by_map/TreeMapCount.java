package _ss11_stack_and_queue.excercise.count_element_in_string_by_map;

import java.util.TreeMap;

public class TreeMapCount {
    public TreeMapCount() {
    }

    public void countString(String string){
        String[] array = string.split(" ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String item: array) {
            if (treeMap.containsKey(item)){
                treeMap.put(item, treeMap.get(item) + 1);
            }else {
                treeMap.put(item, 1);
            }
        }
        System.out.println(treeMap);
    }
}
