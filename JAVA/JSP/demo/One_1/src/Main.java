

class Calc
{
    public void Show()
    {
        System.out.println("Calc");
    }
}

class AdvCalc extends Calc
{
    public void Show()
    {
        System.out.println("AdvCalc");
    }
}
public class Main
{
    public static void main(String args[])
    {
        AdvCalc obj=new AdvCalc();
        obj.Show();
    }
}