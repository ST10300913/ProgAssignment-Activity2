/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbakery;

/**
 *
 * @author teaga
 */
public class BakeryOrder {
     private BakeryProduct[] items;

    public BakeryProduct[] getItems() {
        return items;
    }

    public void setItems(BakeryProduct[] items) {
        this.items = items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    private int itemCount;

    public BakeryOrder(int maxItems) {
        items = new BakeryProduct[maxItems];
        itemCount = 0;
    }

    public void addItem(BakeryProduct item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Sorry, the order is full. Cannot add more items.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getItemPrice();
        }
        return total;
    }

   
}

