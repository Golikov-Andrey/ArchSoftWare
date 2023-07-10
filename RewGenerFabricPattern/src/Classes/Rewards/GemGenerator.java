package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class GemGenerator  extends ItemFabric  {
        @Override
    public iGameItem createItem() {
        return new GemReward();
     }
}
