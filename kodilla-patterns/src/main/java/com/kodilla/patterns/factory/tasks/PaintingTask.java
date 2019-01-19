package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Today you will paint " + whatToPaint + " with " + color + " paint";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
