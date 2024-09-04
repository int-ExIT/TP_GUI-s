package GUI.TP4;

import java.util.Objects;

public class Materia {
    
    private String asignatura;
    private String ID;

    public Materia(String asignatura, String ID) {
        this.asignatura = asignatura;
        this.ID = ID;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Materia:\n" + "Asignatura: " + asignatura + ". ID: " + ID + ".";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.asignatura);
        hash = 89 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return Objects.equals(this.asignatura, other.asignatura);
    }
    
}
