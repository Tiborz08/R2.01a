package tp5.tabledoperation;

public class Multiplication extends Operation{

    public Multiplication(double terme1, double terme2, boolean modeSansErreur) {
        super(terme1, terme2, modeSansErreur);
    }
    @Override
    public double calculResultat() {
        return super.getTerme1() * super.getTerme2();
    }

    @Override
    public String toString() {
        return super.getTerme1() + " * " + super.getTerme2() + " = ";
    }
}
