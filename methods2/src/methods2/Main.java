package methods2;

public class Main {

	public static void main (String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj=mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		System.out.println(topla(3,9));
		int toplam = topla2(1,3,6,9,7);
		System.out.println(toplam);
		
	}
	public static void ekle() {
		System.out.println("eklendi");
		
	}
	public static void sil()
	{
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	// ekranda çýktý olmasý metodun bir þey döndürdüðü anlamýna gelmez.
	public static int topla(int a,int b) {
		return a+b;
	}
	// variable arguments: istediðimiz kadar parametre gönderebilmek için.
	public static int topla2 (int... sayilar) {
		// int... sayilar: sayilar array'i mantýgý gibi calisir.
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
			
		}
		return toplam;
	}
}
