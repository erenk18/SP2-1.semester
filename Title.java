
public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();


    protected abstract double calculateLiteraturePoints();

}

