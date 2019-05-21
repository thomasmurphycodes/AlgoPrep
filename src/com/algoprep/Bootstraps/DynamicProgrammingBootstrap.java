package com.algoprep.Bootstraps;

import com.algoprep.Entities.StealableItem;

import java.util.ArrayList;
import java.util.List;

public class DynamicProgrammingBootstrap {
    public static List<StealableItem> bootstrapKnapsackProblem(){
        List<StealableItem> stealableItems = new ArrayList<>();
        stealableItems.add(new StealableItem(3000, 4, "Stereo"));
        stealableItems.add(new StealableItem(2000, 3, "Laptop"));
        stealableItems.add(new StealableItem(1500, 1, "Guitar"));
        stealableItems.add(new StealableItem(2000, 1, "iPhone"));
        stealableItems.sort((x,y) -> -x.weight);
        return stealableItems;
    }
}
