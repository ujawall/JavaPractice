package pack1;

class MultipleCatchBlocks {	
	public void multiplecatch() {
		int arr[]=new int[5];
		try {
			arr[5]=30/0; //Arithmetic Exception
		  //arr[5]=30/2; //ArrayIndexOutOfBounds Exception
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Got out of the block");
	}
}
