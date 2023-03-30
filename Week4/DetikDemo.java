import java.util.Scanner;
public class DetikDemo
{
	public static void main(String args[])
	{
		String jwb="Y";
		Scanner key=new Scanner(System.in);
		//Detik detikku=new Detik(180761);
		Detik detikku=new Detik();
		
		do{
			System.out.print("Detik		: ");
			detikku.d=key.nextInt();
			detikku.konversi();
			detikku.cetak();
			System.out.print("Jawab [Y/T] : ");
			jwb=key.next();
		} while(jwb.equalsIgnoreCase("Y"));
	}
}