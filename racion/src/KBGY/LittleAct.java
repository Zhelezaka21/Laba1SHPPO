package KBGY;

import java.util.Objects;
import java.util.Scanner;

public class LittleAct implements IActivity {
    private People pep;
    private String target = pep.getTarget();

    public LittleAct(People pep, String target) {
        this.pep = pep;
        this.target = target;
    }

    public LittleAct() {
    }

    public People getPep() {
        return pep;
    }

    public void setPep(People pep) {
        this.pep = pep;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "LittleAct{" +
                "pep=" + pep +
                ", target='" + target + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LittleAct littleAct)) return false;
        return Objects.equals(getPep(), littleAct.getPep()) && Objects.equals(getTarget(), littleAct.getTarget());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPep(), getTarget());
    }

    @Override
    public void importantWeight() {
        Scanner s = new Scanner(System.in);
        System.out.println("Для вас важен набор мышц? (да/нет): ");
        String choice = s.nextLine();
        if (choice == "да"){
            //здесь будет обертка декоратор
        }
        else {
            Protein belki = new Protein();
            double countbelki = belki.calculate(belki.getWeight());
        }
    }

}
