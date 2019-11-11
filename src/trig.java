
class trig
{
    private final double pi = 3.141592653589793;

    double sin(double degree)
    {
        double sum = 0;
        int denom;
        double numrad = degree * (2 * pi/360);
        int sign = 1;
        for(int counter = 0; counter < 11; counter++)
        {
            denom = counter * 2 + 1;
            sum += sign * pow(numrad,denom)/factorial(denom);
            sign *= -1;
        }
        return sum;
    }

    double cos(double degree)
    {
        double sum = 1;
        int denom;
        double numrad = degree * (2 * pi/360);
        int sign = -1;
        for(int counter = 1; counter < 11; counter++)
        {
            denom = counter * 2 ;
            sum += sign * pow(numrad,denom)/factorial(denom);
            sign *= -1;
            System.out.println(sum);
        }
        return sum;
    }


    double factorial(int i)
    {
        double factorial = i;
        for(; i>1; i--)
        {
            factorial=factorial*(i-1);
        }
        return factorial;
    }

    double pow(double i,long j)
    {
        double k=i;
        for(; j>1; j--)
        {
            i=i*k;
        }
        return i;
    }
}
