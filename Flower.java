package Flower;

import java.time.LocalDate;

import java.time.ZoneId;
import java.util.List;


public class Flower {
    private String name;
    private String color;
    private int height;
    private LocalDate date;

    public Flower(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.date = LocalDate.now(ZoneId.systemDefault());
    }

    public Flower(List<Flower> flowerList) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", date=" + date +
                '}';
    }
}

