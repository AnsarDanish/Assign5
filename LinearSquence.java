package Assignment5;

public class LinearSquence extends Sequence
{
    private double current;
    private  double step;
    LinearSquence(double a, double b)
    {
        current=a;
        step=b;
    }
     double next()
     {
          double  term = current;
          current=current+step;
          return term;
     }
}
