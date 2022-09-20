package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'i';

		switch (harf) {
		case 'a':
		case 'A':
		case 'ı':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'e':
		case 'E':
		case 'i':
		case 'İ':
		case 'ö':
		case 'Ö':
		case 'ü':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Lütfen geçerli bir harf giriniz");
		}

	}

}
