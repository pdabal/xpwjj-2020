import java.util.List;
import java.util.ArrayList;

public class QuadraticEquation {

    private Double[] coefficents;
    private double[] x;

    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(args);
        qe.solve();
        System.out.println(qe);
        System.out.println(qe.getRoots());
    }

    private String getRoots() {
        String roots = "";
        if (this.x != null) {
            switch (this.x.length) {
                case 2:
                    roots = (String.format("Są dwa pierwiastki: x1 = %.3f, x2 = %.3f.", this.x[0], this.x[1]));
                    break;
                case 1:
                    roots = (String.format("Jest jeden podójny pierwiastek: x = %.3f.", this.x[0]));
                    break;
                default:
                    break;
            }
        } else {
            roots = ("Równanie nie ma rozwiązania rzeczywistego.");
        }
        return roots;
    }

    private void solve() {
        if (this.coefficents != null) {
            double delta = Math.pow(this.coefficents[1], 2.0) - 4 * this.coefficents[0] * this.coefficents[2];
            double doubleA = (2 * this.coefficents[0]);
            if (delta > 0) {
                double deltaSqrt = Math.sqrt(delta);
                this.x = new double[] { ((-this.coefficents[1] - deltaSqrt) / doubleA),
                        ((-this.coefficents[1] + deltaSqrt) / doubleA) };
            } else if (delta == 0) {
                this.x = new double[] { (-this.coefficents[1]) / doubleA };
            }
        }
    }

    public QuadraticEquation(double a, double b, double c) {
        this.coefficents = new Double[] { a, b, c };
        this.x = null;
    }

    public QuadraticEquation(String[] coefficents) {
        List<Double> tmpCoef = new ArrayList<Double>();
        int i = 0;
        do {
            try {
                var tmp = coefficents[i].replace(",",".");
                i++;
                tmpCoef.add(Double.parseDouble(tmp));
            } catch (NumberFormatException e) {
                System.err.println("Nieprawidłowy zapis współczynnika.");
            }
        } while (i < coefficents.length);

        this.coefficents = new Double[3];
        if (tmpCoef.size() > 0) {
            for (int j = 0; (j < tmpCoef.size() && j < 3); j++) {
                this.coefficents[j] = tmpCoef.get(j);
            }
            for (int j = tmpCoef.size(); j < 3; j++) {
                this.coefficents[j] = 0.0;
            }
        } else {
            this.coefficents = null;
        }
        this.x = null;
    }

    @Override
    public String toString() {
        // String ret = "";
        StringBuilder ret = new StringBuilder("y(x) = ");
        if (coefficents != null) {
            ret.append(String.format("%.3f x^2", this.coefficents[0]));
            if (coefficents[1] != 0.0) {
                ret.append(String.format(" + %.3f x", this.coefficents[1]));
            }
            if (coefficents[2] != 0.0){
                ret.append(String.format(" + %.3f", this.coefficents[2]));
            }
        }
        return ret.toString();
    }
}
