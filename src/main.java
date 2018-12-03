import java.util.Scanner;

public class main {

	static String[] opciones = { "piedra", "papel", "tijera" };
	static String playerOpcions;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|   Juego    |");
		System.out.println("|   Clasico  |");
		System.out.println("|   Piedra,  |");
		System.out.println("|   Papel y  |");
		System.out.println("|   Tijera   |");
		System.out.println("|            |");
		System.out.println("+------------+");
		juego();

	}

	public static void juego() {
		rpsBot bot = new rpsBot();
		String botop = bot.botOp();
		System.out.println("Elige 1 (piedra) 2 (papel) 3(tijera):");
		int inp = s.nextInt();
		switch (inp) {
		case 1:
			playerOpcions = opciones[0];
			break;
		case 2:
			playerOpcions = opciones[1];
			break;
		case 3:
			playerOpcions = opciones[2];
			break;
		}

		if (playerOpcions == opciones[0] && botop == opciones[1]) {
			// gana bot
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana bot.");
		}
		if (playerOpcions == opciones[0] && botop == opciones[2]) {
			// gana player
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana player.");
		}
		if (playerOpcions == opciones[0] && botop == opciones[0]) {
			// gana player
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " empate.");
		}
		if (playerOpcions == opciones[1] && botop == opciones[0]) {
			// gana player
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana player.");
		}
		if (playerOpcions == opciones[1] && botop == opciones[2]) {
			// gana bot
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana bot.");
		}
		if (playerOpcions == opciones[1] && botop == opciones[1]) {
			// gana bot
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " empate.");
		}
		if (playerOpcions == opciones[2] && botop == opciones[1]) {
			// gana player
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana player.");
		}
		if (playerOpcions == opciones[2] && botop == opciones[0]) {
			// gana bot
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " gana bot.");
		}
		if (playerOpcions == opciones[2] && botop == opciones[2]) {
			// gana player
			System.out.println("Player ha sacado " + playerOpcions + " y el Bot ha sacado " + botop + " empate.");
		}

	}

}
