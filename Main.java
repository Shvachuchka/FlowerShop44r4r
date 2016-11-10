package Flower;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {


        Bouquet bouquet = new Bouquet();
        bouquet.makeBouquet();
        bouquet.printBouquet();
        bouquet.findNameFlower();
        bouquet.findHeightFlower();
        bouquet.white_Chamomile();
        bouquet.any_options();

    }
}

