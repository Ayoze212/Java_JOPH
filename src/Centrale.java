public interface Centrale extends Remote {
    // Ajoute un véhicule au système et retourne son identifiant unique
    int ajouterVehicule() throws RemoteException;
    
    // Retire un véhicule de la flotte en fonction de son ID
    boolean retirerVehicule(int id) throws RemoteException;

    // Met à jour l'état et la position d'un véhicule
    boolean updateStatus(int id, String etat, double latitude, double longitude) throws RemoteException;

    // Retourne la liste des véhicules actuellement enregistrés
    List<Vehicule> getListeVehicules() throws RemoteException;

    // Affiche les informations de tous les véhicules suivis
    void afficherFlotte() throws RemoteException;
}