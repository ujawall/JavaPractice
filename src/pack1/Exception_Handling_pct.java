package pack1;

class ExceptionHandlingpct{
	/*{
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println("Divide by zero not possible" +e);
	}
}*/
	void areaOfRectangle() throws DimensionException{
		int l=10,b=-5;
		if(l<0 || b<0)throw new DimensionException();
		int area=l*b; 
	}
	void Area1()throws DimensionException{
		areaOfRectangle();
	}
	void Area2() {
		try {
			Area1(); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

