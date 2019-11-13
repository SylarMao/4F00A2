
class trig
{
    private final double pi = 3.141592653589793;

    double sin(double degree)
    {
        double sum = 0;
        double numrad = degree * (2 * pi/360);
        int sign = 1;
        for(int counter = 0; counter < 11; counter++)
        {
            sum += sign * pow(numrad,counter * 2 + 1)/factorial(counter * 2 + 1);
            sign *= -1;
        }
        return sum;
    }

    double cos(double degree)
    {
        double sum = 1;
        double numrad = degree * (2 * pi/360);
        int sign = -1;
        for(int counter = 1; counter < 11; counter++)
        {
            sum += sign * pow(numrad,counter*2)/factorial(counter*2);
            sign *= -1;
        }
        return sum;
    }

    double tan(double degree)
    {
        return sin(degree)/cos(degree);
    }

    double arcsin(double sin)
    {
        double sum = sin;
        for(int counter=1;counter<80;counter++)
        {
            sum+=factorial(2*counter)*pow(sin,2*counter+1)/(pow(2,2*counter)*factorial(counter)*factorial(counter)*(2*counter+1));
        }
        return sum;
    }

    double arccos(double cos)
    {
        return pi/2-arcsin(cos);
    }

    double arctan(double tan)
    {
        if(abs(tan)<1)
        {
            double sum = 0;
            int sign = 1;
            for(int counter = 0; counter < 11; counter++)
            {
                sum += sign * pow(tan,counter * 2 + 1)/(counter * 2 + 1);
                sign *= -1;
            }
            return sum;
        }
        else
        {
            double first = pi/2;
            if(tan<=-1)
                first=-first;
            double sum = first;
            int sign = -1;
            for(int counter = 0; counter < 13; counter++)
            {
                sum += sign * 1/((2*counter+1)*pow(tan,2*counter+1));
                sign *= -1;
            }
            return sum;
        }
    }

    double sec(double degree)
    {
        return 1/cos(degree);
    }

    double csc(double degree)
    {
        return 1/sin(degree);
    }

    double cot(double degree)
    {
        return 1/tan(degree);
    }

    public double abs(double num)
    {
        if (num<0)
            return -num;
        return num;
    }

    public double factorial(int i)
    {
        double factorial = i;
        for(; i>1; i--)
        {
            factorial=factorial*(i-1);
        }
        return factorial;
    }

    public double pow(double i,long j)
    {
        double k=i;
        for(; j>1; j--)
        {
            i=i*k;
        }
        return i;
    }
}
