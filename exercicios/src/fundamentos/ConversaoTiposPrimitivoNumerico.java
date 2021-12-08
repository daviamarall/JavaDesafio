package fundamentos;

public class ConversaoTiposPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // implicita
		System.out.println(a);

		float b = (float) 1.123456798; // explicita (CAST)
		System.out.println(b);

		int c = 127;
		byte d = (byte) c;
		System.out.println(d); // explicita (CAST)

		double e = 1;
		int f = (int) e;
		System.out.println(f); // explicita (CAST)

	}

}
