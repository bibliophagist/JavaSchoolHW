package Lecture1.Order;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private final ArrayList<Item> listOfItems = new ArrayList<>();

    public Order(Item... items) {
        listOfItems.addAll(Arrays.asList(items));
    }

    public void addItemToOrder(Item item) {
        if (item != null) {
            this.listOfItems.add(item);
        }
    }

    public void printListOfItems(){
        for (Item item: this.listOfItems){
            System.out.println(item.getName());
        }
    }
}
