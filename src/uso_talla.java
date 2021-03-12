import java.util.*;
public class uso_talla {
	
	enum talla{
		chica("s"),mediana("x"),grande("xl"),extragrande("xxl");
		
		private talla(String abre) {
			abrebiatura = abre;
		}
		public String DameAbrebiatura() {
			return abrebiatura;
		}
		
		private String abrebiatura;
	}
	
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("chica,mediana,grande,extragrande");
		String connsola = consola.next();
		talla la_talla = Enum.valueOf(talla.class, connsola);
		System.out.println(la_talla);
		System.out.println(la_talla.DameAbrebiatura());
	}

}
