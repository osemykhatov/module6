package module6;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // create instruments
        Instrument goodGitar = new Guitar();
        Instrument brokenGuitar = new Guitar();
        brokenGuitar.setIsBroken(true);
        Instrument piano = new Piano();
        Instrument prumpet = new Prumpet();

        // add them into list
        List<Instrument> instruments = new ArrayList<>();

        instruments.add(goodGitar);
        instruments.add(brokenGuitar);
        instruments.add(piano);
        instruments.add(prumpet);

        // create shop with instruments list
        Shop shop = new Shop(instruments);

        // Musician
        System.out.println("------------------ searching instruments ----------------");
        Musician musician = new Musician("Freddy Mercury", true);
        List<Instrument> shopInstruments = musician.viewInstruments(shop);

        // Show the list of instruments
        System.out.println("Found instruments:");
        for (Instrument instrument : shopInstruments) {
            System.out.println(instrument);
        }

        playOnInstruments(musician, shopInstruments);

        // after one month shop checks instruments (and repair them if broken)
        System.out.println("-------------- checking instruments -------------");
        shop.checkInstruments();

        playOnInstruments(musician, shopInstruments);

    }

    private static void playOnInstruments(Musician musician, List<Instrument> shopInstruments) {
        System.out.println("-------------- playing instruments ------------");
        // play instruments
        for (Instrument instrument : shopInstruments) {
            try {
                musician.play(instrument);
            } catch (InjuredMusicianException e) {
                System.out.println("Send musician to the hospital. His name - " + e.getMusicianName() + ". He says: " + e.getMessage());
                break;
            }
        }
    }
}
