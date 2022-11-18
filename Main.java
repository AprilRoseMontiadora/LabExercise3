import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Cellphone vivo = new Cellphone("Vivo V21 Series");
		Cellphone specs = new Cellphone("44MP ois Night Selfie");
		
		
		System.out.println("" + vivo.getModel() + " " + specs.getModel());
	}
}
