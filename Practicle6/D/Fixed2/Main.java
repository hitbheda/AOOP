class Salary{
    int basic,da;
    Salary(int b,int d){
        basic = b;
        da = basic *d/100;
    }
    final void computeSalary(){
        System.out.println("Net Salary :"+(basic+da));
    }
}

class GrossSalary extends Salary{
    int hra;
    GrossSalary(int b,int d,int h){
        super(b, d);
        hra = basic  * h /100;
    }
    void computeGrossSalary(){
        System.out.println("Gross Salary :"+(basic+da+hra));
    }
}

class Main{
    public static void main(String[] args) {
        GrossSalary Obj = new GrossSalary(5000,20,20);
        Obj.computeSalary();
        Obj.computeGrossSalary();
    }
}