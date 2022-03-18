package patika.insurance.panel.insurance;

import patika.insurance.entities.*;
import patika.insurance.entities.enums.InsuranceTypes;
import patika.insurance.panel.MainPanel;
import patika.patikastore.Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InsuranceManagerPanel {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static AbstractInsurance insurance;


    public static void addNewInsurancePanel() {
        Boolean exitFlag = false;
        panelOptions();
        switch (chooseOption()) {
            case 0:
                exitFlag = true;
                break;
            case 1:
                insurance = new CarInsurance();
                break;
            case 2:
                insurance = new HealthInsurance();
                break;
            case 3:
                insurance = new ResidenceInsurance();
                break;
            case 4:
                insurance = new TravelInsurance();
                break;
        }

        if (!exitFlag) {
            addInsurance();
        }
    }

    private static void panelOptions() {
        System.out.println("Choose your insurance type");
        int count = 1;
        for (InsuranceTypes type : InsuranceTypes.values()) {
            System.out.println(count + " - " + type.getValue());
            count++;
        }
        System.out.println("0 - go back to main panel");
    }

    private static Integer chooseOption() {
        System.out.print("Your choice : ");
        return MainPanel.input.nextInt();
    }

    private static void addInsurance() {
        System.out.print("Choose a name for your insurance : ");
        String name = Main.input.nextLine();

        System.out.print("Enter your start time as dd/MM/yyyy format = ");
        String startTimeString = Main.input.nextLine();

        System.out.print("Enter the insurance's duration as months = ");
        Integer duration = Main.input.nextInt()*30;

        LocalDate startTime = LocalDate.parse(startTimeString, formatter);
        LocalDate endTime = startTime.plusMonths(duration);

        insurance.setInsuranceName(name);
        insurance.setStart(startTime);
        insurance.setEnd(endTime);
        insurance.setInsuranceCost(insurance.calculate(MainPanel.getAccount()));

        System.out.println("Your insurance's total cost is : " + insurance.getInsuranceCost());

        System.out.print("Do you want to continue? y/N : ");
        Main.input.nextLine();
        String input = Main.input.nextLine();
        input = input.toLowerCase(Locale.ROOT);

        if (input.equals("y")) {
            MainPanel.getAccount().addInsurance(insurance);
        } else {
            System.out.println("You are directed to the main panel");
        }
    }

    public static void listAllInsurances() {
        for (AbstractInsurance insurance : MainPanel.getAccount().getInsuranceList()) {
            System.out.println(insurance.toString());
        }
    }
}
