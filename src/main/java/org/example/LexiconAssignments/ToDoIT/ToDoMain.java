package org.example.LexiconAssignments.ToDoIT;

import java.time.LocalDate;

public class ToDoMain {

    public static void main(String[] args) {
        //Testing Person.class
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        person1.setFirstName("Husayn");
        person1.setLastName("Ganiev");
        person1.setEmail("husan254@gmail.com");
        System.out.println(person1.toString());

        person2.setFirstName("Husayn");
        person2.setLastName("Ganiev");
        person2.setEmail("husan254@gmail.com");
        System.out.println(person2.toString());
        System.out.println(person1.getId());

        //ToDoItem test
        TodoItem item1 = new TodoItem();
        TodoItem item2 = new TodoItem();
        item1.setDeadline(LocalDate.of(2022, 06, 24));  //sets deadline date
        System.out.println(item1.getDeadline());
        item1.setCreator(person1);
        item1.setTitle("Project ToDoIT");
        item1.setTaskDescription("Working with OOP");
        item1.setDone(false);
        System.out.println(item1.toString());
        System.out.println(item2.getId());
        System.out.println(item1.getId());


        //ToDOItemTask test
        TodoItemTask task1 = new TodoItemTask();
        task1.setAssigned(true);
        task1.setAssignee(person1);
        task1.setTodoItem(item1);
        System.out.println("\n"+task1.toString());

        AppUser accForHusayn = new AppUser("Husayn", "dsfaqr", AppRole.ROLE_APP_ADMIN);

        Person person = new Person(1,"Husayn", "Ganiev", "huahasd", accForHusayn );

        System.out.println(person1.equals(person2));
        System.out.println(task1.hashCode());


    }
}
