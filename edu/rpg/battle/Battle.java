package battle;
import monster.Monster;
import personal.Character;
public class Battle {
	private Character character;
	private Monster[] monsters;
	public Battle(Character character, Monster[] monsters) {
		this.character = character;
		this.monsters = monsters;
	}
	public void battle() {
		for (Monster monster : this.monsters) {
			BattlePattern pattern = monster.getBattlePattern();
			switch (pattern) {
			case ONE:
				one(this.character, monster);
				break;
			case THREE_TIME:
				threeTime(this.character, monster);
				break;
			case ROOP:
				roop(this.character, monster);
				break;
			}
		}
	}
	private void one(Character character, Monster monster) {
		if (character.getAttackPower() >= monster.getHp()) {
			System.out.println(monster.getName() + "を倒した！");
			System.out.println(character.getName() + "は　経験値："
					+ monster.getExp() + "ポイントを手に入れた");
			character.addExp(monster.getExp());
		} else if (monster.getAttackPower() >= character.getHp()) {
			System.out.println(character.getName() + "は死んでしまった。");
		} else {
			System.out.println(monster.getName() + "は逃げだした！");
		}
	}
	private void threeTime(Character character, Monster monster) {
		int characterHp = character.getHp();
		int monsterHp = monster.getHp();
		for (int i = 0; i < 3; i++) {
			System.out.println(character.getName() + "の攻撃！");
			System.out.println(monster.getName() + "は"
					+ character.getAttackPower() + "のダメージを受けた！");
			monsterHp -= character.getAttackPower();
			if (monsterHp <= 0) {
				System.out.println(monster.getName() + "を倒した！");
				System.out.println(character.getName() + "は　経験値："
						+ monster.getExp() + "ポイントを手に入れた");
				this.character.addExp(monster.getExp());
				break;
			}
			System.out.println(monster.getName() + "の攻撃！");
			System.out.println(character.getName() + "は"
					+ monster.getAttackPower() + "のダメージを受けた！");
			characterHp -= monster.getAttackPower();
			if (characterHp <= 0) {
				System.out.println(character.getName() + "は死んでしまった。");
				break;
			}
		}
		character.setHp(characterHp);
		if (characterHp > 0 && monsterHp > 0) {
			System.out.println(monster.getName() + "は逃げだした！");
		}
	}
	private void roop(Character character, Monster monster) {
		int characterHp = character.getHp();
		int monsterHp = monster.getHp();
		while (characterHp > 0 || monsterHp > 0) {
			System.out.println(character.getName() + "の攻撃！");
			System.out.println(monster.getName() + "は"
					+ character.getAttackPower() + "のダメージを受けた！");
			monsterHp -= character.getAttackPower();
			if (monsterHp <= 0) {
				System.out.println(monster.getName() + "を倒した！");
				System.out.println(character.getName() + "は　経験値："
						+ monster.getExp() + "ポイントを手に入れた");
				character.addExp(monster.getExp());
				break;
			}
			System.out.println(monster.getName() + "の攻撃！");
			System.out.println(character.getName() + "は"
					+ monster.getAttackPower() + "のダメージを受けた！");
			characterHp -= monster.getAttackPower();
			if (characterHp <= 0) {
				System.out.println(character.getName() + "は死んでしまった。");
				break;
			}
		}
	}
}
