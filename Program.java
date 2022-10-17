package Assignment5;

import java.util.Scanner;

public class Program {

    static double compute (Sequence seq , int count)
    {
        if(seq instanceof PowerSequence)
        {
         Resetable rs = (Resetable)seq;
         rs.reset();
        }

        return seq.sum(count)/count;
    }

    public static void main(String[] args) {
        
        LinearSquence a= new LinearSquence(2, 5);
        PowerSequence b = new PowerSequence(3);

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of terms");
        int count = sc.nextInt();

        System.out.println(" first linear computation result =  "+ compute(a,count));
        System.out.println(" second linear computation result =  "+ compute(a,count));
        System.out.println(" first power computation result =  "+ compute(b,count));
        System.out.println(" second power computation result =  "+ compute(b,count));
    }
    
}
