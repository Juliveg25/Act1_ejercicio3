import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Fecha {
    Calendar calendar = Calendar.getInstance();

    public void mostrarFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = sdf.format(calendar.getTime());
        System.out.println("Fecha actual: " + currentDate);
    }
}

