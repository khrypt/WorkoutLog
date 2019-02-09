package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Workout implements HasID<String> {
    private String id = UUID.randomUUID().toString();
    private LocalDateTime date;
    private WorkoutType type;
    private Duration duration;
    private List<BodyParts> bodyParts;
    private List<Exercise> exercises;
    private String notes;

    public Workout() {
    }

    public Workout(LocalDateTime date, WorkoutType type, Duration duration, List<BodyParts> bodyParts, List<Exercise> exercises, String notes) {
        this.date = date;
        this.type = type;
        this.duration = duration;
        this.bodyParts = bodyParts;
        this.exercises = exercises;
        this.notes = notes;
    }

    @Override
    public String getID() {
        return null;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public WorkoutType getType() {
        return type;
    }

    public Duration getDuration() {
        return duration;
    }

    public List<BodyParts> getBodyParts() {
        return bodyParts;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public String getNotes() {
        return notes;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setBodyParts(List<BodyParts> bodyParts) {
        this.bodyParts = bodyParts;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", duration=" + duration +
                ", bodyParts=" + bodyParts +
                ", exercises=" + exercises +
                ", notes='" + notes + '\'' +
                '}';
    }
}
