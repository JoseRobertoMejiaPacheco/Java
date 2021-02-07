
import TiposDeDatosIntroduccion.TiposDeDatos;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jrmpacheco
 */
public class Main {

    /*
     * Funcion main permite ejecutar el programa como punto de inicio
     */
    public static void main(String args[]) {
        TiposDeDatos InstanciaTiposDeDatos = new TiposDeDatos();
        System.out.println(InstanciaTiposDeDatos.HolaMundo());
        System.out.println(InstanciaTiposDeDatos.CaracteresEspeciales());
        Scanner EntradaPorConsola = new Scanner(System.in);
        System.out.println("Escribe algo :  ");
        InstanciaTiposDeDatos.ImprimirEntradaDeTeclado(EntradaPorConsola.nextLine());
        InstanciaTiposDeDatos.TiposPrimitivos();

    }

}
