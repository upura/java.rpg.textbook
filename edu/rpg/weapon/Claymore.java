package weapon;

public class Claymore extends Weapon{
	private int power = 40;

	// Call parent constracter by super()
	public Claymore() {
		super(WeaponType.SWORD, "クレイモア");
	}

	// this. は無くても動く（付けた方が子インスタンス特有の変数だと分かりやすい）
	public int getPower() {
		return this.power;
	}
}
