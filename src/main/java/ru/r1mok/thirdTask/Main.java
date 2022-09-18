package main.java.ru.r1mok.thirdTask;

import main.java.ru.r1mok.firstTask.City;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "inputFile.csv";
        List<City> cities = main.java.ru.r1mok.firstTask.Main.parseCSV(fileName);
        int maxPopulation = 0, index = 0;
        for (int i = 0; i < cities.size(); ++i) {
            if (maxPopulation < cities.get(i).getPopulation()) {
                maxPopulation = cities.get(i).getPopulation();
                index = i;
            }
        }
        System.out.println("[" + index + "] = " + maxPopulation);
    }
}
