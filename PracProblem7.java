import java.util.*;

class NegativeQuantityException extends Exception {
    NegativeQuantityException(String message) {
        super(message);
    }
}

class ItemNotFoundExpcetion extends Exception {
    ItemNotFoundExpcetion(String message) {
        super(message);
    }
}

class CartItem {
    private String name;
    private double price;
    private int quantity;

    CartItem(String name, double price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    String getName() {
        return this.name;
    }
    double getPrice() {
        return this.price;
    }
    int getQuantity() {
        return this.quantity;
    }

    void updateQuantity(int addQuantity) {
        this.quantity+=quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart=new ArrayList<>();

    void addItems(CartItem item) throws NegativeQuantityException{
        if(item.getPrice()<=0||item.getQuantity()<=0)  
            throw new NegativeQuantityException("The price and Quantity cannot be negative");

        else if(cart.isEmpty()) {
            cart.add(item);
            System.out.println("Item added in cart!");
        }
        else {
            int size=cart.size();
            int i=0;
            int flag=1;
            while(i<size) {
                if(cart.get(i).getName().equalsIgnoreCase(item.getName())) {
                    cart.get(i).updateQuantity(item.getQuantity());
                    System.out.println("Item Quantity updated in cart!");
                    flag=0;
                }
                i++;
            }
            if(flag==1) {
                cart.add(item);
                System.out.println("Item added in cart!");
            }
        }
    }
    void removeItem(String itemName) throws ItemNotFoundExpcetion{
        if(cart.isEmpty()) {
            System.out.println("The cart is empty!");
        }
        else {
            int size=cart.size();
            int i=0;
            int flag=1;
            while(i<size&&flag==1) {
                CartItem specificItem=cart.get(i);
                if(cart.get(i).getName().equalsIgnoreCase(itemName)) {
                    cart.remove(specificItem);
                    flag=0;
                }
                i++;
            }
            if(flag==1)    
                throw new ItemNotFoundExpcetion("Item not present in cart!");
        }
    }
    void calculateTotal() {
        if(cart.isEmpty()) {
            System.out.println("The cart is empty!");
        }
        else {
            int totalPrice=0;
            int size=cart.size();
            int i=0;
            while(i<size) {
                double itemprice=cart.get(i).getPrice();
                totalPrice+=itemprice;
                i++;
            }
            System.out.println("Total Price of cart at checkout: "+totalPrice); 
        }
    }
}

public class PracProblem7 {
    public static void main(String[] args) throws Exception{
        CartItem item1=new CartItem("apple", 200, 2);
        CartItem item2=new CartItem("banana", 45, 1);

        CartItem item3=new CartItem("oranges", -200, 5);

        ShoppingCart cart=new ShoppingCart();

        cart.addItems(item1);
        cart.addItems(item2);
        //cart.addItems(item3);
        cart.calculateTotal();
        cart.removeItem("apple");
        cart.calculateTotal();
    }
}
