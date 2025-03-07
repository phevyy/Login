package aa;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi , parola;
		System.out.println("Kullanıcı adı giriniz");
		k_adi = scan.nextLine();
		System.out.println("Parolanızı giriniz:");
		parola = scan.nextLine();
		
		if (k_adi.equals("Fikret") && parola.equals("123")){
			System.out.println("Başarılı bir şekilde giriş yaptınız");
		}else {
			System.out.println("Kullanıcı adı veya parola yanlış");
		}
	}

}
