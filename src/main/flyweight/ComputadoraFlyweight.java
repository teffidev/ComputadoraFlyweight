package main.flyweight;
import main.model.Computadora;
import java.util.HashMap;
import java.util.Map;

public class ComputadoraFlyweight {
    //Lo que vamos a hacer es preguntarnos si ese objeto ya existe
    //La clave aca es hacer una validación...
    //Y tendrá un método de obtener computadora(el que recibe y algo y
    // devuelve una computadora.

    //Map - Match (Transformar una cosa con la otra)
    //Crear un pequeño repositorio para validar si la computadora ya existe.
    //Podemos pensarlo como una colección
    // Contenedor donde puedo poner muchos objetos...
    // Lo puedo usar poniendo la palabra clave
    private static Map<String, Computadora> computadoraMap = new HashMap<>();

    public Computadora obtenerOCrearComputadora(int ram, int disco){

        String clave = "key: " + ram + ":" + disco;

        //Si la computadora ya existe...
        //Al poner el signo de admiración antes, la estoy negando...
        //Si no contiene la clave... entonces instancia mos:
        if(!computadoraMap.containsKey(clave)){
            //instance - La creo
            Computadora computadora = new Computadora(ram, disco);
            //La guardo
            computadoraMap.put(clave, computadora);
            System.out.println("Computadora Creada");

            //Devuelvo algo (las dos condiciones deben devolver algo)
            return computadoraMap.get(clave);

        } else {
            //retornar la misma computadora ¡que ya existe!
            System.out.println("Computadora obtenida");
            return computadoraMap.get(clave);
        }
    }
}
