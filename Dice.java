
public class Dice
{

    Die6 Die1;
    Die6 Die2;

    public Dice()
    {
        Die1 = new Die6();
        Die2 = new Die6();
    }

    public void roll() { 
        Die1.roll();
        Die2.roll();
    }

    public int getvalue() {
        return Die1.getValue()+Die2.getValue();
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
