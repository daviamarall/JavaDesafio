package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "TAISS");
		s = s.concat("!!!");
	
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X","Davi")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}

}
