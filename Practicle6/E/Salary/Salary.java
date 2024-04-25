package Salary;

public class Salary {
    public int computersalary(int b) {
        int hra = b * 10 / 100;
        int da = b * 20 / 100;
        return (b + hra + da);
    }

    public int pfund(int b) {
        int pf = b * 15 / 100;
        return pf;
    }
}
