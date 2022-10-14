public class Banner
{
    private  float width;
    private float  height;

     public boolean resize(float w, float h)
    {
        if(w>=h)
        {
        width=w;
        height=h;
        return true;
        }

        return false;
    }

    public double area()
    {
        return width*height;
    } 

    Banner ()
    {
        width=20;
        height=10;
    }
}