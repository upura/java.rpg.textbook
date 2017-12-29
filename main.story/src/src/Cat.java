package src;

public class Cat {
	public String color;
	public String size;
	private String howlVoice;

	//Constracter
	public Cat(String color, String size) {
		this.color = color;
		this.size = size;
	}

	public void howl() {
		System.out.println(howlVoice);
	}

	public void eat(String food) {
		System.out.println(food + " tastes good.");
	}

	public String vomitFluffBall() {
		String FluffBall = "毛玉";
		return FluffBall;
	}
}
