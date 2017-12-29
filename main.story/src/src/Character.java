package src;

public class Character {
	private String name;
	private String gender;
	private Weapon weapon;

	public Character(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}
}
