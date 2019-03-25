package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentsExercises implements Observable {
    private final List <Observer> observers;
    private final List <String> exercises;
    private final String exerciseTitle;


    public StudentsExercises(String exerciseTitle) {
        observers = new ArrayList <>();
        exercises = new ArrayList <>();
        this.exerciseTitle = exerciseTitle;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List <String> getExercises() {
        return exercises;
    }

    public String getExerciseTitle() {
        return exerciseTitle;
    }
}
