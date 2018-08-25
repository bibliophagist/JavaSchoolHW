package lecture1.hw.customer;

import lecture1.hw.order.Item;
import lecture1.hw.order.Order;

public class CustomerImitation {
    public static void main(String[] args) {
        Order order = new Order(new Item("first"), new Item("second"));
        order.addItemToOrder(new Item("third"));
        order.addItemToOrder(new Item("fourth"));
        order.addItemToOrder(new Item("fifth"));
        order.printListOfItems();
    }
}
