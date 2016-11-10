package Flower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


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


// Create a bouquet

    public void makeBouquet() throws IOException {

        List<Flower> flowerList = new ArrayList<>();
        System.out.println("Введіть кількісь квітів в букеті");
        String fl = reader.readLine();
        int number = Integer.parseInt(fl);

        flowerList.add(new Flower("Rose", "red",30,30, FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Tulip", "yellow",20,15,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Chamomile", "white",35,20,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Chamomile", "white",35,20,FreshFlower.DEAD));
        flowerList.add(new Flower("Lily","pink",30,25,FreshFlower.NOT_FRESH_FLOWER));
        flowerList.add(new Flower("Narcissus","white",20,20,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Rose", "red",30,30,FreshFlower.DEAD));
        flowerList.add(new Flower("Rose", "white",30,30,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Lily", "pink",30,25,FreshFlower.NOT_FRESH_FLOWER));
        flowerList.add(new Flower("Narcissus","white",20,20 ,FreshFlower.DEAD));
        flowerList.add(new Flower("Lily","pink",30,25,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Tulip","yellow",20,15,FreshFlower.FRESH_FLOWER));
        flowerList.add(new Flower("Rose","red",30,30,FreshFlower.NOT_FRESH_FLOWER));

        for (int i = 1; i <= number; i++) {
            flowerList.add(new Flower());
        }
        bouquetList.add(new Bouquet(flowerList));
    }

//Print all Bouquet

    public void printBouquet() {
        bouquetList.forEach(System.out::println);
    }

 //Print white Chamomile

    public void white_Chamomile() throws IOException {

        List<Flower> flowerList = new ArrayList<>();

        for (Bouquet bouquet: bouquetList){
                         flowerList = bouquet.getFlowerList();
        }
        System.out.println("Виводимо білі ромашки ");
        for (Flower flower : flowerList){
           if (flower.getColorFlower()=="white" &&flower.getNameFlower() == "Chamomile" )
            {
             System.out.println(flower);
           }
         }
    }

    //Print any options

    public void any_options() throws IOException {

        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet: bouquetList){
            flowerList = bouquet.getFlowerList();
        }
        System.out.println("Виводимо параметри квітки ");
        String param = reader.readLine();
        String price = reader.readLine();
        int pr = Integer.parseInt(price);
       for (Flower flower : flowerList){
            flowerList.stream().filter(Flower -> Flower.getFresh_Flower().equals(param)&&Flower.getNameFlower().equals(param) ||
            Flower.getColorFlower().equals(param)|| Flower.getHeightFlower() == flower.getHeightFlower()).forEach(System.out::println);
        }
     }

//Find Name Flower

    public void findNameFlower() throws IOException {
        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet : bouquetList) {
                flowerList = bouquet.getFlowerList();
            }

        System.out.println("Введіть назву квітки");
        String nameFlower = reader.readLine();
        for (Flower flower : flowerList){
            if(flower.getNameFlower().equals(nameFlower)){
                System.out.println(flower);
            } else {
                System.out.println("Такої квітки немає в букеті");
                break;
            }
        }
    }

//Find Height Flower
public void findHeightFlower() throws IOException {
    List<Flower> flowerList = new ArrayList<>();
    for (Bouquet bouquet : bouquetList) {
        flowerList = bouquet.getFlowerList();
    }

    System.out.println("Введіть висоту квітки");
    String heightFlower = reader.readLine();
    int a = Integer.parseInt(heightFlower);
    for (Flower flower : flowerList){
        if (flower.getHeightFlower()==a) {
            System.out.println(flower);
        } else{
            System.out.println("Такої квітки немає в букеті");
            break;
        }

        }
    }
}
