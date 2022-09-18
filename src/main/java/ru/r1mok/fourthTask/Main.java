package main.java.ru.r1mok.fourthTask;

import main.java.ru.r1mok.firstTask.City;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "inputFile.csv";
        List<City> cities = main.java.ru.r1mok.firstTask.Main.parseCSV(fileName);
        Map<String, Integer> regions = new HashMap<>();
        for (City city : cities) {
            if (regions.containsKey(city.getRegion())) {
                regions.put(city.getRegion(), regions.get(city.getRegion()) + 1);
            } else regions.put(city.getRegion(), 1);
        }
        System.out.println(regions);
    }
}
