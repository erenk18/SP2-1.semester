

public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return durationInMinutes * 0.5 * getCopies() * calculateLiteraturePoints();
    }

    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI" -> 1.5;
            case "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}
