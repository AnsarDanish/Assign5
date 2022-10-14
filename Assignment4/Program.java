import java.util.Scanner;

public class Program {

    public  static double  bannerPrice(Banner b, int n)
    {
           float rate = n <5 ? 0.80f: 0.75f;
            double t = n*rate*b.area() ;
            System.out.println(" price :"+t);
           return(t );
    }

    public static void main(String[] args) {
        Banner a= new Banner();
        System.out.println(" enter Banner details both size and number of copies : ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        int n = sc.nextInt();
        a.resize(x,y);
       /*  float x=Float.parseFloat(args[0]);
        float y= Float.parseFloat(args[1]);
        int n= Integer.parseInt(args[2]); */
        System.out.println(" enter CurvedBanner details both size, radius and  number of copies : ");
      //  Scanner sc = new Scanner(System.in);
        CurvedBanner cc= new CurvedBanner();
         x = sc.nextFloat();
         y = sc.nextFloat();
         int radius=  sc.nextInt();
         n = sc.nextInt();
        cc.resize(x,y,radius);

        System.out.println(" price of Banner is : "+ bannerPrice(a,n));

        System.out.println(" price of  Curved Banner is : "+ bannerPrice(cc,n));
        

    }
    
}
