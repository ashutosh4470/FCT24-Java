package jungle;

import jungle.cave.Bear;
import jungle.cave.Tiger;
import jungle.river.Fish;
import jungle.river.Frog;
import jungle.tree.Monkey;
import jungle.tree.Sparrow;

public class WildLifeTest {
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.jump();
		Fish fish = new Fish();
		fish.swim();
		Monkey monkey = new Monkey();
		monkey.jump();
		Sparrow sparrow = new Sparrow();
		sparrow.chirp();
		Tiger tiger = new Tiger();
		tiger.roar();
		Bear bear = new Bear();
		bear.climb();
		bear.hatchHoney();
	}
}
