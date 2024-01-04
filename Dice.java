
public class Dice
{
    Die6 Die1; 
    Die6 Die2;
    Die6 Die3;
    Die6 Die4;
    Die6 Die5;
    public Dice()
    {
        Die1 = new Die6();
        Die2 = new Die6();
        Die3 = new Die6();
        Die4 = new Die6();
        Die5 = new Die6();
    }

    public void roll() { 
        Die1.roll();
        Die2.roll();
        Die3.roll();
        Die4.roll();
        Die5.roll();
    }

    public int summarize() {
        if (dieNumber = 1) {
            this.Die1.roll();
        if (dieNumber = 2) {
            this.Die2.roll();
        if (dieNumber = 3) {
            this.Die3.roll();
        }
        
            
        }
        }
        
    }

    public int rollAndGetValue() {
        roll();
        return getvalue();
    }
}
