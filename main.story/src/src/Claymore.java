package src;

public class Claymore extends Weapon{
	private int power = 40;

	// 何これ？
	public Claymore() {
		super("クレイモア");
	}

	// this. 要る？
	public int getPower() {
		return this.power;
	}
}
