package app.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class edit {
    boolean completion;
    String eventname;
    String event_description;
    String due_date;

    Date ex_date;

    public static void menu() {
        System.out.println("\nwhich element to edit in a task\n");
        System.out.println("1.completion");
        System.out.println("2.name of event");
        System.out.println("3.description of event");
        System.out.println("4.event duedate");
        System.out.println("enter your choice : ");
    }

    public static ArrayList<tasks> completion(ArrayList<tasks> tasklist, int to_eidt) {
        Scanner in = new Scanner(System.in);
        tasks current = tasklist.get(to_eidt);
        System.out.println("\nis the task completed ? (Y/N) : ");
        String str = in.next();
        if (str == "Y") {
            current.is_complete = true;
        } else current.is_complete = false;
        in.close();
        return tasklist;
    }

    public static void event_name(ArrayList<tasks> tasklist, int to_edit) {


    }

    public static void event_description(ArrayList<tasks> tasklist, int to_eidt) {

    }

    public static void due_date(ArrayList<tasks> tasklist, int to_eidt) {

    }
}
