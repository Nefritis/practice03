package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			
			Goods good = new Goods();
			good.setName(name);
			good.setPrice(price);
			good.setCountStock(countStock);
			goods[i] = good;
		}
		
		String g[];
		
		for(Goods good : goods){
			System.out.println("실행 결과 : " + good.getName() + "  "+ good.getPrice() + "  "+  good.getCountStock());
		}

		// 자원정리
		scanner.close();
	}
}
