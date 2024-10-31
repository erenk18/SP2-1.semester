
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();


    public Author(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return (float) total;
    }
}
