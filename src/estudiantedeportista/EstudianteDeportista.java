package estudiantedeportista;

import ico.fes.AlumnoDeportistaYArtista;

public class EstudianteDeportista {

    public static void main(String[] args) {
       AlumnoDeportistaYArtista a1 = new AlumnoDeportistaYArtista("Jordi",20, "Jordi","Cortés","Guillén",20,"Masculino");
      
       a1.Inombre();
       a1.IapPaterno();
       a1.IapMaterno();
       a1.Iedad();
       a1.Isexo();
       a1.ensayar();
       a1.presentar();
       a1.entrenar();
       a1.jugar();
       System.out.println(a1);
       
    }
    
}
