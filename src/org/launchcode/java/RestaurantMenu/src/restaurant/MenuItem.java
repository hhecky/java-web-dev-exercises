package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

}
