package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorname;
    private int updateCount;

    public Mentor(String mentorname) {
        this.mentorname = mentorname;
    }

    @Override
    public void update(StudentsExercises studentsExercise) {
        System.out.println(mentorname + ": new exercises to review (" + studentsExercise.getExerciseTitle() + ")" + "\n" +
                " (Total number of exercises " + studentsExercise.getExerciseTitle() + ": " + studentsExercise.getExercises().size() + ")");
        updateCount++;
    }

    public String getMentorname() {
        return mentorname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
