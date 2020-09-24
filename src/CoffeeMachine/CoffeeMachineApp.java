package CoffeeMachine;

import CoffeeMachine.Coffe.*;

import java.util.Scanner;

public class CoffeeMachineApp {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine("deLonghi", 2000, 100,
                300, 10);

        System.out.println("Welcome! " + coffeeMachine.getName() + " is ready!");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("\t1 Show status");
            System.out.println("\t2 Make cofee");
            System.out.println("\t3 Descaling the coffee machine");
            System.out.println("\t4 Make up the water");
            System.out.println("\t5 Make up the coffee");
            System.out.println("\t6 Make up the milk");
            System.out.println("\t7 Turn off");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CoffeeMachineApp.showStatus(coffeeMachine);
                    CoffeeMachineApp.checkDescaling(coffeeMachine);
                    break;
                case 2:
                    CoffeeMachineApp.chooseCoffee(coffeeMachine);
                    break;
                case 3:
                    CoffeeMachineApp.descaling(coffeeMachine);
                    break;
                case 4:
                    CoffeeMachineApp.refillWater(coffeeMachine);
                    break;
                case 5:
                    CoffeeMachineApp.refillCoffee(coffeeMachine);
                    break;
                case 6:
                    CoffeeMachineApp.refillMilk(coffeeMachine);
                    break;
                case 7:
                    System.out.println("Have a nice day! Good bye!");
            }
            if (choice < 1 || choice > 7) {
                System.out.println("Wrong choice. Try again.");
            }
        } while (choice != 7);
    }

    private static void showStatus(CoffeeMachine coffeeMachine) {
        System.out.println("Water capacity is " + coffeeMachine.getCurrentWaterCapacity() + " ml");
        System.out.println("Coffee capacity is " + coffeeMachine.getCurrentCoffeeCapacity() + " g");
        System.out.println("Milk capacity is " + coffeeMachine.getCurrentMilkCapacity() + " ml");
        System.out.println("You can make " + (coffeeMachine.maxNumberOfCofeeBeforeDescaling - coffeeMachine.coffeeCounter)
                + " coffee(s)");
        System.out.println("Coffee machine " + coffeeMachine.getName() + " is ready!");
    }

    private static void chooseCoffee(CoffeeMachine coffeeMachine) {

        Cappucino cappucino = new Cappucino();
        Espresso espresso = new Espresso();
        FlatWhite flatWhite = new FlatWhite();
        Latte latte = new Latte();
        Americano americano = new Americano();

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("What coffee would you like to drink?");
        System.out.println("\t1 Cappucino");
        System.out.println("\t2 Espresso");
        System.out.println("\t3 Flat white");
        System.out.println("\t4 Latte");
        System.out.println("\t5 Americano");
        choice = scanner.nextInt();
        if (choice == 1) {
            if (!CoffeeMachineApp.chceckMachine(cappucino, coffeeMachine)) {
            } else {
                CoffeeMachineApp.makeCoffee(cappucino, coffeeMachine);
            }
        } else if (choice == 2) {
            if (!CoffeeMachineApp.chceckMachine(espresso, coffeeMachine)) {
            } else {
                CoffeeMachineApp.makeCoffee(espresso, coffeeMachine);
            }
        } else if (choice == 3) {
            if (!CoffeeMachineApp.chceckMachine(flatWhite, coffeeMachine)) {
            } else {
                CoffeeMachineApp.makeCoffee(flatWhite, coffeeMachine);
            }
        } else if (choice == 4) {
            if (!CoffeeMachineApp.chceckMachine(latte, coffeeMachine)) {
            } else {
                CoffeeMachineApp.makeCoffee(latte, coffeeMachine);
            }
        } else if (choice == 5) {
            if (!CoffeeMachineApp.chceckMachine(americano, coffeeMachine)) {
            } else {
                CoffeeMachineApp.makeCoffee(americano, coffeeMachine);
            }
        } else {
            System.out.println("Wrong choice, try again.");
            chooseCoffee(coffeeMachine);
        }
    }

    private static void makeCoffee (Coffee coffee, CoffeeMachine coffeeMachine) {
        coffeeMachine.setCurrentCoffeeCapacity(coffeeMachine.getCurrentCoffeeCapacity() - coffee.getCoffee());
        coffeeMachine.setCurrentMilkCapacity(coffeeMachine.getCurrentMilkCapacity() - coffee.getMilk());
        coffeeMachine.setCurrentWaterCapacity(coffeeMachine.getCurrentWaterCapacity() - coffee.getWater());
        coffeeMachine.coffeeCounter++;
        System.out.println(coffee.getName() + " is ready. Cheers!");
    }

    private static boolean chceckMachine(Coffee coffee, CoffeeMachine coffeeMachine) {
        if (coffeeMachine.getCurrentWaterCapacity() < coffee.getWater()) {
            System.out.println("Not enough water, please refill");
            return false;
        } else if (coffeeMachine.getCurrentCoffeeCapacity() < coffee.getCoffee()) {
            System.out.println("Not enough coffee, please refill");
            return false;
        } else if (coffeeMachine.getCurrentMilkCapacity() < coffee.getMilk()) {
            System.out.println("Not enough milk, please refill");
            return false;
        } else {
            return true;
        }
    }

    private static void checkDescaling(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.coffeeCounter >= coffeeMachine.maxNumberOfCofeeBeforeDescaling) {
            System.out.println("Please descale coffee machine.");
        }
    }

    private static void descaling(CoffeeMachine coffeeMachine) {
        coffeeMachine.setCoffeeCounter(0);
        System.out.println("Coffee machine has been descaled");
    }

    private static void refillWater(CoffeeMachine coffeeMachine) {
        coffeeMachine.setCurrentWaterCapacity(coffeeMachine.maxWaterCapacity);
        System.out.println("Water has been refilled");
    }

    private static void refillCoffee(CoffeeMachine coffeeMachine) {
        coffeeMachine.setCurrentCoffeeCapacity(coffeeMachine.maxCoffeeCapacity);
        System.out.println("Coffee has been refilled");
    }

    private static void refillMilk(CoffeeMachine coffeeMachine) {
        coffeeMachine.setCurrentMilkCapacity(coffeeMachine.maxMilkCapacity);
        System.out.println("Milk has been refilled");
    }
}