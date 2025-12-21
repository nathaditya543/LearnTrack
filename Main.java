import java.util.*;
import entities.*;

public interface Main {
    public static void  main(String[] args){
        entities.student st1 = new entities.student(1443, "Aditya", "Nath", "nath_adi");
        System.out.println(st1.getName());
    }
}
