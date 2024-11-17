import java.util.stream.Stream;
import java.util.*;
public class Program {
 
    public static void main(String[] args) {
         
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() 
            .filter(s->s.length()==6) 
            .forEach(s->System.out.println(s)); 
    }
}

