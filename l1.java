package complex;

import static java.lang.Math.hypot;
import static java.lang.System.out;

public class l1
{
    //Creating the object of a complex number
    static class Complex
        {
            float a1; //The real part of number
            float b1; //The imagine part of number

            //Creating the constructor method
            Complex(float real_part, float imagine_part)
            
                {   
                    a1 = real_part;
                    b1 = imagine_part;
                }
        }   
// Math.hypot = sqrt( a*a - b*b)
    static float polar(Complex complex1)
        {
            float polar;
            polar = (float) hypot(complex1.a1, complex1.b1);
            System.out.printf("Polar(complex1) =  %.1f " + '\n',polar);
            return (polar);
        }

    static Complex show(Complex complex1,Complex complex2)
        {
            System.out.printf("Re(complex1) = %.1f"+ '\n', + complex1.a1);
            System.out.printf("Im(complex1) = %.1fi"+'\n', + complex1.b1);
            System.out.printf("Re(complex2) = %.1f"+ '\n', + complex2.a1);
            System.out.printf("Im(complex2) = %.1fi"+'\n', + complex2.b1);
            return (complex1);
                 
        }
    static Complex show_complex(Complex complex1, Complex complex2)
    {
        System.out.printf("Complex1 = %.1f + %.1fi"+ '\n', + complex1.a1, complex1.b1);
        System.out.printf("Complex2 = %.1f + %.1fi"+'\n', + complex2.a1, complex2.b1);
        return (complex1);
    }

    static Complex add(Complex complex1, Complex complex2)

        {
            Complex add1 = new Complex(0,0);
            add1.a1 = complex1.a1 + complex2.a1;
            add1.b1 = complex1.b1 + complex2.b1;
            out.printf("Add = %.1f + %.1fi"+'\n', add1.a1, add1.b1);
            return (add1);
        }

    static Complex substract(Complex complex1, Complex complex2)
        {
            Complex substract1 = new Complex(0,0);
            substract1.a1 = complex1.a1 - complex2.a1;
            substract1.b1 = complex1.b1 - complex2.b1;
            System.out.printf("Substract = %.1f + %.1fi"+'\n', substract1.a1, substract1.b1);
            return (substract1);
        }
