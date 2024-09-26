public class Annonce {
    public static final double COEF_NON_HABITABLE = 0.25;

    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;

    public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement) {
        this.reference = reference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.logement = logement;
    }

    public double prix() {
        return logement.surfaceHabitable() * prixM2Habitable +
         logement.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE;
    }

    @Override
    public String toString() {
        return titre + "\n"
                + "Annonce " + reference + " du " + date + "\n"
                + logement + "\n" + logement.toString() + "\n" 
                + "- Prix du m2 habitable : " + prixM2Habitable + " euros\n"
                + "- prix du m2 non habitable : " + prixM2Habitable * COEF_NON_HABITABLE + " euros\n"
                + "Valeur du bien : " + prix() + " euros"
                + "\n\n" + "Contact : " + logement.getVendeur().getEmail() + " / " + logement.getVendeur().getNumeroTelephone() + "\n";

    }

}
