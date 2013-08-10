package models.enums;

/**
 * Created with IntelliJ IDEA.
 * User: jeremielapert
 * Date: 10/08/13
 * Time: 13:11
 * To change this template use File | Settings | File Templates.
 */
public enum Statut {
    creation("Création"), termine("Terminé"), expedition("Expédition"), reception("Réception");
    /**
     * String representation of the TerminologyType.
     */
    private String type;

    /**
     * Constructor.
     * @param type
     */
    Statut(String type) {
        this.type = type;
    }

    /**
     * Get the String representation of the TerminologyType.
     * @return type
     */
    public String asString() {
        return type;
    }

    /**
     * Return an TerminologyType from a String value.
     * @param that
     * @return TerminologyType.
     */
    public static Statut valueOfByString(String that) {
        switch (that.toUpperCase()) {
            case "Création" : return creation;
            case "Terminé" : return termine;
            case "Expédition" : return expedition;
            case "Réception" : return reception;
            default: throw new IllegalArgumentException(that + " is not a TerminologyType.");
        }
    }
}
