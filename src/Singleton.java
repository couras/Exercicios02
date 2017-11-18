public class Singleton {

    int contador;
    public static Singleton objeto = null;

    public Singleton() {
        contador = 0;
    }
    public void RetornaNumero() {
        System.out.println("Número atualizado: " + Integer.toString(contador++));
    }
    public static Singleton ObtemObjeto() {

    	if(objeto == null) {
    		objeto = new Singleton();
    	}
    	
    	return objeto;
    }
}

