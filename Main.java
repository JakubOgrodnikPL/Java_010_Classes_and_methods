import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        ToDoItem toDoItem1 = new ToDoItem("Zadanie1 ", LocalDate.of(2022,10,9), 9);
        tasks.addToDoItem(0,toDoItem1);
        ToDoItem toDoItem2 = new ToDoItem("Zadanie2", LocalDate.of(2022, 10,12), 8);
        tasks.addToDoItem(1,toDoItem2);
        ToDoItem toDoItem3 = new ToDoItem("Zadanie3", LocalDate.of(2022, 10,14), 5);
        tasks.addToDoItem(2,toDoItem3);

        ToDoItem retrieved = tasks.getToDoItem(2);
        System.out.println("Name: " + retrieved.name + ", Deadline: " + retrieved.deadline + ", Priority: " + retrieved.priority);

        ToDoItem[] todoItems = tasks.toDoItems;

        for (ToDoItem todoItem : todoItems){
            System.out.println("Name: " + todoItem.name + ", Deadline: " +  todoItem.deadline + ", Priority: " +  todoItem.priority);
        }
    }
}