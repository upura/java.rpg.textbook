package src;

public class Cat extends Animal{
	//Constracter
	public Cat(String color, String size) {
		super.color = color;
		super.size = size;
		super.howlVoice = "にゃー";
	}

	public void eat(String food) {
		System.out.println(food + " tastes good.");
	}

	public String vomitFluffBall() {
		String FluffBall = "毛玉";
		return FluffBall;
	}
}
