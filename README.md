# Fleet Tracking Application

## Overview
The Fleet Tracking Application is a Java RMI-based system designed to monitor and manage a fleet of connected vehicles. The application allows for real-time tracking of vehicle status and GPS coordinates, enabling efficient fleet management.

## Project Structure
```
fleet-tracking-app
├── src
│   ├── Centrale.java
│   ├── CentraleImpl.java
│   ├── Vehicule.java
│   ├── VehiculeRemote.java
│   ├── VehiculeImpl.java
│   ├── Serveur.java
│   └── ClientVehicule.java
├── build.gradle
└── README.md
```

## Components
- **Centrale.java**: Defines the interface for managing vehicles, including methods for adding, removing, and updating vehicle status.
- **CentraleImpl.java**: Implements the Centrale interface, managing the fleet of vehicles using a suitable data structure.
- **Vehicule.java**: Represents a vehicle with attributes for its unique identifier, state, and GPS coordinates.
- **VehiculeRemote.java**: Interface for vehicles to send their status and position to the central management system.
- **VehiculeImpl.java**: Implements the VehiculeRemote interface, allowing vehicles to communicate their status to the Centrale.
- **Serveur.java**: Main class for the RMI server, responsible for starting the server and registering the Centrale object.
- **ClientVehicule.java**: Simulates a vehicle client that connects to the RMI server and sends status updates.

## Setup Instructions
1. Ensure you have Java Development Kit (JDK) installed.
2. Clone the repository:
   ```
   git clone <repository-url>
   ```
3. Navigate to the project directory:
   ```
   cd fleet-tracking-app
   ```
4. Build the project using Gradle:
   ```
   ./gradlew build
   ```

## Usage
1. Start the RMI server by running `Serveur.java`.
2. Run `ClientVehicule.java` to simulate a vehicle connecting to the server and sending updates.

## License
This project is licensed under the MIT License. See the LICENSE file for details.