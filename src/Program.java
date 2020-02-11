public class Program {
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.generarMuchos();
	}
}
	
class FizzBuzz {
	
	/* Procedimiento que genera 100 numero del 0 al 99 mostrando en patalla Fizz, Buzz o el numero*/
	void generarMuchos() {
		for(int i = 0; i < 100; i++)
			{
				System.out.println(generarPara(i));
					
		    }
	}
	
	/* Funcion que devuelve Fizz, Buzz o el numero en String de un solo numero */
	static String generarPara(int numero) {
		
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			return "FizzBuzz";                  
		}
		else
		{
			if(numero % 3 == 0)
			{
				return "Fizz";
			}
			else
			{
				if(numero % 5 == 0)
				{
					return "Buzz";
				}
				else
				{
					return String.valueOf(numero);
				}				
			}	
		}	
	}
}