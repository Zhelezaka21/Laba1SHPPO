package KBGY;

import java.util.Objects;

public class MiddleAct implements IActivity{
    private People pep;
    private String target = pep.getTarget();

    public MiddleAct() {
    }

    public MiddleAct(People pep, String target) {
        this.pep = pep;
        this.target = target;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MiddleAct middleAct)) return false;
        return Objects.equals(getPep(), middleAct.getPep()) && Objects.equals(getTarget(), middleAct.getTarget());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPep(), getTarget());
    }

    @Override
    public String toString() {
        return "MiddleAct{" +
                "pep=" + pep +
                ", target='" + target + '\'' +
                '}';
    }

    @Override
    public void importantWeight() {

    }
}
