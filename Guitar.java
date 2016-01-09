package module6;

public class Guitar implements Instrument {

    private boolean isBroken;

    public String getName() {
        return "Guitar";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void play() {
        if (isBroken) {
            throw new IllegalStateException("Instrument is broken!!!");
        } else {
            System.out.println("drin-drin");
        }
    }

    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

}
