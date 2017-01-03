import java.util.Date;

/**
 * Created by jruiz on 2 ene 2017.
 */
public class clsPersona {
    private String id;
    private String nombre;
    private String ap1;
    private String ap2;
    private Date fecNac;
    private char sexo;
    private char estCivil;

    public clsPersona() {
    }

    public clsPersona(String id, String nombre, String ap1, String ap2, Date fecNac, char sexo, char estCivil) {
        this.id = id;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.fecNac = fecNac;
        this.sexo = sexo;
        this.estCivil = estCivil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(char estCivil) {
        this.estCivil = estCivil;
    }
}
