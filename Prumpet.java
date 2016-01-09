package module6;

public class Prumpet implements Instrument {

    private boolean isBroken;

    public String getName() {
        return "Prumpet";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void play() throws IllegalStateException {
        System.out.println("duuuu-duuuu");
    }

    @Override
    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }
}
