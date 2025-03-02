# Pawsshop - Cashier and Manager System

Pawsshop is a simple Java-based point-of-sale (POS) system designed to manage cashiers and managers in a retail environment. The application features a login system where users can authenticate as either a Cashier or Manager, with each role having specific functionalities. The system also allows managers to add new cashiers, and both roles can view, add, and search supplies.

## Features

- **Login System**: Users can log in as either a Cashier or a Manager.
- **Cashier Features**: Cashiers can view, add, and search supplies in the system.
- **Manager Features**: Managers can perform all of Cashier's function and add new cashiers to the system.
- **Data Persistence**: User data and supply information are saved to files for persistence across sessions.

## Project Structure

- `LoginForm.java`: The login screen that authenticates users based on stored data.
- `CashierFrame.java`: The main interface for cashiers, allowing them to manage supplies.
- `ManagerFrame.java`: The main interface for managers, extending the cashier interface with the ability to add new cashiers.
- `Cashier.java`: A class representing a cashier, inheriting from the `User` class.
- `Manager.java`: A class representing a manager, inheriting from the `Cashier` class.
- `User.java`: The base class for all users (both cashiers and managers).

## Technologies Used

- **Java**: The programming language used for the application.
- **Swing**: For creating the graphical user interface (GUI).
- **File I/O**: Used to persist user data and supply information across sessions.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/PenielUthayakumar/pawsshop.git
2. **Navigate to the project folder**:
   ```bash
   cd pawsshop
3. **Compile and run the project: You can run the project using any Java IDE like NetBeans, IntelliJ IDEA, or using the command line**:
   ```bash
   java *.java
   java pawshop.LoginForm
4. Login:
    - Username: arun, Password: arun for Cashier
    - Username: peniel, Password: peniel for Manager

## How to Add a New Cashier (Manager Only)
- Login as Manager: Use the Manager credentials.
- Add Cashier: On the Manager dashboard, fill in the details for the new cashier (Name, Contact No, Username, Password, and Cashier No) and click "Add Cashier". The new cashier will be added to the system and saved persistently in the userList.dat file.

## Notes
- User data such as usernames, passwords, and contact information are stored in a serialized file (userList.dat) for persistence.
- The login system checks if the user is a Cashier or a Manager based on the credentials entered.
