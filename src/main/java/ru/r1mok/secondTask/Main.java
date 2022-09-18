package main.java.ru.r1mok.secondTask;

import main.java.ru.r1mok.firstTask.City;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Main {
    public static List<City> sortByCity(List<City> cities) {
        Comparator<City> comparator = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                if (o1.equals(o2))
                    return 0;
                return o1.getName().compareTo(o2.getName());
            }
        };
        return cities.stream().sorted(comparator).toList();
    }
    public static List<City> sortByDistrict(List<City> cities) {
        Comparator<City> comparator = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                if (o1.equals(o2))
                    return 0;
                if (o1.getDistrict().equals(o2.getDistrict())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getDistrict().compareTo(o2.getDistrict());
            }
        };
        return cities.stream().sorted(comparator).toList();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "inputFile.csv";
        List<City> cities = main.java.ru.r1mok.firstTask.Main.parseCSV(fileName);
        List<City> result = sortByCity(cities).stream().toList();
        for (City city : result) {
            System.out.println(city);
        }
        result = sortByDistrict(cities).stream().toList();
        for (City city : result) {
            System.out.println(city);
        }
    }
}
