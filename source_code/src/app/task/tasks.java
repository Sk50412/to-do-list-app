
package app.task;

import java.text.SimpleDateFormat;
import java.util.*;

public class tasks {
    String Event_name;
    String Event_description;
    Date Due_date;
    boolean is_complete;

    public tasks(String event_name, String event_description, Date due_date, boolean completion) {
        this.Event_name = event_name;
        this.Event_description = event_description;
        this.Due_date = due_date;
        this.is_complete = completion;
    }

    public String getEvent_name() {
        return Event_name;
    }

    public String getEvent_description() {
        return Event_description;
    }

    public Date getDue_date() {
        return Due_date;
    }

    public boolean isIs_complete() {
        return is_complete;
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
    }

    private static int getchoice() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("welcome to the to-do-list-app");
        ArrayList<tasks> taskList = new ArrayList<>(10);
        int choice = 0;
        while (choice != 5) {
            display();
            choice = getchoice();
            switch (choice) {
                case 1 -> addtask(new Scanner(System.in), taskList);
                case 2 -> edittask(taskList);
                case 3 -> deletetask();
                case 4 -> listall(taskList);
                case 5 -> exitapp();
                default -> System.out.println("enter correct number");
            }
        }
    }


    public static void addtask(Scanner in, ArrayList<tasks> taskList) {
//        get the event name
        System.out.println("enter event name");
        String event_name = in.nextLine();

//        get the event description
        System.out.println("enter the event description");
        String event_descirption = in.nextLine();

//        get the due date in DD_MM_YYYY format
//        adding a try block to check whether the input is in correct format

        System.out.println("enter the date in DD-MM-YYYY format");

        Date duedate;
        String datestr = in.nextLine();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            duedate = dateFormat.parse(datestr);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("enter in dd-MM-yyyy format only");
            throw new RuntimeException(e);
        }


        boolean completion = false;
        tasks new_task = new tasks(event_name, event_descirption, duedate, completion);
        taskList.add(new_task);
    }


    private static void listall(ArrayList<tasks> taskList) {
        System.out.println("-------------------------");
        for (int i = 0; i < taskList.size(); i++) {
            tasks current = taskList.get(i);
            System.out.println("''''''''''''''''''''");
            System.out.println("Event id " + i + 1 + "\n" + current.toString());
            System.out.println("''''''''''''''''''''");
        }
        System.out.println("-------------------------");
    }

    private static void edittask(ArrayList<tasks> tasklist) {
        Scanner in = new Scanner(System.in);
        listall(tasklist);
        System.out.println("---------------------------------");
        System.out.println("*  *  *  *  *  *  *  *  *  *  *  *\n");
        System.out.println("enter the task number you want to edit :");
        int to_eidt = in.nextInt();
        edit.menu();
        int choice = in.nextInt();
        System.out.println("\n\n*  *  *  *  *  *  *  *  *  *  *  *");
        System.out.println("---------------------------------");
        switch (choice) {
            case 1 -> edit.completion(tasklist, to_eidt);
            case 2 -> edit.event_name(tasklist, to_eidt);
            case 3 -> edit.event_description(tasklist, to_eidt);
            case 4 -> edit.due_date(tasklist, to_eidt);
            default -> System.out.println("enter correct choice");
        }
    }

    private static void deletetask() {
    }

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String duedatestr = dateFormat.format(Due_date);
        return " Event name : " + Event_name + "\n Event Description : " + Event_description + "\n Due Date : " + duedatestr + "\ncompletion : " + is_complete;

    }

    private static void exitapp() {
        System.out.println("exiting the application");
    }

}