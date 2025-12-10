public class MainAgenda {
    public static void main(String[] args) {

        ContactAgenda agenda = new ContactAgenda();

        // ---------------------------
        //       AGREGAR CONTACTOS
        // ---------------------------

        Contact c1 = new Contact("101", "David", "3100000000", "david@mail.com", "Bogotá");
        Contact c2 = new Contact("102", "Alejandra", "3111111111", "aleja@mail.com", "Medellín");
        Contact c3 = new Contact("103", "Carlos", "3122222222", "carlos@mail.com", "Bogotá");

        agenda.addContact(c1);
        agenda.addContact(c2);
        agenda.addContact(c3);

        System.out.println("\nTotal contactos: " + agenda.size());


        // ---------------------------
        //       BÚSQUEDAS
        // ---------------------------

        System.out.println("\n--- Buscar por ID (102) ---");
        Contact buscado = agenda.getContact("102");
        if (buscado != null) buscado.showInfo();

        System.out.println("\n--- Buscar por nombre (David) ---");
        agenda.searchByName("David");

        System.out.println("\n--- Buscar por ciudad (Bogotá) ---");
        agenda.searchByCity("Bogotá");


        // ---------------------------
        //       ACTUALIZAR
        // ---------------------------

        System.out.println("\n--- Actualizar contacto 103 ---");
        Contact actualizado = new Contact("103", "Carlos Rodríguez", "3122222222", "crodriguez@mail.com", "Bogotá");
        agenda.updateContact("103", actualizado);

        System.out.println("\n--- Datos actualizados ---");
        agenda.getContact("103").showInfo();


        // ---------------------------
        //       ELIMINAR
        // ---------------------------

        System.out.println("\n--- Eliminar contacto 101 ---");
        agenda.deleteContact("101");

        System.out.println("\nTotal contactos ahora: " + agenda.size());


        // ---------------------------
        //       FORMAS DE ITERAR
        // ---------------------------

        System.out.println("\n--- Mostrar solo claves ---");
        agenda.showKeys();

        System.out.println("\n--- Mostrar solo valores ---");
        agenda.showValues();

        System.out.println("\n--- Mostrar entradas (ID -> Contacto) ---");
        agenda.showEntries();

        // ---------------------------
        //   CONTACTOS ORDENADOS
        // ---------------------------

        System.out.println("\n--- Contactos ordenados por nombre ---");
        agenda.showContactsSortedByName();
    }
}
