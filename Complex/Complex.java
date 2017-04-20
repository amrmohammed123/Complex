public class Complex implements Comparable<Complex>
{
	//a for the real part and b for the imaginary part
	double a , b;
	//constructor for number zero
	public Complex()
	{
		this.a = 0;
		this.b = 0;
	}
	//constructor for a real number
	public Complex(double a)
	{
		this.a = a;
		this.b = 0;
	}
	//constructor for complex number
	public Complex(double a , double b)
	{
		this.a = a;
		this.b = b;
	}
	//return the real part of the object
	public double real()
	{
		return a;
	}
	//return the imaginary part of the object
	public double imag()
	{
		return b;
	}
	//return a complex object its value is the sum of this object and the given complex s
	public Complex add(Complex s)
	{
		Complex temp = new Complex();
		temp.setReal(s.real() + this.a);
		temp.setImag(s.imag() + this.b);
		return temp;
	}
	//return a complex object its value is the subtraction of this object and the given complex s
	public Complex sub(Complex s)
	{
		Complex temp = new Complex();
		temp.setReal(this.a - s.real());
		temp.setImag(this.b - s.imag());
		return temp;
	}
	//return a complex object its value is the division of this object and the given complex s
	public Complex divide(Complex s)
	{
		Complex temp = new Complex();
		temp.setReal((this.a * s.real() + this.b * s.imag()) / (Math.pow(s.real(),2)+ Math.pow(s.imag(),2)));
		temp.setImag(( -1 * this.a * s.imag() + this.b * s.real()) / (Math.pow(s.real(),2)+ Math.pow(s.imag(),2)));
		return temp;
	}
	//return a complex object its value is the multiplication of this object and the given complex s
	public Complex multiply(Complex s)
	{
		Complex temp = new Complex();
		temp.setReal(this.a * s.real() - this.b * s.imag());
		temp.setImag(this.b * s.real() + this.a * s.imag());
		return temp;
	}
	//return the magnitude of this object
	public double magnitude()
	{
		return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	}
	//return the phase of the object
	public double phase()
	{
		if(b == 0)
		{
			if(a >= 0)
				return 0;
			else
				return 180;
		}
		if(a == 0 && b > 0)
			return 90;
		if(a == 0 && b < 0)
			return -90;
		if(a < 0 && b > 0)
			return 180 - Math.toDegrees(Math.atan(b/(-1 * a)));
		if(a < 0 && b < 0)
			return Math.toDegrees(Math.atan(b/a)) - 180;
		return Math.toDegrees(Math.atan(b/a));
	}
	//multiply the real and the imag part of this object by the given number
	public void scale(int x)
	{
		this.a *= x;
		this.b *= x;
	}
	//check if the given complex object equals to this object
	public boolean equals(Complex s)
	{
		return s.real() == this.a && s.imag() == this.b;
	}
	//set the value of the real part of this object
	public void setReal(double a)
	{
		this.a = a;
	}
	//set the value of the imaginary part of this object
	public void setImag(double b)
	{
		this.b = b;
	}
	//return string representation of the complex object
	public String toString()
	{
		if(this.a == 0 && this.b == 0)
			return "0";
		if(this.b == 0)
		{
			if(this.a == (int)this.a)
				return (int)a + "";
			return  a + "";
		}
		if(this.a == 0)
		{
			if(this.b == (int)this.b)
				return (int)b + "i";
			return b + "i";
		}
		if(b == 1)
		{
			if(this.a == (int)this.a)
				return (int)a + "+i";
			return a + "+i";
		}
		if(b < 0)
		{
			if(this.a == (int)this.a && this.b == (int)this.b)
				return (int)a + "-" + (int)(b * -1) + "i";
			if(this.a == (int)this.a && this.b != (int)this.b)
				return (int)a + "-" + (b * -1) + "i";
			if(this.a != (int)this.a && this.b == (int)this.b)
				return a + "-" +(int)(b * -1) + "i";
			return a + "-" + (b * -1) + "i";
		}
		if(this.a == (int)this.a && this.b == (int)this.b)
			return (int)a + "+" + (int)b + "i";
		if(this.a == (int)this.a && this.b != (int)this.b)
			return (int)a + "+" + b + "i";
		if(this.a != (int)this.a && this.b == (int)this.b)
			return a + "+" + (int)b + "i";
		return a + "+" + b + "i";
	}
	//compares the given complex object to this object(returns 0 if equals , 1 if this object is greater in magnitude and -1 otherwise)
    public int compareTo(Complex s)
	{
		if(s.equals(this))
			return 0;
		else if(this.magnitude() > s.magnitude())
			return 1;
		else
			return -1;
	}
}