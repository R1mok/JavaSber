package main.java.ru.r1mok;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "inputFile.csv";
        Scanner scanner = new Scanner(new File(fileName));
        List<City> cities = new ArrayList<>();
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
            cities.add(city);
        }
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
