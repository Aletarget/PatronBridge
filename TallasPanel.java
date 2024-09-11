import javax.swing.*;
import java.awt.*;

public class TallasPanel extends JPanel {
    private JPanel tallas;
    private JPanel options;
    private JPanel extras;
    private JButton btnConfirm;
    private JLabel titulo;

    public TallasPanel() {
        setLayout(new BorderLayout());

        // Inicializar componentes
        tallas = new JPanel();
        options = new JPanel();
        extras = new JPanel();
        btnConfirm = new JButton("Confirm");
        titulo = new JLabel("Tallas");

        // Aquí puedes agregar componentes a cada panel
        tallas.add(new JLabel("Talla S"));
        tallas.add(new JLabel("Talla M"));
        options.add(new JLabel("Opción 1"));
        options.add(new JLabel("Opción 2"));
        extras.add(new JLabel("Extra 1"));
        extras.add(new JLabel("Extra 2"));

        // Crear un panel para apilar los otros paneles
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));  // Apilado vertical

        // Añadir los paneles al panel central
        centerPanel.add(tallas);
        centerPanel.add(options);
        centerPanel.add(extras);

        // Añadir componentes al layout principal
        add(titulo, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);  // Agregar el panel que contiene tallas, options y extras
        add(btnConfirm, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TallasPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

