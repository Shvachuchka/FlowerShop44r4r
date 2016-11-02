package Flower;

import java.awt.font.ShapeGraphicAttribute;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Sasha on 01.11.2016.
 */
public class Bouquet {

    private List<Flower> flowerList;

    public Bouquet() {
    }

    public Bouquet(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }
    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquetList=" + bouquetList +
                ", flowerList=" + flowerList +
                '}';
    }



    private List<Bouquet> bouquetList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();

// Створюєм рандомно букет


    public void makeBouquet() throws IOException {

        List<Flower> flowerList = new ArrayList<>();
        System.out.println("Введіть кількісь квітів в букеті");
        String fl = reader.readLine();
        int number = Integer.parseInt(fl);
        String name[] = {"Rose", "Tulip", "Chamomile", "Lily", "Narcissus", "Gladiolus"};
        String color[] = {"red", "pink", "yellow", "white",};
        int height[] = {20, 25, 30, 35, 40};
        Date date = Calendar.getInstance().getTime();

        for (int i = 1; i <= number; i++) {
            flowerList.add(new Flower(name[random.nextInt(name.length)], color[random.nextInt(color.length)], height[random.nextInt(height.length)]));
        }
        bouquetList.add(new Bouquet(flowerList));
    }

//Виводить всі букети

    public void printBouquet() {
        bouquetList.forEach(System.out::println);
    }

 //Шукаємо за кольором квітки

    public void findColor() throws IOException {

        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet: bouquetList){
                         flowerList = bouquet.getFlowerList();
        }
        System.out.println("Вибрати колір квітки");
        String colorFlower = reader.readLine();
        for (Flower flower : flowerList){
            if (flower.getColor().equals(colorFlower)){
                System.out.println(flower);
            }else {
                System.out.println("Такого кольору немає в букеті");
                break;
            }
        }

    }


//шукаємо за назвою квітки

    public void findNameFlower() throws IOException {
        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet : bouquetList) {
                flowerList = bouquet.getFlowerList();
            }

        System.out.println("Введіть назву квітки");
        String nameFlower = reader.readLine();
        for (Flower flower : flowerList){
            if(flower.getName().equals(nameFlower)){
                System.out.println(flower);
            } else {
                System.out.println("Такої квітки немає в букеті");
                break;
            }
        }
    }

//шукаємо за висотою квітки
public void findHeightFlower() throws IOException {
    List<Flower> flowerList = new ArrayList<>();
    for (Bouquet bouquet : bouquetList) {
        flowerList = bouquet.getFlowerList();
    }

    System.out.println("Введіть висоту квітки");
    String heightFlower = reader.readLine();
    int a = Integer.parseInt(heightFlower);
    for (Flower flower : flowerList){
        if (flower.getHeight()==a) {
            System.out.println(flower);
        } else{
            System.out.println("Такої квітки немає в букеті");
            break;
        }

        }
    }
}
