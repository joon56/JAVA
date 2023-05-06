
public class practice_2 {

	public static void main(String[] args) {
		badbank bb = new badbank();			// bb는 badbank로 받아준 badbank 자료형의 변수
		goodbank gb = new goodbank();		// gb는 goodbank로 받아준 goodbank 자료형의 변수
		normalbank nb = new normalbank();	// nb는 normalbank로 받아준 normalbank 자료형의 변수
		badbank ub = new goodbank();			// ub는 goodbank로 받아준 badbank 자료형의 변수
		goodbank downbank = (goodbank)ub;	// downbank는 ub변수를 goodbank로 강제 형변환을 시킨 것
											// 즉, goodbank형의 ub와 모든게 같아짐 - downbank도 부모가 goodbank이기 때문
		upbank ub2 = new upbank();			// 이거는 밑에 upbank 자신의 자료형을 출력하기 위함
		
		bb.showinfo();
		gb.showinfo();
		nb.showinfo();
		ub.showinfo();
		downbank.showinfo();
		
		// 여기는 처럼 변수는 선언한 변수에 맞춰서, 뒤에 rate는 부모의 rate 변수이름을 적어준다.
		System.out.printf("goodbank 자신의 rate : %.1f\n", gb.good_rate);
		System.out.printf("goodbank 부모의 rate : %.1f\n", gb.bad_rate);
		System.out.printf("upbank 자신의 rate : %.1f\n", ub2.up_rate);
		System.out.printf("upbank 부모의 rate : %.1f\n", ub.bad_rate);
		System.out.printf("downbank 자신의 rate : %.1f\n", downbank.good_rate);
		System.out.printf("downbank 부모의 rate : %.1f\n", downbank.bad_rate);
	}

}
