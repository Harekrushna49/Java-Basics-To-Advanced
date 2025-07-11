class Calculator
{
	int Add(int z, int c)
	{
		int x = z + c;
		return x;
	}

	public static void main(String []args)
	{
		int a=5;
		int b=10;
		Calculator calc = new Calculator();
		int result = calc.Add(a,b);
		System.out.println(result);
	}
}