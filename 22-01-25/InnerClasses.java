class A
{
	public class B
	{
		public class C
		{
			public void demo()
			{
				System.out.println("I am coming from the innermost class method");
			}
		}
	}

	static class D{
		class E {
			public void demo()
			{
				System.out.println("I am coming from the inner most static class method");
			}
			// Inner methods can be static only when inner class is static in older versions of java.
		}
	}
}
public class InnerClasses
{
	public static void main(String args[])
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.demo();

		new A().new B().new C().demo();

		// new A.D.E().demo();

		new A.D().new E().demo();
	}
}