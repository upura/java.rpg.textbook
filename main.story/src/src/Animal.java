package src;

public abstract class Animal {
	private String color;
	private String size;
	private String howlVoice;

	public void howl() {
		System.out.println(howlVoice);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public abstract void sleep();
}
