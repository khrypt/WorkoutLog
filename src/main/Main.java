import business.WorkoutService;
import domain.Workout;
import persistance.DAO;
import persistance.InMemoryDAO;
import presentation.ConsoleUI;

public class Main {

    public static void main(String[] args) {

        DAO<String, Workout> workoutDAO = new InMemoryDAO<>();
        WorkoutService workoutService = new WorkoutService(workoutDAO);
        ConsoleUI console = new ConsoleUI(workoutService);

        console.run();
    }
}
