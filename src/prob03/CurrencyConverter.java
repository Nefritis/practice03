package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		double dollar=0;
		if(won<0){
			won=0;
		}else{
		dollar = won/rate;
		}
		return dollar;
	}

	public static double toKRW(double dollar) {
		double won=0;
		if(dollar<0){
			dollar=0;
		}else{
		won = dollar*rate;
		}
		return won;
	}

	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		CurrencyConverter.rate=rate;
	}
}
