package KBGY;

import java.util.Objects;

public class Protein implements IKBGY{
    private People pep;
    private double weight = pep.getWeight();

    public Protein(People pep, double weight) {
        this.pep = pep;
        this.weight = weight;
    }

    public Protein() {
    }

    public People getPep() {
        return pep;
    }

    public void setPep(People pep) {
        this.pep = pep;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Protein protein)) return false;
        return Double.compare(getWeight(), protein.getWeight()) == 0 && Objects.equals(getPep(), protein.getPep());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPep(), getWeight());
    }

    @Override
    public String toString() {
        return "Protein{" +
                "pep=" + pep +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double calculate(double weight) {
        // рассчет белков
        return 0;
    }
}
