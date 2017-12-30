package personal;

public enum Gender {
	MALE("男性"),
	FEMALE("女性");

	private String name;
	private Gender(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
