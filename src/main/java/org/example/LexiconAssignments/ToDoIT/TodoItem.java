package org.example.LexiconAssignments.ToDoIT;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    //  • id (private) is an int representing each TodoItem object.
    //• title representing a title like ‘Change tires.’ Not allowed to be null or empty
    //• description is used to hold further information
    //• deadLine TodoItem is overdue if current date > deadline. Not allowed to be null
    //• done represent if task is finished
    //• creator represent who created this task.

    private static int idSequencer = 10;
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    public TodoItem(){
        this.id = ++idSequencer;
    }

    //getters and setters
    public int getId(){
        return id;
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public String getTaskDescription(){
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }


    public LocalDate getDeadline(){
        return deadline;
    }

    public void setDeadline(LocalDate deadline){
       // LocalDate deadLine = LocalDate.now();
        this.deadline = deadline;
    }


    public void setDone(boolean done){
        this.done = done;
    }

    public boolean isDone(){
        return done;
    }


    public Person getCreator(){
        return creator;
    }

    public void setCreator(Person creator){
        this.creator = creator;
    }


    //isOverdue() should return true if current date has passed deadLine.
    public boolean isOverdue(){
        LocalDate dateNow = LocalDate.now();
        if (dateNow.isAfter(deadline))
        return true;
        else return  false;
    }


//    public String getSummary(){
//        String summary = "All information in item object: Id: " + getId() + "   Title: "+getTitle()
//                + "   TaskDescription: "+getTaskDescription()+"   Deadline Date: "+getDeadline()+"   Done?: "+isDone()
//                + "   The creator: "+creator.getFirstName()+"   Is it too late?: "+isOverdue();
//
//        return summary;
//    }


    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadline, done);
    }
}
