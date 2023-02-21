class Persona {
    int age;
    String name;
}

public class codiRefactoritzar {

    public static void main(String[] args) {

        Persona e1 = new Persona();
        e1.age = 11;
        e1.name = "Manuel Alfonseca";

        Persona e2 = new Persona();
        e2.age = 25;
        e2.name = "John Carmack";

        printStatus(e1);
        printStatus(e2);
    }

    /**
     * AQUEST MÈTODE DETECTA SI EL OBJECTE PERSONA ES MAJOR DE 18 ANYS, O MENOR
     * @param e
     */
    private static void printStatus(Persona e) {
        String legalStatus = e.age >= 18 ? "" : " no";
        String message = e.name + legalStatus + " pot passar";
        System.out.println(message);
    }
}



