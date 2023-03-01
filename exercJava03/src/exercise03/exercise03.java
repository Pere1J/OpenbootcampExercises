package exercise03;

public class exercise03 {
    public static void main(String[] args) {
        //En este ejercicio tenéis que crear un bucle que permita concatenar textos
        // e imprima el resultado final por consola.
        //Tened en cuenta que los textos pueden venir de un array de tipo String.

        String[] names= {"John", "Paul", "Ringo", "George"};
        String group = "";

        for (int i = 0; i < names.length; i++) {
            group = group + " " + names[i];

        }
        System.out.println("The Beatles are" + group);
    }
}
