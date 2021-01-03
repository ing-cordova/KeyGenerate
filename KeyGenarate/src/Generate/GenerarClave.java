package Generate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Código Generado por Andrés Eduardo Córdova Orellana | 2021
 */
public class GenerarClave {

    public String KeyGenerate(String FirstName, String SecondName, String FirstSurName, String SecondSurName, int Age) {

        //Variable que nos retornará la clave.
        String KeyGenerated = "";
        //Variables para obtener Fecha, Nombre Completo y 2 números aleatorios.
        String Fecha, FullName;
        int Aleatorio;
        //Obtenemos la primera letra de los apellidos.
        char IndexFirstSurName, IndexSecondSurName;
        //Damos el formato de fecha que qerramos.
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        Date date = new Date();
        Fecha = formato.format(date);
        //Obtenemos las primeras letras de los apellidos.
        IndexFirstSurName = FirstSurName.toLowerCase().charAt(0);
        IndexSecondSurName = SecondSurName.toLowerCase().charAt(0);
        //Concatenamos el nombre completo.
        FullName = FirstName + SecondName + FirstSurName + SecondSurName;
        //Generamos dos números aleatorios.
        Aleatorio = (int) (Math.random() * FullName.length() + 10);

        //CLAVE QUE SE NOS GENERÓ CON LOS DATOS INGRESADOS.
        KeyGenerated = String.valueOf(IndexFirstSurName) + String.valueOf(IndexSecondSurName) + String.valueOf(FullName.length()) + String.valueOf(Age) + String.valueOf(Aleatorio) + String.valueOf(Fecha);

        //Inprimimos en consola los datos
        System.out.println("************************************************");
        System.out.println("NOMBRE COMPLETO: " + FirstSurName + " " + SecondSurName + ", " + FirstName + " " + SecondName + ".");
        System.out.println("EDAD: " + Age + " años.");
        System.out.println("DUE GENERADO: " + KeyGenerated);
        System.out.println("************************************************");

        //Valor Generado.
        return KeyGenerated;
    }
}
