package weapon;

public abstract class Weapon {
	private WeaponType weaponType;
	private String weaponName;

	public Weapon(WeaponType weaponType, String weaponName) {
		this.weaponType = weaponType;
		this.weaponName = weaponName;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public abstract int getPower();
}
