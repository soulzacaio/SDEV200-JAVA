import java.util.*;

public class Order
{
    private Vector<Shake> myShakes;
    private Vector<Sub> mySubs;
    // private float subTotal;
    public Customer customer;

    Order()
    {
        myShakes = new Vector<>();
        mySubs = new Vector<>();
    }

    public Vector<Shake> getShakes()
    {
        return myShakes;
    }

    public Vector<Sub> getSubs()
    {
        return mySubs;
    }

    public boolean isEmpty()
    {
        return myShakes.size() == 0 && mySubs.size() == 0;
    }

    public void addShake(Shake newShake)
    {
        myShakes.add(newShake);
    }

    public void addSub(Sub newSub)
    {
        mySubs.add(newSub);
    }

    public float getSubTotal()
    {
        float subTotal = 0;
        for (Shake s : myShakes)
            subTotal += s.getPrice();

        for (Sub sub : mySubs)
            subTotal += sub.getPrice();

        // subTotal *= 1.07F; // sales tax
        // subTotal += 3.5F; // delivery fee
        return subTotal;
    }

    public float getTotal()
    {
        return getSubTotal() * 1.07F + 3.5F;
    }

    public void setCustomer(String name, String address, String phoneNum)
    {
        customer = new Customer(name, address, phoneNum);
    }

    public String getCustomer()
    {
        return customer.name + '\n' + customer.address + '\n' + customer.phoneNumber;
    }

    @Override
    public String toString()
    {
        int numShakes = 0;
        StringBuilder buffer = new StringBuilder();

        buffer.append("Your shakes:\n\n");

        for (Shake shk : myShakes)
        {
            numShakes++;
            buffer.append("#" + numShakes + " -- " + shk.toString() + '\n');
        }

        int numSubs = 0;
        buffer.append("\nYour Subs: \n\n");

        for (Sub s : mySubs)
        {
            numSubs++;
            buffer.append("#" + numSubs + " -- " + s.toString() + '\n');
        }

        buffer.append("\nNumber of Items: " + (numShakes + numSubs) + '\n');
        buffer.append("Subtotal: $" + String.format("%.2f", getSubTotal()) + '\n');
        buffer.append("Tax: $" + String.format("%.2f", getSubTotal() * .07F) + '\n');
        buffer.append("Delivery fee: $" + String.format("%.2f", 3.50F) + '\n');
        buffer.append("Total: $" + String.format("%.2f", getTotal()));

        return buffer.toString();
    }
}
