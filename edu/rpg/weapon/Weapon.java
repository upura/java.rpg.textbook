package weapon;

public abstract class Weapon {
	private String weaponName;

	public Weapon(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public abstract int getPower();
}
