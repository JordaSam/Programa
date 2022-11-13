package javaprueba;
/**
 *
 * @author Admin
 */
public class JavaPrueba {

    public static void main(String[] args){
        String cadena = "Esto esta muy cool";

        System.out.println("Este es el resultado: " + cadena.charAt(8));
        
        int contador = 0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)== 'o'){
                contador++;   
        }
    }

    System.out.println("La letra se repite: " + contador + " veces");
}
}