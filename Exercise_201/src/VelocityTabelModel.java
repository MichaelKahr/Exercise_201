
import javax.swing.table.AbstractTableModel;

public class VelocityTabelModel extends AbstractTableModel {

    private static String[] colNames = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertreten"};

    @Override
    public String getColumnName(int i) {
        return colNames[i];

    }

    @Override
    public int getRowCount() {
    }

    @Override
    public int getColumnCount() {
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    }

}
