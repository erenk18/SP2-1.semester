

public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }

    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()){
            case "BI" -> 3;
            case "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };

    }
}
