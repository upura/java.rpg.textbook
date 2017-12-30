package battle;
import monster.Monster;
import personal.Character;
public class Battle {
	private Character character;
	private Monster monster;
	public Battle(Character character, Monster monster) {
		this.character = character;
		this.monster = monster;
	}
	public void battle() {
		BattlePattern pattern = this.monster.getBattlePattern();
		if (pattern == BattlePattern.ONE) {
			if (this.character.getAttackPower() >= this.monster.getHp()) {
				System.out.println(this.monster.getName() + "を倒した！");
				System.out.println(this.character.getName() + "は　経験値："
						+ this.monster.getExp() + "ポイントを手に入れた");
				this.character.addExp(this.monster.getExp());
			} else if (this.monster.getAttackPower() >= this.character.getHp()) {
				System.out.println(this.character.getName() + "は死んでしまった。");
			} else {
				System.out.println(this.monster.getName() + "は逃げだした！");
			}
		} else if (pattern == BattlePattern.THREE_TIME) {
			int characterHp = this.character.getHp();
			int monsterHp = this.monster.getHp();
			for (int i = 0; i < 3; i++) {
				System.out.println(this.character.getName() + "の攻撃！");
				System.out.println(this.monster.getName() + "は"
						+ this.character.getAttackPower() + "のダメージを受けた！");
				monsterHp -= this.character.getAttackPower();
				if (monsterHp <= 0) {
					System.out.println(this.monster.getName() + "を倒した！");
					System.out.println(this.character.getName() + "は　経験値："
							+ this.monster.getExp() + "ポイントを手に入れた");
					this.character.addExp(this.monster.getExp());
					break;
				}
				System.out.println(this.monster.getName() + "の攻撃！");
				System.out.println(this.character.getName() + "は"
						+ this.monster.getAttackPower() + "のダメージを受けた！");
				characterHp -= this.monster.getAttackPower();
				if (characterHp <= 0) {
					System.out.println(this.character.getName() + "は死んでしまった。");
					break;
				}
			}
			this.character.setHp(characterHp);
			if (characterHp > 0 && monsterHp > 0) {
				System.out.println(this.monster.getName() + "は逃げだした！");
			}
		}
	}
}
