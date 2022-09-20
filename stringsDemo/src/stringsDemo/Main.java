package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		// Stringin uzunluğunu verir.
		System.out.println("Eleman sayısı: " + mesaj.length());

		// İstediğimiz dizindeki karakteri verir.
		System.out.println("5. eleman: " + mesaj.charAt(4));

		// İki stringi birleştirmemizi sağlar.
		System.out.println(mesaj.concat(" Yaşasın."));

		// Stringin girdiğimiz karakterle başlayıp başlamadığını boolean olarak döner.
		System.out.println(mesaj.startsWith("B"));

		// Stringin girdiğimiz karakterle bitip bitmediğini boolean olarak döner.
		System.out.println(mesaj.endsWith("ğ"));

		// Belirli indeks aralığındaki karakterleri almak istediğimizde kullanırız.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		// Girdiğimiz karakter ya da karakterlerin kaçıncı indeksten itibaren olduğunu
		// döner.
		System.out.println(mesaj.indexOf("hava"));

		// Girdiğimiz karakter ya da karakterlerin kaçıncı indeksten itibaren olduğunu
		// tersten aratır.
		System.out.println(mesaj.lastIndexOf("ü"));

		// Karakterleri değiştirmek için kullanılır
		System.out.println(mesaj.replace("güzel", "güzeldi"));

		// Belirli bir indeksten itibaren ya da belirli indeks aralığındaki karakterleri
		// almamızı sağlar.
		System.out.println(mesaj.substring(6));
		System.out.println(mesaj.substring(6, 10));

		// Girdiğimiz karakteri referans alarak stringi parçalar böler.
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//Tüm stringi küçük harfe dönüştürür
		System.out.println(mesaj.toLowerCase());
		
		//Tüm stringi büyük harfe dönüştürür
		System.out.println(mesaj.toUpperCase());
		
		//Stringin başında ve sonunda boşluk varsa silmemize yarar
		System.out.println(mesaj.trim());

	}

}
