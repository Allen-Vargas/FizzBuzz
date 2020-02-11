public class Program {
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.generarMuchos();
	}
}
	
class FizzBuzz {
	
	void generarMuchos() {
		for(int i = 0; i < 100; i++)
			{
				if (i % 3 == 0 && i % 5 == 0)
				{
					System.out.println("FizzBuzz");                    
				}
				else
				{
					if(i % 3 == 0)
					{
						System.out.println("Fizz");
					}
					else
					{
						if(i % 5 == 0)
						{
							System.out.println("Buzz");
						}
						else
						{
							System.out.println(i);
						}				
					}	
				}		
		    }
	}
	
	String generarPara(int numero) {
		String cadena = String.valueOf(numero); 
		return cadena;
	}
}