import java.util.Date;

/**
 * Created by jruiz on 2 ene 2017.
 */
public class clsProfesor extends clsPersona {
    private int anhoIng;
    private char nivel;
    private String especialidad;

    public clsProfesor() {
    }

    public clsProfesor(String id, String nombre, String ap1, String ap2, Date fecNac, char sexo, char estCivil) {
        super(id, nombre, ap1, ap2, fecNac, sexo, estCivil);
    }

    public clsProfesor(String id, String nombre, String ap1, String ap2, Date fecNac, char sexo, char estCivil, short anhoIng, char nivel, String especialidad) {
        super(id, nombre, ap1, ap2, fecNac, sexo, estCivil);
        this.anhoIng = anhoIng;
        this.nivel = nivel;
        this.especialidad = especialidad;
    }

    public int getAnhoIng() {
        return anhoIng;
    }

    public void setAnhoIng(int anhoIng) {
        this.anhoIng = anhoIng;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
