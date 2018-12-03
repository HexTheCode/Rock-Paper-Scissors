
public class rpsBot {
	static String[] opciones = { "piedra", "papel", "tijera" };
	int opcion;

	public static String botOp() {
		int rnd = (int) (Math.random() * 3) + 1;

		if (rnd == 1) {
			return opciones[0];
		}
		if (rnd == 2) {
			return opciones[1];
		}
		if (rnd == 3) {
			return opciones[2];
		} else {
			return null;
		}
	}
}
