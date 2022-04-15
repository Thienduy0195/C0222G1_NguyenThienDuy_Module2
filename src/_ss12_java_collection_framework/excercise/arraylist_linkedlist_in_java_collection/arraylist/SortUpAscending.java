package _ss12_java_collection_framework.excercise.arraylist_linkedlist_in_java_collection.arraylist;

import java.util.Comparator;

public class SortUpAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        } else if(o1.getPrice() < o2.getPrice()){
            return -1;
        } else{
            return 0;
        }
    }
}
