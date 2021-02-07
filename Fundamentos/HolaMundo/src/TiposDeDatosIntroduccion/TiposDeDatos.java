/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDeDatosIntroduccion;

/**
 *
 * @author jrmpacheco
 */
public class TiposDeDatos {

    public String HolaMundo() {
        return "Hola Mundo";
    }

    public String CaracteresEspeciales() {
        //Inferencia de datos: con var detecta el tipo de dato asignado
        var nuevaLinea = "\n";
        var tabulador = "\t";
        var retroceso = "\b";
        var comillaSimple = "\'";
        var comillaDoble = "\"";
        String oracion = "El salto de linea"
                + nuevaLinea + tabulador + "Tabuladorrrr" //retroceso borra un cararcter a la izquerda(3)
                + retroceso + retroceso + retroceso + " "
                + comillaSimple + "Hola Mundo" + comillaSimple + " "
                + comillaDoble + "Hola Mundo" + comillaDoble;
        return oracion;
    }

    public void ImprimirEntradaDeTeclado(String sacanner) {
        System.out.println(sacanner);
    }

    public void TiposPrimitivos() {
        //Tipos  
        byte MaxByte = Byte.MAX_VALUE;
        byte MinByte = Byte.MIN_VALUE;

        short MaxShort = Short.MAX_VALUE;
        short MinShort = Short.MIN_VALUE;

        char MaxChar = Character.MAX_VALUE;
        char MinChar = Character.MIN_VALUE;

        int MaxInt = Integer.MAX_VALUE;
        int MinInt = Integer.MIN_VALUE;

        //Tipos Flotante
        long MaxLong = Long.MAX_VALUE;//Se tiene que agregar una L al final para evitar el error de literal superada
        long MinLong = Long.MIN_VALUE;

        float MaxFloat = Float.MAX_VALUE;
        float MinFloat = Float.MIN_VALUE;

        double MaxDouble = Double.MAX_VALUE;
        double MinDouble = Double.MIN_VALUE;

        //Valores Logicos
        boolean MaxBoolean = Boolean.TRUE;
        boolean MinBoolean = Boolean.FALSE;
        System.out.println("----Rango de valores Primitivos----\n");
        System.out.println("\tMínimo\tMáximo\n");
        System.out.println("Byte" + "\t" + MaxByte + "\t" + MinByte);
        System.out.println("Short" + "\t" + MaxShort + "\t" + MinShort);
        System.out.println("Char" + "\t" + MaxChar + "\t" + MinChar);
        System.out.println("Integer" + "\t" + MaxInt + "\t" + MinInt);
        System.out.println("Long" + "\t" + MaxLong + "\t" + MinLong);
        System.out.println("Float" + "\t" + MaxFloat + "\t" + MinFloat);
        System.out.println("Boolean" + "\t" + MaxBoolean + "\t" + MinBoolean);

    }
}
