import javax.swing.*;

public class Ägare { // en klass där jag sparar metoderna som ska köras i main.

    public void vattna(Vaxt[] vaxter) {

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (input == null) {
                break; //
            }

            Vaxt vald = null;
            for (Vaxt v : vaxter) {
                if (v.getNamn().equalsIgnoreCase(input)) {

                    vald = v;
                    break;
                }
            }
            if (vald != null) {
                String meddelande = String.format("%s ska ha %s liter %s",
                        vald.getNamn(), vald.getVatskebehov(), vald.getVatsketyp());
                JOptionPane.showMessageDialog(null, meddelande);
            } else {
                JOptionPane.showMessageDialog(null, "Växten hittades inte.");
            }

        }
    }
}
