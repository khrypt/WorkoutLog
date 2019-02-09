package business;

import domain.Workout;
import persistance.DAO;

import java.util.List;

public class WorkoutService {

    private DAO<String, Workout> workoutDAO;

    public WorkoutService(DAO<String, Workout> workoutDAO) {
        this.workoutDAO = workoutDAO;
    }

    public List<Workout> getAll(){
        return workoutDAO.getAll();
    }

//    public void add(String... args){
//        Workout w = new Workout();
//        workoutDAO.add(w);
//    }
}
