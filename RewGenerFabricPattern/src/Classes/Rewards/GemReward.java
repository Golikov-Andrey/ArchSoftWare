package Classes.Rewards;

import Classes.iGameItem;

public class GemReward implements iGameItem  {
    @Override
    public void open() {
        System.out.println("Gem");
    }    
}
