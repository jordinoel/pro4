package ico.fes;

public class Persona {

    private String nombre;
    private String ApPaterno;
    private String ApMaterno;
    private int Edad;
    private String Sexo;

    public Persona() {
    }

    public Persona(String nombre, String ApPaterno, String ApMaterno, int Edad, String Sexo) {
        this.nombre = nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }

    public void Inombre() {
        System.out.println("Su nombre es: " + this.nombre);
    }

    public void IapPaterno() {
        System.out.println("Su apellido paterno es: " + this.ApPaterno);
    }

    public void IapMaterno() {
        System.out.println("Su apellido materno es: " + this.ApMaterno);
    }

    public void Iedad() {
        System.out.println("Edad: " + this.Edad);
    }

    public void Isexo() {
        System.out.println("Sexo: " + this.Sexo);
    }

}
