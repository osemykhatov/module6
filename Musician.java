package module6;

//// AGGREGATION
import java.util.List;

public class Musician {

    private String name;
    private boolean haveAllFingers;

    public Musician(String name, boolean haveAllFingers) {
        this.name = name;
        this.haveAllFingers = haveAllFingers;
    }

    public List<Instrument> viewInstruments(Shop shop) {
        return shop.getInstruments();
    }

    @Override
    public String toString() {
        return "Musician [" + name + "]";
    }

    public void play(Instrument instrument) throws InjuredMusicianException {
        if (haveAllFingers) {
            try {
                instrument.play();
            } catch (IllegalStateException e) {
                System.out.println("Crap. This instrument is really BAD! " + instrument.getName());
            }
        } else {
            throw new InjuredMusicianException("I'm injured", this);
        }
    }

    public String getName() {
        return name;
    }

}
