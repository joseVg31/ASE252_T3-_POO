import controller.AdcalController;
import view.AdcalFormView;

public class Main {
    public static void main(String[] args) {
        AdcalFormView vista = new AdcalFormView();
        new AdcalController(vista);
        vista.setVisible(true);
    }
}