package modelos;

import view.Linha;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class ModeloTabela implements TableModel {

    public ModeloTabela(List<Linha> linhas) {
    }

    @Override public int getRowCount () {

        return 0;
    }

    @Override public int getColumnCount () {

        return 0;
    }

    @Override public String getColumnName (int columnIndex) {

        return "";
    }

    @Override public Class<?> getColumnClass (int columnIndex) {

        return Funcionario.class;
    }

    @Override public boolean isCellEditable (int rowIndex, int columnIndex) {

        return false;
    }

    @Override public Object getValueAt (int rowIndex, int columnIndex) {

        return null;
    }

    @Override public void setValueAt (Object aValue, int rowIndex, int columnIndex) {

    }

    @Override public void addTableModelListener (TableModelListener l) {

    }

    @Override public void removeTableModelListener (TableModelListener l) {

    }
}