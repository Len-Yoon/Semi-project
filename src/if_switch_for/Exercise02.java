package if_switch_for;

public class Exercise02 {

	public static void main(String[] args) {
		while (true) {
			int i = (int) ((Math.random() * 6) + 1);
			int j = (int) ((Math.random() * 6) + 1);
			
			System.out.println("("+i+", "+j+")");
			
			if((i + j == 5)) {
				break;
			}

		}

	}

}
