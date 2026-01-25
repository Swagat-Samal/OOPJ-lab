package General;

public class employee {

    protected int empid;
    protected double basic;
    private String ename;

    public employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        return basic + (0.80 * basic) + (0.15 * basic);
    }
}

