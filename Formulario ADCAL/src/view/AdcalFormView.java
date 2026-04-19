package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AdcalFormView extends JFrame {

    private JTextField txtNombre;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private JTextField txtRucDni;
    private JTextField txtDepartamento;
    private JTextField txtDistrito;
    private JTextField txtProvincia;
    private JComboBox<String> cmbComoNosConocio;
    private JTextArea txaMensaje;
    private JButton btnEnviar;
    private JButton btnLimpiar;

    public AdcalFormView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("ADCAL - Formulario de Contacto");
        setSize(800, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(144, 210, 100));
        setLayout(new BorderLayout(10, 10));

        // TÍTULO
        JLabel lblTitulo = new JLabel("ADCAL", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setForeground(new Color(30, 80, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // PANEL CENTRAL
        JPanel panelCentral = new JPanel(new GridLayout(1, 2, 10, 0));
        panelCentral.setOpaque(false);
        panelCentral.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        panelCentral.add(crearPanelIzquierdo());
        panelCentral.add(crearPanelDerecho());
        add(panelCentral, BorderLayout.CENTER);

        // BOTONES
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.setOpaque(false);
        btnEnviar  = new JButton("Enviar");
        btnLimpiar = new JButton("Limpiar");
        estilizarBoton(btnEnviar,  new Color(80, 160, 40));
        estilizarBoton(btnLimpiar, new Color(160, 80, 40));
        panelBoton.add(btnLimpiar);
        panelBoton.add(btnEnviar);
        panelBoton.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        add(panelBoton, BorderLayout.SOUTH);
    }

    private JPanel crearPanelIzquierdo() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JPanel pContacto = crearSeccion("Datos del contacto");
        txtNombre = agregarCampo(pContacto, "Nombre completo / Razón social", "Juan Pérez o Agroindustrias SAC");
        txtCorreo = agregarCampo(pContacto, "Correo electrónico", "contacto@empresa.com");

        JPanel pTelRuc = new JPanel(new GridLayout(1, 2, 8, 0));
        pTelRuc.setOpaque(false);

        JPanel pTel = new JPanel(new BorderLayout(0, 4)); pTel.setOpaque(false);
        pTel.add(new JLabel("Teléfono / Celular"), BorderLayout.NORTH);
        txtTelefono = new JTextField();
        pTel.add(txtTelefono, BorderLayout.CENTER);

        JPanel pRuc = new JPanel(new BorderLayout(0, 4)); pRuc.setOpaque(false);
        pRuc.add(new JLabel("RUC / DNI"), BorderLayout.NORTH);
        txtRucDni = new JTextField();
        pRuc.add(txtRucDni, BorderLayout.CENTER);

        pTelRuc.add(pTel);
        pTelRuc.add(pRuc);
        pContacto.add(pTelRuc);
        panel.add(pContacto);

        return panel;
    }

    private JPanel crearPanelDerecho() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JPanel pUbic = crearSeccion("UBICACIÓN Y MENSAJE");

        JPanel pDep = new JPanel(new GridLayout(1, 3, 8, 0));
        pDep.setOpaque(false);

        JPanel pD = new JPanel(new BorderLayout(0, 4)); pD.setOpaque(false);
        pD.add(new JLabel("Departamento"), BorderLayout.NORTH);
        txtDepartamento = new JTextField();
        pD.add(txtDepartamento, BorderLayout.CENTER);

        JPanel pDi = new JPanel(new BorderLayout(0, 4)); pDi.setOpaque(false);
        pDi.add(new JLabel("Distrito"), BorderLayout.NORTH);
        txtDistrito = new JTextField();
        pDi.add(txtDistrito, BorderLayout.CENTER);

        JPanel pP = new JPanel(new BorderLayout(0, 4)); pP.setOpaque(false);
        pP.add(new JLabel("Provincia"), BorderLayout.NORTH);
        txtProvincia = new JTextField();
        pP.add(txtProvincia, BorderLayout.CENTER);

        pDep.add(pD); pDep.add(pDi); pDep.add(pP);
        pUbic.add(pDep);

        JPanel pCon = new JPanel(new BorderLayout(0, 4)); pCon.setOpaque(false);
        pCon.add(new JLabel("¿Cómo nos conociste?"), BorderLayout.NORTH);
        cmbComoNosConocio = new JComboBox<>(new String[]{
                "Seleccionar...", "Redes sociales", "Recomendación", "Google", "Feria", "Otro"
        });
        pCon.add(cmbComoNosConocio, BorderLayout.CENTER);
        pUbic.add(pCon);

        JPanel pMsg = new JPanel(new BorderLayout(0, 4)); pMsg.setOpaque(false);
        pMsg.add(new JLabel("Mensaje u observación"), BorderLayout.NORTH);
        txaMensaje = new JTextArea(4, 20);
        txaMensaje.setLineWrap(true);
        txaMensaje.setWrapStyleWord(true);
        pMsg.add(new JScrollPane(txaMensaje), BorderLayout.CENTER);
        pUbic.add(pMsg);

        panel.add(pUbic);
        return panel;
    }

    private JPanel crearSeccion(String titulo) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 255, 255, 180));
        TitledBorder border = BorderFactory.createTitledBorder(titulo);
        border.setTitleFont(new Font("Arial", Font.BOLD, 13));
        border.setTitleColor(new Color(30, 80, 20));
        panel.setBorder(BorderFactory.createCompoundBorder(
                border, BorderFactory.createEmptyBorder(6, 8, 8, 8)
        ));
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        return panel;
    }

    private JTextField agregarCampo(JPanel panel, String label, String placeholder) {
        JPanel p = new JPanel(new BorderLayout(0, 4));
        p.setOpaque(false);
        p.add(new JLabel(label), BorderLayout.NORTH);
        JTextField field = new JTextField();
        field.setToolTipText(placeholder);
        p.add(field, BorderLayout.CENTER);
        panel.add(p);
        panel.add(Box.createVerticalStrut(6));
        return field;
    }

    private void estilizarBoton(JButton btn, Color color) {
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.BOLD, 16));
        btn.setPreferredSize(new Dimension(160, 45));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public String getNombre()         { return txtNombre.getText().trim(); }
    public String getCorreo()         { return txtCorreo.getText().trim(); }
    public String getTelefono()       { return txtTelefono.getText().trim(); }
    public String getRucDni()         { return txtRucDni.getText().trim(); }
    public String getDepartamento()   { return txtDepartamento.getText().trim(); }
    public String getDistrito()       { return txtDistrito.getText().trim(); }
    public String getProvincia()      { return txtProvincia.getText().trim(); }
    public String getComoNosConocio() { return (String) cmbComoNosConocio.getSelectedItem(); }
    public String getMensaje()        { return txaMensaje.getText().trim(); }
    public JButton getBtnEnviar()     { return btnEnviar; }
    public JButton getBtnLimpiar()    { return btnLimpiar; }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtRucDni.setText("");
        txtDepartamento.setText("");
        txtDistrito.setText("");
        txtProvincia.setText("");
        cmbComoNosConocio.setSelectedIndex(0);
        txaMensaje.setText("");
    }
}
