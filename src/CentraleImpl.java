public class CentraleImpl extends UnicastRemoteObject implements Centrale {
    private Map<Integer, Vehicule> vehicules;
    private int nextId;

    public CentraleImpl() throws RemoteException {
        // Initialise la structure de données pour stocker les véhicules
        vehicules = new HashMap<>();
        nextId = 1;
    }

    // Ajoute un véhicule au système et retourne son identifiant unique
    public int ajouterVehicule() throws RemoteException {
        // Implémentation à ajouter
        return 0;
    }

    // Retire un véhicule de la flotte en fonction de son ID
    public boolean retirerVehicule(int id) throws RemoteException {
        // Implémentation à ajouter
        return false;
    }

    // Met à jour l'état et la position d'un véhicule
    public boolean updateStatus(int id, String etat, double latitude, double longitude) throws RemoteException {
        // Implémentation à ajouter
        return false;
    }

    // Retourne la liste des véhicules actuellement enregistrés
    public List<Vehicule> getListeVehicules() throws RemoteException {
        // Implémentation à ajouter
        return null;
    }

    // Affiche les informations de tous les véhicules suivis
    public void afficherFlotte() throws RemoteException {
        // Implémentation à ajouter
    }
}