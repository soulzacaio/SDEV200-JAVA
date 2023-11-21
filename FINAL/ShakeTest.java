
public class ShakeTest
{
    public static void main(String[] args)
    {
        Shake myShake = new Shake(1, 1, 1);
        System.out.println(myShake);


        myShake.setSize(0);
        myShake.setFlavor(0);
        myShake.addToppings(0);
        myShake.setPrice();

        System.out.println(myShake.getSize());
        System.out.println(myShake.getFlavor());
        System.out.println(myShake.getToppings());
        System.out.println(myShake.getPrice());
    }
}
