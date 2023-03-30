package intaraction;

class unit {
	String job;
	int hp, atk;
	
	unit(String job, int hp, int atk) {
		
		this.job = job;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showinfo() {
		System.out.printf("%s, hp : %d, atk : %d\n", job, hp, atk);
	}
	
	void attack(unit target) {
		
		target.hp -= this.atk;
		
		System.out.printf("\n%s가 %s를 공격했다\n", job, target.job);
		System.out.printf("%s가 %d만큼의 피해를 입혔다\n", job, atk);
		
		this.showinfo();
		target.showinfo();
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		unit war = new unit("전사", 100, 10);
		unit wiz = new unit("마법사", 70, 15);
		
		
		war.showinfo();
		wiz.showinfo();
		
		war.attack(wiz);
		
		wiz.attack(war);
	}

}
