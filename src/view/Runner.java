package view;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

import model.CellPlan;
import model.Phone;
import model.ServicePhone;
import presenter.HandlingCalls;

public class Runner {

    private HandlingCalls handlingCalls;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Runner runner = new Runner();
        runner.mainMenu();
    }

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);

        char option = '1';
        do {
            System.out.println("1-administrator \n" + "2-use");
            String optionn = sc.next();
            option = optionn.charAt(0);

            switch (option) {
                case '1':
                    System.out.println("1-add cellPlane and phones\n" + "2-back to main menu ");
                    optionn = sc.next();
                    option = optionn.charAt(0);

                    switch (option) {
                        case '1':
                            addPhone();
                            break;
                    }
                    break;

                case '2':
                    // Implement logic for option 2
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option == '2');

        sc.close();
    }

    public void addPhone() {
        Scanner sc = new Scanner(System.in);
        // Implement logic to add a phone

        System.out.println("Create phones");

        // Create the first phone
        boolean a = false;
        for (int i = 0; i < 3; i++) {
            handlingCalls = new HandlingCalls();
            do {
                System.out.println("Enter IMEI for phone " + (i + 1) + ":");
                String imeiOne = sc.next();

                System.out.println("Enter phone number for phone " + (i + 1) + ":");
                String numberOne = sc.next();

                System.out.println("Enter manufacturing date for phone " + (i + 1) + " (format: yyyy-MM-dd):");
                String fechaStringOne = sc.next();
                LocalDate fechaOne = LocalDate.parse(fechaStringOne);

                System.out.println("Enter plan description for phone " + (i + 1) + ":");
                String descriptionOne = sc.next();

                System.out.println("Enter number of minutes for the plan of phone " + (i + 1) + ":");
                int minutesOne = sc.nextInt();

                try {
                    boolean phones = handlingCalls.addPhone(imeiOne, numberOne, fechaOne, descriptionOne, minutesOne);

                    if (phones) {
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("Registration failed");
                    }
                } catch (Exception e) {
                    System.out.println("IMEI already registered.. try again");
                    a = true;

                }
            } while (a == true);

        }
        mainMenu();
    }

    public void findPhone() {
        // Implement logic to find a phone
    }

    public void addMinutes() {
        // Implement logic to add minutes to a phone
    }

    public void registryCall() {
        // Implement logic to register a call
    }
}