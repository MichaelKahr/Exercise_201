
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class VelocityTabelModel extends AbstractTableModel {

    private static String[] colNames = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertreten"};
    
    private LinkedList<Velocity> velocities = new LinkedList<>();

    
    public void add(Velocity v){
        velocities.add(v);
        fireTableRowsInserted(velocities.size()-1, velocities.size()-1);
    }
    
    public void delete(int idx){
        velocities.remove(idx);
        fireTableRowsUpdated(0, velocities.size()-1);
    }
    
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public int getRowCount() {
        return velocities.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Velocity v = velocities.get(rowIndex);
        return v;
    }

}
