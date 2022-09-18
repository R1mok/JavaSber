package main.java.ru.r1mok;

import lombok.Data;

import java.util.Date;

@Data
public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
