package Flower;

import java.io.IOException;

/**
 * Created by Sasha on 01.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {


        Bouquet bouquet = new Bouquet();
        bouquet.makeBouquet();
        bouquet.printBouquet();
        bouquet.findColor();
        bouquet.findNameFlower();
        bouquet.findHeightFlower();
    }
}

