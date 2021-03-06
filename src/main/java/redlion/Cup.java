package redlion;

public class Cup {

    private String name;

    private int price;

    private Sort sort;

    public Cup(String name, int price, Sort sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }


    @Override
    public String toString() {
        return name + ": " + sort.getAdditionalInfo() + " (" + price + " Ft)";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sort getSort() {
        return sort;
    }
}
