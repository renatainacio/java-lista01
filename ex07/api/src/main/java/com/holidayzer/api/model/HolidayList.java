package com.holidayzer.api.model;

import java.util.ArrayList;
import java.util.List;

public class HolidayList {

    private List<Holiday> holidays = new ArrayList<Holiday>();

    public HolidayList(){
        holidays.add(new Holiday("01-01-2024", "Confraternização Mundial"));
        holidays.add(new Holiday("12-02-2024", "Carnaval"));
        holidays.add(new Holiday("13-02-2024", "Carnaval"));
        holidays.add(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.add(new Holiday("21-04-2024", "Tiradentes"));
        holidays.add(new Holiday("01-05-2024", "Dia do Trabalho"));
        holidays.add(new Holiday("30-05-2024", "Corpus Christi"));
        holidays.add(new Holiday("07-09-2024", "Independência do Brasil"));
        holidays.add(new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02-11-2024", "Finados"));
        holidays.add(new Holiday("15-11-2024", "Proclamação da República"));
        holidays.add(new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidays.add(new Holiday("25-12-2024", "Natal"));        
    }

    public String getHolidays(){
        String printableHolidays = "";
        for (Holiday holiday : this.holidays) {
            printableHolidays += (holiday.getDate() + " - " + holiday.getDescription() + "\n");
        }
        return printableHolidays;
    }

    public String getHolidayFromDate(String date){
        for (Holiday holiday : this.holidays) {
            if (holiday.getDate().equals(date))
                return holiday.getDescription();
        }
        return "";
    }

}
