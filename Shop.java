package module6;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Instrument> instruments = new ArrayList<>();

    public Shop(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        String output = "Music Shop has following offers 4 u:\n";
        for (Instrument instrument : instruments) {
            output = output + instrument.getName() + "\n";
        }

        return output;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void checkInstruments() {
        for (Instrument instrument : instruments) {
            try {
                instrument.play();
            } catch (IllegalStateException e) {
                // repair instrument
                System.out.println("Repairing instrument...  " + instrument.getName());
                instrument.setIsBroken(false);
                System.out.println("Playing on it. To be sure if it's ok");
                instrument.play();
            }
        }
    }
}
