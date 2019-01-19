package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);
        //THEN
        Assert.assertEquals("Dojazd do pracy", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
        System.out.println(drivingTask.executeTask());
    }

    @Test
    public void testFactoryPaintingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        //THEN
        Assert.assertEquals("Summer house renovation", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
        System.out.println(paintingTask.executeTask());
    }

    @Test
    public void testFactoryShoppingTask() {
        //GIVEN
        TaskFactory factory = new TaskFactory();
        //WHEN
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);
        //THEN
        Assert.assertEquals("Carrefour", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
        System.out.println(shoppingTask.executeTask());
    }
}
