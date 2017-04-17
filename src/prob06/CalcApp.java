package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int a, b;

		
		while (true) {
			System.out.print(" >> ");
			String str = scanner.nextLine();
			if ("quit".equals(str)) {
				break;
			}
			String f1[] = str.split(" ");
			a = Integer.parseInt(f1[0]);
			b = Integer.parseInt(f1[2]);
					
			switch (f1[1]) {
			case "+": {
				Add add = new Add();
				add.setValue(a, b);
				int result = add.calculate();
				System.out.println(">>" + result);
				break;
			}
			case "-": {
				Sub sub = new Sub();
				sub.setValue(a, b);
				int result = sub.calculate();
				System.out.println(">>" + result);
				break;
			}
			case "*": {
				Mul mul = new Mul();
				mul.setValue(a, b);
				int result = mul.calculate();
				System.out.println(">>" + result);
				break;
			}
			case "/": {
				Div div = new Div();
				div.setValue(a, b);
				int result = div.calculate();
				System.out.println(">>" + result);
				break;
			}

			default: {
				System.out.println("계산 불가");
			}
			}
		}

		scanner.close();

	}

}
