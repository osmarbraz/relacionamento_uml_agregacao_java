
public class Principal {

    public static void main(String args[]) {
        ClasseA a1 = new ClasseA(new ClasseB()); //Construtor com argumento criou a Parte
        ClasseA a2 = new ClasseA(a1.getAClasseB()); //Construtor com argumento recebeu a 						
        // Parte de outro Todo
    }
}
