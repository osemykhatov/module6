package module6;

public class InjuredMusicianException extends Exception {

    private Musician musician;

    public InjuredMusicianException(Musician musician) {
        this.musician = musician;
    }

    public InjuredMusicianException(String message, Musician musician) {
        super(message);
        this.musician = musician;
    }

    public String getMusicianName() {
        return musician.getName();
    }

}
