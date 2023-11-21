public class Test
{
    public static void main(String[] args)
    {
        Shake newShake = new Shake(1, 1, 1);

        System.out.println(newShake);

        newShake.setSize(2);

        System.out.println(newShake);
        System.out.println(newShake.getSize());

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                {
                    Shake newShake1 = new Shake(i, j, k);
                    System.out.println(newShake1);
                }

        Sub newSub = new Sub(true, 1, 1, 2);
        Sub newSub2 = new Sub(false, 1, 1, 2);
        boolean b = false;

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                {
                    Sub n = new Sub(b, j, k, 1);
                    System.out.println(n);
                }
            b = true;
        }
    }
}
