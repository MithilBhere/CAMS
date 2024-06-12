package Success;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB in format of dd/MM/yyyy");
        String dob1 = sc.next();

        String[] arr;

        arr = dob1.split("/");

        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        LocalDate dob2 = LocalDate.of(y,m,d);
        LocalDate dob3= LocalDate.of(2023,m,d);

        int days = Period.between(dob2,today).getDays();
        int months = Period.between(dob2,today).getMonths();
        int years = Period.between(dob2,today).getYears();
        int day = Period.between(today,dob3).getDays();
        int month = Period.between(today,dob3).getMonths();
        int year = Period.between(today,today).getYears();

        System.out.println("You are " +years+ "Years "+months+ "Months "+days+"Days");
        System.out.println("You are birthday is after " +day+ "DayS "+month+ "Months "+year+"Years");

    }

}
