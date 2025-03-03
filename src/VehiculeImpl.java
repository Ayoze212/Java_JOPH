public class VehiculeImpl extends UnicastRemoteObject implements VehiculeRemote {
    private int id;
    private String etat;
    private double latitude;
    private double longitude;

    // Constructeur pour initialiser un véhicule avec un identifiant unique
    public VehiculeImpl(int id) throws RemoteException {
        this.id = id;
    }

    // Modifie l'état du véhicule
    public void setEtat(String etat) throws RemoteException {
        this.etat = etat;
    }

    // Met à jour la position GPS du véhicule
    public void setPosition(double latitude, double longitude) throws RemoteException {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Envoie l'état et la position du véhicule à la centrale
    public void envoyerStatut() throws RemoteException {
        // Logique pour envoyer l'état et la position à la centrale
    }

    // Retourne une représentation sous forme de chaîne du véhicule
    public String toString() {
        return "Véhicule ID: " + id + ", État: " + etat + ", Position: (" + latitude + ", " + longitude + ")";
    }
}