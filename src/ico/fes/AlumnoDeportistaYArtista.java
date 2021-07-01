
package ico.fes;


public class AlumnoDeportistaYArtista extends Persona implements Deportista, Artista{
    private String nom;
    private int e;

    public AlumnoDeportistaYArtista() {
    }

    public AlumnoDeportistaYArtista(String nom, int e, String nombre, String ApPaterno, String ApMaterno, int Edad, String Sexo) {
        super(nombre, ApPaterno, ApMaterno, Edad, Sexo);
        this.nom = nom;
        this.e = e;
    }

    public AlumnoDeportistaYArtista(String nom, int e) {
        this.nom = nom;
        this.e = e;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return super.toString() + "AlumnoDeportistaYArtista{" + "nom=" + nom + ", e=" + e + '}';
    }

    @Override
    public void ensayar() {
        System.out.println(this.nom+" esta ensayando");
    }

    @Override
    public void entrenar() {
        System.out.println(this.nom+" esta entrenando");
    }

    @Override
    public void jugar() {
        System.out.println(this.nom+" esta jugando");
    }

    @Override
    public void presentar() {
       System.out.println(this.nom+" esta presentando");
    }


    
}
