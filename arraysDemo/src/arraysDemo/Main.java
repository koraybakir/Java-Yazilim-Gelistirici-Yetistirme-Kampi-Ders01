package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Koray";
		String ogrenci2 = "Mukaddes";
		String ogrenci3 = "Yusuf";
		String ogrenci4 = "Eymen";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Koray";
		ogrenciler[1] = "Mukaddes";
		ogrenciler[2] = "Yusuf";
		ogrenciler[3] = "Eymen";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
