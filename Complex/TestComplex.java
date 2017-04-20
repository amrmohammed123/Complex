public class TestComplex
{
    public static void main(String args[])
    {
        testConstructors();
		testReal();
		testImag();
		testSetReal();
		testSetImag();
		testMagnitude();
		testPhase();
		testAdd();
		testSub();
		testDivide();
		testMultiply();
		testEquals();
		testToString();
		testCompareTo();
		testScale();
    }
	public static void testConstructors()
	{
		Complex s1 = new Complex();
		if(s1.a != 0 || s1.b !=0)
		{
			System.out.println("there is a problem with the zero constructor");
			return;
		}
		Complex s2 = new Complex(10);
		if(s2.a != 10 || s2.b !=0)
		{
			System.out.println("there is a problem with the real number constructor");
			return;
		}
		Complex s3 = new Complex(10,5);
		if(s3.a != 10 || s3.b != 5)
		{
			System.out.println("there is a problem with the complex number constructor");
			return;
		}
		System.out.println("Good");
	}
	public static void testReal()
	{
		Complex s = new Complex(15);
		if(s.real() != 15)
			System.out.println("there is a problem with the method real");
		else
			System.out.println("Good");
	}
	public static void testImag()
	{
		Complex s = new Complex(15,20);
		if(s.imag() != 20)
			System.out.println("there is a problem with the method imag");
		else
			System.out.println("Good");
	}
	public static void testSetReal()
	{
		Complex s = new Complex(10);
		s.setReal(30);
		if(s.a != 30)
			System.out.println("there is a problem with the method setReal");
		else
			System.out.println("Good");
	}
	public static void testSetImag()
	{
		Complex s = new Complex(10,50);
		s.setImag(70);
		if(s.b != 70)
			System.out.println("there is a problem with the method setImag");
		else
			System.out.println("Good");
	}
	public static void testMagnitude()
	{
		Complex s = new Complex(3,4);
		if(Math.abs(s.magnitude() - 5)  < 0.001)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method magnitude");
	}
	public static void testPhase()
	{
		Complex s = new Complex(-3);
		if(s.phase() != 180)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s2 = new Complex(3);
		if(s2.phase() != 0)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s3 = new Complex(3,10);
		if(Math.abs(s3.phase() - 73.3)  > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s4 = new Complex(3,-10);
		if(Math.abs(s4.phase() + 73.3)  > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s5 = new Complex(-3,10);
		if(Math.abs(s5.phase() -106.699)  > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s6 = new Complex(-3,-10);
		if(Math.abs(s6.phase() +106.699)  > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s7 = new Complex(0,-10);
		if(Math.abs(s7.phase() + 90) > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		Complex s8 = new Complex(0,10);
		if(Math.abs(s8.phase() - 90) > 0.1)
		{
			System.out.println("there is a problem with the method phase");
			return;
		}
		System.out.println("Good");
	}
	public static void testAdd()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(1,2);
		Complex s3 = s.add(s2);
		if(s3.real() == 6 && s3.imag() == 12)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method add");
	}
	public static void testSub()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(1,2);
		Complex s3 = s.sub(s2);
		if(s3.real() == 4 && s3.imag() == 8)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method sub");
	}
	public static void testDivide()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(1,2);
		Complex s3 = s.divide(s2);
		if(s3.real() == 5 && s3.imag() == 0)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method divide");
	}
	public static void testMultiply()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(1,2);
		Complex s3 = s.multiply(s2);
		if(s3.real() == -15 && s3.imag() == 20)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method multiply");
	}
	public static void testEquals()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(5,10);
		Complex s3 = new Complex(5,9);
		if(s.equals(s2) && !s.equals(s3))
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method equals");
	}
	public static void testToString()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex();
		Complex s3 = new Complex(0,10);
		Complex s4 = new Complex(5);
		Complex s5 = new Complex(5,1);
		Complex s6 = new Complex(5,-3);
		if(s.toString().equals("5+10i") && s2.toString().equals("0") && s3.toString().equals("10i") && s4.toString().equals("5") 
			&& s5.toString().equals("5+i") && s6.toString().equals("5-3i"))
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method toString");
	}
	public static void testCompareTo()
	{
		Complex s = new Complex(5,10);
		Complex s2 = new Complex(5,10);
		Complex s3 = new Complex(3,4);
		Complex s4 = new Complex(10,20);
		if(s.compareTo(s2) == 0 && s.compareTo(s3) == 1 && s.compareTo(s4) == -1)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method compareTo");
	}
	public static void testScale()
	{
		Complex s = new Complex(5,10);
		s.scale(2);
		if(s.real() == 10 && s.imag() == 20)
			System.out.println("Good");
		else
			System.out.println("there is a problem with the method testScale");
	}
}