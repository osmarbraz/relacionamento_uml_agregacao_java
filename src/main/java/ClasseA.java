
public class ClasseA {

    private ClasseB aClasseB; //Nome link

    //A Parte e recebida como parametro para se juntar ao
    //Todo 
    //A Parte pode estar sendo utilizada por outro Todo
    public ClasseA(ClasseB b) {
        aClasseB = b;
    }
    //Permite recuperar a Parte para compartilhar com outro
    //Todo

    public ClasseB getAClasseB() {
        return aClasseB;
    }
}
