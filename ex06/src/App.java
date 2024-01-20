import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Holiday> holidayList = new ArrayList<Holiday>();
        Scanner scanner = new Scanner(System.in);

        holidayList.add(new Holiday("01-01-2024", "Confraternização Mundial"));
        holidayList.add(new Holiday("12-02-2024", "Carnaval"));
        holidayList.add(new Holiday("13-02-2024", "Carnaval"));
        holidayList.add(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidayList.add(new Holiday("21-04-2024", "Tiradentes"));
        holidayList.add(new Holiday("01-05-2024", "Dia do Trabalho"));
        holidayList.add(new Holiday("30-05-2024", "Corpus Christi"));
        holidayList.add(new Holiday("07-09-2024", "Independência do Brasil"));
        holidayList.add(new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
        holidayList.add(new Holiday("02-11-2024", "Finados"));
        holidayList.add(new Holiday("15-11-2024", "Proclamação da República"));
        holidayList.add(new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidayList.add(new Holiday("25-12-2024", "Natal"));

        System.out.println("Informe uma data no formato 'DD-MM-YYYY'");
        String date = scanner.nextLine();
        String holiday = isThisDateAHoliday(date, holidayList);
        if (holiday.length() > 0)
            System.out.println("Dia " + date + " é " + holiday +"! 🎉");
        else
            System.out.println("Dia " + date + " não é feriado 🥲");
    }

    public static String isThisDateAHoliday(String date, List<Holiday> holidayList){
        String holidayName = "";
        for (Holiday holiday : holidayList) {
            if (holiday.getDate().equals(date))
                holidayName = holiday.getDescription();
        }
        return holidayName;
    }
}
