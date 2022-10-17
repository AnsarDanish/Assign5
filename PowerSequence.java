package Assignment5;

public class PowerSequence extends Sequence implements Resetable
{
    
    private double current;
    private double factor;

    PowerSequence(double ratio)
    {
            current=1;
            factor=ratio;
    }
  public double  next()
    {
        double term= current;
        current=current*factor;
        return term;
    }

    public void reset()
    {
        current=1;
    }

}
