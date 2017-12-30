package animal;

public class Cat extends Animal{
	//Constracter
	public Cat(String color, String size) {
		super.setColor(color);
		super.setSize(size);
	}

	public void eat(String food) {
		System.out.println(food + " tastes good.");
	}

	public String vomitFluffBall() {
		String FluffBall = "毛玉";
		return FluffBall;
	}

	@Override
	public void sleep() {
		System.out.println("ゴロニャー");
	}
}
