package com.algoprep.Bootstraps;

import com.algoprep.Entities.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreedyBootstrap {

    public static List<Activity> bootstrapActivities() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(1, 600, 720));
        activities.add(new Activity(2, 1200, 1380));
        activities.add(new Activity(3, 1020, 1140));
        activities.add(new Activity(4, 600, 630));
        activities.add(new Activity(5, 1140, 1230));
        activities.add(new Activity(6, 1290, 1380));
        activities.add(new Activity(7, 750, 810));
        activities.add(new Activity(8, 1200, 1320));
        activities.add(new Activity(9, 1020, 1170));
        activities.add(new Activity(10, 960, 1140));
        activities.add(new Activity(11, 900, 1020));
        return activities;
    }

    public static Map<String, Integer> bootstrapHuffmanCoding() {
        Map<String, Integer> huffmanCodingMap = new HashMap<>();
        huffmanCodingMap.put("a", 45000);
        huffmanCodingMap.put("b", 13000);
        huffmanCodingMap.put("c", 12000);
        huffmanCodingMap.put("d", 16000);
        huffmanCodingMap.put("e", 9000);
        huffmanCodingMap.put("f", 5000);

        return huffmanCodingMap;
    }
}
