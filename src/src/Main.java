import com.aluracursos.conversordivisas.Conversor;
import com.aluracursos.conversordivisas.Menu;

public class Main {
    public static void main(String[] args) {

        Conversor converter = new Conversor();
        converter.setApiKey("2df42a795b3dce6f90cae231");
        Menu menu = new Menu(converter);
        menu.displayMenu();
    }
}