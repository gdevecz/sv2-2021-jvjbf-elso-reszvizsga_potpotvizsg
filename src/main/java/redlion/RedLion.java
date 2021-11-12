package redlion;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RedLion {

    private String name;

    private LocalTime openTime;

    private LocalTime closeTime;

    private List<Cup> teas = new ArrayList<>();

    public RedLion(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        teas.add(new Cup("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        teas.add(new Cup("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
    }

    public void addCup(Cup cup) {
        teas.add(cup);
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public List<Cup> getTeas() {
        return teas;
    }

    public double getAveragePrice() {
        double averagePrice = 0.0;
        for (Cup cup : teas) {
            averagePrice += cup.getPrice();
        }
        return averagePrice / teas.size();
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Cup cup : teas) {
            if (cup.getSort().equals(sort)) {
                setNewPriceOfCup(cup, percent);
            }
        }
    }

    private void setNewPriceOfCup(Cup cup, int percent) {
        int newPrice = (int) (cup.getPrice() - (cup.getPrice() * percent / 100.0));
        cup.setPrice(newPrice);
    }
}
