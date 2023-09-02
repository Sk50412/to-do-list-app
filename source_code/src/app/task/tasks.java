package app.task;

import java.time.Instant;
import java.util.*;


public class tasks {
    String Event_name;
    String Event_description;
    Date Due_date;
    boolean is_complete;

    public tasks(String event_name, String event_description, Date due_date)
    {
        this.Event_name=event_name;
        this.Event_description=event_description;
        this.Due_date=due_date;
        this.is_complete=false;
    }

    public Date getDue_date() {
        return Due_date;
    }

    public String getEvent_description() {
        return Event_description;
    }

    public boolean isIs_complete() {
        return is_complete;
    }

    public String getEvent_name() {
        return Event_name;
    }

    public void setDue_date(Date due_date) {
        Due_date = due_date;
    }

    public void setEvent_description(String event_description) {
        Event_description = event_description;
    }

    public void setEvent_name(String event_name) {
        Event_name = event_name;
    }

    public void setIs_complete(boolean is_complete) {
        this.is_complete = is_complete;
    }

    private static void display() {
        System.out.println("select your choice from the menu");
        menu();
    }

    private static void menu() {
        System.out.println("1. Add a task ");
        System.out.println("2. Edit a task ");
        System.out.println("3. Delete a task ");
        System.out.println("4. Lists all task ");
        System.out.println("5. exit the application ");
        System.out.println("Enter your choice according to the number given");
        getchoice();
    }

    private static void getchoice() {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1 -> addtask();
            case 2 -> edittask();
            case 3 -> deletetask();
            case 4 -> listall();
            case 5 -> exitapp();
            default -> System.out.println("enter correct number");
        }
    }

    private static void exitapp() {
    }

    private static void listall() {
        
    }

    private static void edittask() {
        
    }

    private static void deletetask() {
        
        
    }

    public void addtask()
    {
        getEvent_name();
        getEvent_description();
        getDue_date();
    }

    public static void main(String[] args) {
        System.out.println("welcome to the to-do-list-app");
        display();
    }
}
