package module6;

public class Piano implements Instrument {

    private boolean isBroken;

    public String getName() {
        return "Piano";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void play() throws IllegalStateException {
        System.out.println("pin-pin");
    }

    @Override
    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

}
