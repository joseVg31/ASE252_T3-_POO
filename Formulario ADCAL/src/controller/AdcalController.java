package controller;

import model.Cliente;
import view.AdcalFormView;
import javax.swing.JOptionPane;

public class AdcalController {

    private final AdcalFormView vista;

    public AdcalController(AdcalFormView vista) {
        this.vista = vista;
        initEventos();
    }

    private void initEventos() {
        vista.getBtnEnviar().addActionListener(e -> enviar());
        vista.getBtnLimpiar().addActionListener(e -> vista.limpiarCampos());
    }

    private void enviar() {
        if (!validar()) return;

        Cliente cliente = new Cliente(
                vista.getNombre(),
                vista.getCorreo(),
                vista.getTelefono(),
                vista.getRucDni(),
                vista.getDepartamento(),
                vista.getDistrito(),
                vista.getProvincia(),
                vista.getComoNosConocio(),
                vista.getMensaje()
        );

        JOptionPane.showMessageDialog(
                vista,
                cliente.toString(),
                "Formulario enviado correctamente",
                JOptionPane.INFORMATION_MESSAGE
        );

        vista.limpiarCampos();
    }

    private boolean validar() {
        if (vista.getNombre().isEmpty()) {
            error("El nombre o razón social es obligatorio.");
            return false;
        }
        if (vista.getCorreo().isEmpty()) {
            error("El correo electrónico es obligatorio.");
            return false;
        }
        if (vista.getTelefono().isEmpty()) {
            error("El teléfono es obligatorio.");
            return false;
        }
        return true;
    }

    private void error(String msg) {
        JOptionPane.showMessageDialog(vista, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}