package main.java.ru.r1mok.firstTask;

import main.java.ru.r1mok.firstTask.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<City> parseCSV(String fileName) throws FileNotFoundException {
        List<City> resultList = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            City city = new City();
            String[] inputStr = scanner.nextLine().split(";");
            city.setName(inputStr[1]);
            city.setRegion(inputStr[2]);
            city.setDistrict(inputStr[3]);
            city.setPopulation(Integer.parseInt(inputStr[4]));
            if (inputStr.length == 6) {
                city.setFoundation(inputStr[5]);
            } else {
                city.setFoundation("");
            }
            resultList.add(city);
        }
        return resultList;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "inputFile.csv";
        List<City> cities = parseCSV(fileName);
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
