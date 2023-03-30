public class Detik
{
	int d, hari, jam, menit, detik;
	public Detik(int d)
	{
		this.d=d;
	}
	public Detik (){}
	void konversi()
	{
		hari=d/86400;
		jam=(d % 86400)/3600;
		menit=((d % 86400)%3600)/60;
		detik=((d % 86400)%3600)%60;		
	}
	void cetak ()
	{
		System.out.println("Detik		: "+detik);
		System.out.println("Hari		: "+hari);
		System.out.println("Jam		: "+jam);
		System.out.println("Menit		: "+menit);
		System.out.println("Detik		: "+detik);
	}
}