package fractalfintech.orderbook;

public class Order
{
    private double price;
    private int quantity;
    private String id;
    private long timestamp;

    public Order(double price, int quantity,String id)
    {
        this.price = price;
        this.quantity = quantity;
        this.id = id;
        this.timestamp = System.currentTimeMillis();
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int newQuantity)
    {
        this.quantity = newQuantity;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String toString()
    {
        return this.price + " " + this.quantity;
    }
}
