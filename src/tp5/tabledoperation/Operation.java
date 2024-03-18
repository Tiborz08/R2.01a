package tp5.tabledoperation;

public abstract class Operation {
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur;

    public Operation(double terme1, double terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;
    }

    public double getTerme1() {
        return terme1;
    }

    public double getTerme2() {
        return terme2;
    }

    public void setReponseUtilisateur(double reponse) {
        this.reponseUtilisateur = reponse;
    }

    public boolean existeReponseUtilisateur() {
        return reponseUtilisateur != null;
    }

    public boolean isReponseJuste() {
        return reponseUtilisateur != null && reponseUtilisateur == calculResultat();
    }

    public abstract double calculResultat();
}
