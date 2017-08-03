
public class main {
    public static void main(String[] args) {

        drob n1 = new drob(234,23);
        drob n2 = new drob(2435,545);
        drob n3 = new drob(12,9);

        double dr1 = n1.getDr();
        double dr2 = n2.getDr();
        double dr3 = n3.getDr();

        double a1 = n1.add(dr1, dr2);
        double a2 = n1.add(dr1, dr3);
        double R = n1.mul(a1, a2);
        System.out.println(R);
        n1.obratnaya_drob(R);

    }
}
