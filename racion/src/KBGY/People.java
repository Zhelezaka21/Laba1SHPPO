package KBGY;

import java.util.Objects;

public class People {
    private double height;
    private double weight;
    private String sex;
    private int age;
    private String activity;
    private String target;

    public People(double height, double weight, String sex, int age, String activity, String target) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
        this.activity = activity;
        this.target = target;
    }

    public People() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People people)) return false;
        return Double.compare(getHeight(), people.getHeight()) == 0 && Double.compare(getWeight(), people.getWeight()) == 0 && getAge() == people.getAge() && Objects.equals(getSex(), people.getSex()) && Objects.equals(getActivity(), people.getActivity()) && Objects.equals(getTarget(), people.getTarget());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWeight(), getSex(), getAge(), getActivity(), getTarget());
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", activity='" + activity + '\'' +
                ", target='" + target + '\'' +
                '}';
    }

}
