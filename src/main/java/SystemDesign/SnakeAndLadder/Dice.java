package SystemDesign.SnakeAndLadder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dice {
    private int diceMax;
    public Dice(int diceMax) {
        this.diceMax = diceMax;
    }
    public int roll()
    {
        return (int)(Math.random()*(diceMax-1))+1;
    }
}
