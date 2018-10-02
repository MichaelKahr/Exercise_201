
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class VelocityTableRenderer implements TableCellRenderer {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Velocity v = (Velocity) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        //label.setBackground(s.getHairColor());
        switch (column) {
            case 0:
                label.setText(v.getDate().format(dtf));break;
            case 1:
                label.setText(v.getTime().format(dtf2));break;
            case 2:
                label.setText(v.getSign());break;
            case 3:
                label.setText(v.getGemessen()+"");break;
            case 4:
                label.setText(v.getErlaubt()+"");break;
            case 5:
                label.setText("");
        }

        return label;
    }

}
