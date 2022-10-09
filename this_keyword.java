class A{
	void m(){
		System.out.println("Hello M");
	}
	void n(){
		System.out.println("Hello N");
		m();
	}
}

// main class

class this_keyword{
	public static void main(String args[]){
		A a=new A();
		a.n();
	}
}