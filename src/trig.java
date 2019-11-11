public class trig
{
    final double pi = 3.14159265359;

    public double sin(double x)
    {
        double sum = 0;
        int denom;
        double numrad = x * (2 * pi/360);
        int sign = 1;
        for(int counter = 0; counter < 9; counter++)
        {
            denom = counter * 2 + 1;
            sum += sign * pow(numrad,denom)/factorial(denom);
            sign *= -1;
        }
        return sum;
    }


    public double factorial(int i)
    {
        double factorial = i;
        for(i=i;i>1;i--)
        {
            factorial=factorial*(i-1);
        }
        return factorial;
    }

    public double pow(double i,long j)
    {
        double k=i;
        for(j=j;j>1;j--)
        {
            i=i*k;
        }
        return i;
    }
}
