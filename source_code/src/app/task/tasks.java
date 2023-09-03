package app.task;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    public static void addtask()
    {
        Scanner in = new Scanner(System.in);
//        get the event name
        System.out.println("enter event name");
        String event_name = in.next();

//        get the event description
        System.out.println("enter the event description");
        String event_descirption = in.next();

//        get the due date in DD_MM_YYYY format
//        adding a try block to check whether the input is in corrct format
        System.out.println("enter the date in DD-MM-YYYY format");
        String date = in.next();
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = dateFormat.format(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to the to-do-list-app");
        ArrayList<tasks> arr = new ArrayList<>(10);

        display();
    }








































    private static void exitapp() {
    }

    private static void listall() {

    }

    private static void edittask() {

    }

    private static void deletetask() {
    }
}