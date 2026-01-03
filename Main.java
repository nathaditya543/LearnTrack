import java.util.*;
import entities.*;

public interface Main {
    public static void  main(String[] args){
        entities.Student st1 = new entities.Student(1443, "Aditya", "Nath", "nath_adi");
        entities.Trainer tr1 = new entities.Trainer({"phy", "math"}, 1443, "Te", "acher", "te_acher");
        System.out.println(tr1.getName());
    }
}
