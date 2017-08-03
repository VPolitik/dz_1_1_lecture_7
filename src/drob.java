
public class drob {
    private int a;
    private int b;
    private double dr;

    public  drob(int a, int b) {
        this.a = a;
        this.b = b;
        this.dr = this.a / this.b;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getDr() {
        return dr;
    }

    void obratnaya_drob(double a){
        System.out.println(1 + "\n-\n" + a);
    }

    void show(){
        System.out.println(a + "\n-\n" + b);
    }

    double add(double a, double b){
        return a + b;
    }

    double sub(double a, double b){
        return a - b;
    }

    double mul(double a, double b){
        return a * b;
    }


}
