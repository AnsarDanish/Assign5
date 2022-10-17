package Assignment5;

public  abstract class Sequence {
    
    abstract double next();

    double sum(int count)
    {
        double total=0;

        for(int i=1;i<=count;++i)
        {
            total=total+next();
        }

        return total;
    }
}
