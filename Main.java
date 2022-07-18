package com.manuel.spaceships;
import java.util.Scanner;
import java.util.ArrayList;
        
/**
 * Clase principal de un programa que crea naves espaciales dependiendo de lo que el usuario introduzca.
 * @author Manuel Cervantes
 */
class Main {

    public static void main(String[] args) {    // Declaración de la clase principal.
        ArrayList<String> spaceships = new ArrayList<String>(); // Array que guardará las naves durante la sesión del usuario.
        System.out.println("Hello! Welcome to the Sofka Spaceship Factory, ¿Do you want to create a new craft?");
        System.out.println("Type 1 if you want to create a new aircraft or 2 if you don't.");
        Scanner input = new Scanner(System.in); // Solicitud de introducir un número para posteriormente verificarlo.
        int number = input.nextInt();
        while (number == 1){  // Verificación del número introducido por el usuario para decidir si crear o no naves.
                           
                System.out.println("Let's create a new spacecraft!");
                System.out.println("From now on, please select your options by typing the numbers.");
                System.out.println("Which type of spacecraft do you want? \n1- Shuttle spacecraft 2- Unmanned spacecraft 3- Manned Spacecraft 4- Tourist spacecraft");
                Scanner craftInt = new Scanner(System.in);
                int craftType = craftInt.nextInt(); // Input para conocer qué clase de nave quiere construir el usuario.

                if (craftType == 1) {       // Ciclos if-else para la creación de la nave según el tipo que el usuario elija
                    System.out.println("Type the name of your Shuttle spacecraft:");                                        
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
                    System.out.println("Type the country of your Shuttle spacecraft:");
                    Scanner countryInput = new Scanner(System.in);
                    String country = countryInput.nextLine();
                    System.out.println("Type the type of fuel of your Shuttle spacecraft:");
                    Scanner fuelInput = new Scanner(System.in);
                    String fuel = fuelInput.nextLine();
                    System.out.println("Write down the maximum weight (in tons) your Shuttler can support :");
                    Scanner weightInput = new Scanner(System.in);
                    int weight = weightInput.nextInt();
                    ShuttleCraft obj = new ShuttleCraft(weight, name, country, fuel);
                    System.out.println(obj.description());
                    System.out.println(obj.launching());
                    spaceships.add(obj.description());
                    System.out.println("You have created " + spaceships.size() + " spacecrafts today.");
                }
                
                else if (craftType == 2) {
                    System.out.println("Type the name of your Unmanned spacecraft:");
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
                    System.out.println("Type the country of your Unmanned spacecraft:");
                    Scanner countryInput = new Scanner(System.in);
                    String country = countryInput.nextLine();
                    System.out.println("Type the type of fuel of your Unmanned spacecraft:");
                    Scanner fuelInput = new Scanner(System.in);
                    String fuel = fuelInput.nextLine();
                    System.out.println("Type the maximum distance (in milles) your Unmanned spacecraft can travel:");
                    Scanner distanceInput = new Scanner(System.in);
                    int distance = distanceInput.nextInt();
                    UnmannedCraft obj = new UnmannedCraft(distance, name, country, fuel);
                    System.out.println(obj.description());
                    System.out.println(obj.launching());
                    spaceships.add(obj.description());
                    System.out.println("You have created " + spaceships.size() + " spacecrafts today.");
                }
                
                else if (craftType == 3){
                    System.out.println("Type the name of your Manned spacecraft:");
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
                    System.out.println("Type the country of your Manned spacecraft:");
                    Scanner countryInput = new Scanner(System.in);
                    String country = countryInput.nextLine();
                    System.out.println("Type the type of fuel of your Manned spacecraft:");
                    Scanner fuelInput = new Scanner(System.in);
                    String fuel = fuelInput.nextLine();
                    System.out.println("Type the maximum passengers your Manned spacecraft can carry:");
                    Scanner passengersInput = new Scanner(System.in);
                    int passengers = passengersInput.nextInt();
                    MannedCraft obj = new MannedCraft(passengers, name, country, fuel);
                    System.out.println(obj.description());
                    System.out.println(obj.launching());
                    spaceships.add(obj.description());
                    System.out.println("You have created " + spaceships.size() + " spacecrafts today.");    
                }
                
                else if (craftType == 4)  {
                    System.out.println("Type the name of your Tourist spacecraft:");
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
                    System.out.println("Type the country of your Tourist spacecraft:");
                    Scanner countryInput = new Scanner(System.in);
                    String country = countryInput.nextLine();
                    System.out.println("Type the type of fuel of your Tourist spacecraft:");
                    Scanner fuelInput = new Scanner(System.in);
                    String fuel = fuelInput.nextLine();
                    System.out.println("Type the maximum passengers your Tourist spacecraft can carry:");
                    Scanner passengersInput = new Scanner(System.in);
                    int passengers = passengersInput.nextInt();
                    System.out.println("Type the destination of your Tourist spacecraft:");
                    Scanner destinationInput = new Scanner(System.in);
                    String destination = destinationInput.nextLine();
                    TouristCraft obj = new TouristCraft(passengers, destination, name, country, fuel);
                    System.out.println(obj.description());
                    System.out.println(obj.launching());
                    spaceships.add(obj.description());
                    System.out.println("You have created " + spaceships.size() + " spacecrafts today.");
                }
                
                else {                                                                                    
                    System.out.println("You typed a wrong number. Please start over.");
                }
                
            System.out.println("Do you want to create a spacecraft? \n1- Yes \n2- No");                  
                Scanner repeat = new Scanner(System.in);                                                        // Solicitud de Boolean que permite conocer si el usuario
                number = repeat.nextInt();                                                                      // quiere seguir o no creando naves.
        } 
    }
  
}
