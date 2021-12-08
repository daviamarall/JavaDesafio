package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		System.out.println(
				"byte: 1 byte (8 bits, de -128 à 127)\r\n" + "short: 2 bytes (16 bits, de -32.768 à 32.767)\r\n"
						+ "char: 2 bytes (16 bits, de 0 à 65.535 (somente positivos))\r\n"
						+ "int: 4 bytes (32 bits, de -2.147.483.648 à 2.147.483.647)\r\n"
						+ "long: 8 bytes (64 bits, de 9.223.372.036.854.775.808 à -9.223.372.036.854.775.807)\r\n"
						+ "float: 4 bytes (32 bits, de +/-1.4 * 10⁴⁵ à +/-3.4028235 * 10³⁸)\r\n"
						+ "double: 64 bytes (64 bits, de +/-4.9 à +/-1.7976931348623147 * 10³⁰⁸)");

		// informações de funcionario
		// Tipos numéricos inteiros

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 327;
		int id = 548456;
		long pontosAcumulados = 54564646546L;

		// Tipos númericos reais
		float salario = 11445.44f;
		double vendasAcumuladas = 14584684687664684d;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caractere
		char status = 'a';

		// Diazs de empresa
		System.out.println(anosDeEmpresa * 365);

		// Número de viagens
		System.out.println(numeroDeVoos / 2);

		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("status: " + status);

	}

}
