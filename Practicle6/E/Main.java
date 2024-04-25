import Salary.Salary;

public class Main {
    public static void main(String[] args) {
        int sal, net_sal;
        Salary s = new Salary(); 
        sal = s.computersalary(500); 
        net_sal = sal - s.pfund(500); 
        System.out.println("total salary :-" + sal); 
        System.out.println("net salary :-" + net_sal); 
    }
}
