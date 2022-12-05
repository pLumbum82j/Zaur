package lesson29;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hw {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY,MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d){
        LocalDateTime nacalo = ldt1;
        while (nacalo.isBefore(ldt2)){
            System.out.print("Работаем с: " + ldt1.format(dtf1));
            nacalo = nacalo.plus(p);
            System.out.println(" до: " + nacalo.format(dtf1));
            System.out.print("Отдыхаем с: " + nacalo.format(dtf2));
            nacalo = nacalo.plus(d);
            System.out.println(" до: " + nacalo.format(dtf2));
        }
    }


    public static void main(String[] args) {
        Hw h = new Hw();
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(8);
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024,11,22,12,00);
       h.smena(ldt1,ldt2,period, duration);
    }

}
