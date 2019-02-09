package presentation;

import business.WorkoutService;
import domain.Workout;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private WorkoutService workoutService;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    private void printHelp() {
        System.out.println("-1 = exit");
        System.out.println(" 0 = print help");
        System.out.println(" 1 = print all workouts");
    }

    public void run() {

        String command;
        boolean over = false;
        System.out.println("Welcome!");
        while (!over) {

            System.out.println("\nFor help, press 0");
            System.out.print("Enter command: ");
            command = scanner.next();

            switch (command) {
                case "-1":
                    over = true;
                    break;
                case "0":
                    printHelp();
                    break;
                case "1":
                    printAllWorkouts();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
        System.out.println("Have a nice day!");
    }

    private void printAllWorkouts() {
        List<Workout> allWorkouts = workoutService.getAll();
        if (allWorkouts.size() > 0)
            allWorkouts.forEach(System.out::println);
        else
            System.out.println("No workouts available!");
    }
}