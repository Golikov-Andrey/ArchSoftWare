import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemFabric;
import Classes.iGameItem;
import Classes.Rewards.GemGenerator;
import Classes.Rewards.GoldGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        // ItemFabric generator = new GoldGenerator();
        // generator.openReward();
        // generator = new GemGenerator();
        // generator.openReward();
        //System.out.println("Hello, World!");

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());

        for(int i =0; i<20; i++)
        {
            int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
        
    }
}
