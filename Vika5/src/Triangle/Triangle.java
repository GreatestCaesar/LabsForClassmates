package Triangle;

public class Triangle {
    double a, b;
    double alpha;

    Triangle(double a, double b, double alpha){
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }

    public void AngleIncrease(double n){
        if((alpha* n)>179){
            System.out.print("Слишком большое число, данный угол не может существовать");
        }else{
            System.out.print("Угол α до увеличения = " + alpha + "\n");
            alpha*=n;
            System.out.print("Угол α после увеличения = " + alpha + "\n");
        }
    }

    public void AngleDecrease(double n){
        if((alpha/n)<0.5){
            System.out.print("Слишком большое число, данный угол не может существовать");
        }else{
            System.out.print("Угол α до уменьшения = " + alpha + "\n");
            alpha/=n;
            System.out.print("Угол α после уменьшения = " + alpha + "\n");
        }
    }

    public String SegmentA(){ // отрезки на которые биссектриса угла α делит сторону С
        String s = "";
        double m = Side(a,BisectorA(),alpha/2);
        double n = Side(b,BisectorA(),alpha/2);
        s = "m = " + m + "n = " + n;
        return s;
    }

    public String SegmentB(){ // отрезки на которые биссектриса угла β делит сторону A
        String s = "";
        double m = Side(b,BisectorB(),AngleB()/2);
        double n = Side(Side(a,b,alpha),BisectorB(),AngleB()/2);
        s = "m = " + m + "n = " + n;
        return s;
    }

    public String SegmentG(){ // отрезки на которые биссектриса угла γ делит сторону B
        String s = "";
        double m = Side(Side(a,b,alpha),BisectorG(),AngleG()/2);
        double n = Side(a,BisectorG(),AngleG()/2);
        s = "m = " + m + "n = " + n;
        return s;
    }

    public double AngleB(){ // определение значения угла β
        double beta;
        beta = (Math.acos(((Math.pow(a,2)+Math.pow(Side(a,b,alpha),2)-Math.pow(b,2))/(2*a*Side(a,b,alpha)))))*180/Math.PI;
        return beta;
    }

    public double AngleG(){ // определение значения угла γ
        double gamma;
        gamma = (Math.acos(((Math.pow(b,2)+Math.pow(Side(a,b,alpha),2)-Math.pow(a,2))/(2*b*Side(a,b,alpha)))))*180/Math.PI;
        return gamma;
    }

    public double BisectorA(){ // биссектриса угла α
        return Math.sqrt(a*b*(a+Side(a,b,alpha)+b)*(a+b-Side(a,b,alpha)))/(a+b);
    } // биссектриса угла α

    public double BisectorB(){ // биссектриса угла β
        return Math.sqrt(Side(a,b,alpha)*b*(a+Side(a,b,alpha)+b)*(Side(a,b,alpha)+b-a))/(Side(a,b,alpha)+b);
    } // биссектриса угла β

    public double BisectorG(){ // биссектриса угла γ
        return Math.sqrt(Side(a,b,alpha)*a*(a+Side(a,b,alpha)+b)*(Side(a,b,alpha)+a-b))/(Side(a,b,alpha)+a);
    } // биссектриса угла γ

    public double Side(double a, double b, double angle){ // нахождение 3й стороны С и также нахождение отрезков сторон, на которые делит биссектриса
        double c;
        return c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-(2*a*b)*Math.cos(angle*Math.PI/180)); // угол делится на ПИ и на 180 потому что угол отправляется в градусах, а функции джавы считюат их в радианах
    }
}
