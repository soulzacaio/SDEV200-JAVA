public class OrderTest
{
    public static void main(String[] args)
    {

        Order myOrder = new Order();
        myOrder.setCustomer("John SubShake", "007 Behind Subway Alley", "777-777-777");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
            {
                myOrder.addShake(new Shake(i, j, 0));
                myOrder.addSub(new Sub(true, j, i, 0));
            }

        System.out.println(myOrder.toString());
    }
}
