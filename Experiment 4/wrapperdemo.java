public class wrapperdemo
{   
    public static void main(String args[])
    {
        int a=5;
        Integer b=a;
        System.out.println("primitive value : "+a);
        System.out.println("Wrapper Integer object : "+b);

        Integer obj = 100;
        int num = obj;

        System.out.println("Wrapper Integer object: " + obj);
        System.out.println("Primitive int: " + num);
        
        double x =1.45;
        Double y;
        y=x;
        System.out.println("primitive is : "+x);
        System.out.println("Wrapper Double object : "+y);

        Double l=1.23;
        double z;
        z=l;
        System.out.println("Wrapper Double object : "+l);
        System.out.println("primitive is : "+z);

    }
}
