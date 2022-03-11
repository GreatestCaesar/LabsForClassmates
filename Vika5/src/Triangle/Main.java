package Triangle;

public class Main {
    public static void main(String[] args){
        Triangle t = new Triangle(8,12,63);
        System.out.println("Биссектриса угла α - " + t.BisectorA());
        System.out.println("Биссектриса угла β - " + t.BisectorB());
        System.out.println("Биссектриса угла γ - " + t.BisectorG());
        System.out.println("Отрезки, на которые биссектриса угла α делит сторону С - " + t.SegmentA());
        System.out.println("Отрезки, на которые биссектриса угла β делит сторону A - " + t.SegmentB());
        System.out.println("Отрезки, на которые биссектриса угла γ делит сторону B - " + t.SegmentG());
        System.out.println("Угол β = " + t.AngleB());
        System.out.println("Угол γ = " + t.AngleG());
        System.out.println("---------------------------");
        t.AngleIncrease(2);
        System.out.println("Биссектриса угла α - " + t.BisectorA());
        System.out.println("Биссектриса угла β - " + t.BisectorB());
        System.out.println("Биссектриса угла γ - " + t.BisectorG());
        System.out.println("Отрезки, на которые биссектриса угла α делит сторону С - " + t.SegmentA());
        System.out.println("Отрезки, на которые биссектриса угла β делит сторону A - " + t.SegmentB());
        System.out.println("Отрезки, на которые биссектриса угла γ делит сторону B - " + t.SegmentG());
        System.out.println("Угол β = " + t.AngleB());
        System.out.println("Угол γ = " + t.AngleG());
        System.out.println("---------------------------");
        t.AngleDecrease(1.5);
        System.out.println("Биссектриса угла α - " + t.BisectorA());
        System.out.println("Биссектриса угла β - " + t.BisectorB());
        System.out.println("Биссектриса угла γ - " + t.BisectorG());
        System.out.println("Отрезки, на которые биссектриса угла α делит сторону С - " + t.SegmentA());
        System.out.println("Отрезки, на которые биссектриса угла β делит сторону A - " + t.SegmentB());
        System.out.println("Отрезки, на которые биссектриса угла γ делит сторону B - " + t.SegmentG());
        System.out.println("Угол β = " + t.AngleB());
        System.out.println("Угол γ = " + t.AngleG());
    }
}
