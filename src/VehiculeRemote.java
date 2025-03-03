public interface VehiculeRemote extends Remote {
    // Envoie l'état et la position du véhicule à la centrale de gestion
    void envoyerStatut() throws RemoteException;
}