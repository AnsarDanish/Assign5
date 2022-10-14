public class CurvedBanner extends Banner
 {
    private float radius;
     
    CurvedBanner()
    {
        super();
        radius=2;
    }
    public double area()
    {
         return (super.area()- 0.2*super.area());
    }
    
    public boolean resize(float w, float h,int r)
    {
       
        if(w>=h)
        {
            super.resize(w, h);
            radius=r;
            return true;
       }

        return false;
    }

}
