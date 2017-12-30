package monster;
import battle.BattlePattern;
public class Rabbit extends Monster {
	public Rabbit() {
		super("お化けウサギ", 190, 50, 30);
	}
	public BattlePattern getBattlePattern() {
		return BattlePattern.THREE_TIME;
	}
}