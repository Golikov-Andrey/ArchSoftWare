package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class GoldGenerator extends ItemFabric {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
     }
    
}
