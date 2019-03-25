package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentsExercises studentAdamExercises = new StudentAdamExercises();
        StudentsExercises studentThomasExercises = new StudentThomasExercises();
        StudentsExercises studentEvaExercises = new StudentEvaExercises();
        Mentor andrzej = new Mentor("Andrzej");
        Mentor adrian = new Mentor("Adrian");
        studentAdamExercises.registerObserver(andrzej);
        studentEvaExercises.registerObserver(andrzej);
        studentThomasExercises.registerObserver(adrian);
        //When
        studentAdamExercises.addExercise("Zadanie fasada");
        studentAdamExercises.addExercise("zadanie dekorator");
        studentEvaExercises.addExercise("Zadanie fasada");
        studentThomasExercises.addExercise("Zadanie dekorator");

        //Then
        assertEquals(3, andrzej.getUpdateCount());
        assertEquals(1, adrian.getUpdateCount());
    }
}