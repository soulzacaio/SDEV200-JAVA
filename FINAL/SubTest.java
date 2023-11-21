public class SubTest
{

    public static void main(String[] args)
    {
        Sub mySub = new Sub(true, 1, 1, 1);

        System.out.println(mySub);

        mySub.setBread(0);
        mySub.setMeat(0);
        mySub.setPrice();

        System.out.println(mySub);

        System.out.println(mySub.getBread());
        System.out.println(mySub.getMeat());
        System.out.println(mySub.getPrice());

    }
}
