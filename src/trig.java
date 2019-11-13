
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

    double tan(double degree)throws invalidInputException
    {
        if(cos(degree)<1E-15)
        {
            throw new invalidInputException("Invalid input\nCan not tan 90 degree or 270 degree");
        }
        return sin(degree)/cos(degree);
    }

    double arcsin(double sin) throws invalidInputException
    {
        if(abs(sin)>1)
        {
            throw new invalidInputException("Invalid input\nRange of arcsin is |x|<1");
        }
        double sum = sin;
        for(int counter=1;counter<80;counter++)
        {
            sum+=factorial(2*counter)*pow(sin,2*counter+1)/(pow(2,2*counter)*factorial(counter)*factorial(counter)*(2*counter+1));
        }
        return sum;
    }

    double arccos(double cos) throws invalidInputException
    {
        if(abs(cos)>1)
        {
            throw new invalidInputException("Invalid input\nRange of arccos is |x|<1");
        }
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
                sum += sign /((2*counter+1)*pow(tan,2*counter+1));
                sign *= -1;
            }
            return sum;
        }
    }

    double sec(double degree) throws invalidInputException
    {
        if(cos(degree)<1E-15)
        {
            throw new invalidInputException("Invalid input\nCan not sce 90 degree or 270 degree");
        }
        return 1/cos(degree);
    }

    double csc(double degree) throws invalidInputException
    {
        if(degree%180==0)
        {
            throw new invalidInputException("Invalid input\nCan not sce 180 degree or 360 degree");
        }
        return 1/sin(degree);
    }

    double cot(double degree) throws invalidInputException
    {
        return 1/tan(degree);
    }

    double abs(double num)
    {
        if (num<0)
            return -num;
        return num;
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
