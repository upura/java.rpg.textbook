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
		}
	}
}
