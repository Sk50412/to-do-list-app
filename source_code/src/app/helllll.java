package app;

import app.task.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class helllll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        public static void addtask(Scanner in , ArrayList< tasks > taskList) {
//        get the event name
            System.out.println("enter event name");
            String event_name = in.next();
            in.nextLine();

//        get the event description
            System.out.println("enter the event description");
            String event_descirption = in.nextLine();
            in.nextLine();
//        System.out.println();

//        get the due date in DD_MM_YYYY format
//        adding a try block to check whether the input is in correct format

            System.out.println("enter the date in DD-MM-YYYY format");

            Date duedate;
            String datestr = in.nextLine();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                duedate = dateFormat.parse(datestr);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("enter in dd-MM-yyyy format only");
                throw new RuntimeException(e);
            }
//            tasks new_task = new tasks(event_name, event_descirption, duedate);
//            taskList.add(new_task);
        System.out.println(event_name+ " " + event_descirption+" "+duedate);
        }
    }
