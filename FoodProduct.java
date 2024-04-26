import java.util.Objects;

public class FoodProduct
{
    String name;
    double protein;
    double fat;
    double carbs;

    public FoodProduct() {
    }


    public FoodProduct(String name) {
        this.name = name;
    }

    public FoodProduct(String name, double protein, double fat, double carbs) {
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodProduct that = (FoodProduct) o;
        return Double.compare(protein, that.protein) == 0 && Double.compare(fat, that.fat) == 0 && Double.compare(carbs, that.carbs) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protein, fat, carbs);
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + name + '\'' +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                '}';
    }
}