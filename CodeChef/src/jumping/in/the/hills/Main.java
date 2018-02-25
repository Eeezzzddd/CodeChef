package jumping.in.the.hills;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = Integer.parseInt(scanner.nextLine());
		while (T > 0) {

		List<Integer> NUD = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt)
				.collect(Collectors.toList());

		int N = NUD.get(0);
		int U = NUD.get(1);
		int D = NUD.get(2);

		List<Integer> montagnes = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt)
				.collect(Collectors.toList());

		

			int i = 0;
			boolean parachute = true;
			boolean avance = true;

			while (avance) {

				int initPos = i;
				int nextPos = i + 1;

				if (nextPos == N)
					avance = false;

				else if (montagnes.get(nextPos) - montagnes.get(initPos) > U)
					avance = false;

				else if (montagnes.get(initPos) - montagnes.get(nextPos) > D) {
					if (parachute) {
						parachute = false;
					} else {
						avance = false;
					}
				}

				if (avance)
					i++;

			}

			T--;
			System.out.println(i + 1);
		}
	}

}
