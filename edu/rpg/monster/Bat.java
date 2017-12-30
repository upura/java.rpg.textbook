package monster;
import battle.BattlePattern;
public class Bat extends Monster {
	public Bat() {
		super("��", 300, 50, 30);
	}
	public BattlePattern getBattlePattern() {
		return BattlePattern.ROOP;
	}
}
