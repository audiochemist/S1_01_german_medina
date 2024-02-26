package N1Ex3;

import java.util.ArrayList;
import java.util.List;

public class MonthList {

    public static void main(String[] args) {

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        months.forEach((i) -> System.out.println(i));


    }



}
