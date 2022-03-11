package Task2;

import java.util.ArrayList;

public class Score extends Client{
    private double sum; // сумма на счету
    private double percent; // процент за месяц
    private boolean locked; // заблокирован ли счёт

    public Score() {
        sum = 0;
        percent = 0;
        locked = false;
    }

    public Score(int id, int sum, double percent, boolean locked) {
        super.setId(id);
        this.sum = sum;
        this.percent = percent;
        this.locked = locked;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "Счёт{" +
                "номер=" + super.getId() +
                ", сумма=" + sum +
                ", процент начислений=" + percent +
                ", заблокирован=" + locked +
                '}';
    }
}
