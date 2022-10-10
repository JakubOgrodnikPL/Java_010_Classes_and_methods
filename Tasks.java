public class Tasks {
    ToDoItem[] toDoItems = new ToDoItem[3];

    void addToDoItem (int where, ToDoItem next){
        toDoItems[where] = next;
    }

    ToDoItem getToDoItem(int index){
        ToDoItem item = toDoItems[index];
        return item;
    }
}
