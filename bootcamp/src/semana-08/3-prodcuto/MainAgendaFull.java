import exceptions.ContactNotFoundException;
import exceptions.DuplicateContactException;
import exceptions.InvalidDataException;

import java.util.List;

public class MainAgendaFull {

    public static void main(String[] args) {

        FullAgenda agenda = new FullAgenda();

        try {
            // -------------------------------------------------------------
            //                   AGREGAR CONTACTOS
            // -------------------------------------------------------------
            System.out.println("\n=== AGREGANDO CONTACTOS ===");

            agenda.addContact(new Contact("001", "David Mendieta", "3112223344", "david@gmail.com", "Bogotá"));
            agenda.addContact(new Contact("002", "Alejandra Ruiz", "3201112233", "ale@example.com", "Medellín"));
            agenda.addContact(new Contact("003", "Carlos Lopez", "3004445566", "carlos@mail.com", "Bogotá"));
            agenda.addContact(new Contact("004", "María Fernanda", "3129998877", "mfer@gmail.com", "Cali"));

            // -------------------------------------------------------------
            //                   LISTADO GENERAL
            // -------------------------------------------------------------
            System.out.println("\n=== LISTADO DE CONTACTOS ===");
            agenda.showAll();

            // -------------------------------------------------------------
            //                   BUSCAR POR NOMBRE
            // -------------------------------------------------------------
            System.out.println("\n=== BÚSQUEDA POR NOMBRE (contiene 'a') ===");
            List<Contact> res1 = agenda.searchByName("a");
            res1.forEach(Contact::showInfo);

            // -------------------------------------------------------------
            //                   BUSCAR POR CIUDAD
            // -------------------------------------------------------------
            System.out.println("\n=== BÚSQUEDA POR CIUDAD (Bogotá) ===");
            List<Contact> res2 = agenda.searchByCity("Bogotá");
            res2.forEach(Contact::showInfo);

            // -------------------------------------------------------------
            //                BUSCAR NOMBRES QUE EMPIEZAN CON 'C'
            // -------------------------------------------------------------
            System.out.println("\n=== BÚSQUEDA INICIAL 'C' ===");
            List<Contact> res3 = agenda.searchStartsWith('C');
            res3.forEach(Contact::showInfo);

            // -------------------------------------------------------------
            //                   ACTUALIZAR CONTACTO
            // -------------------------------------------------------------
            System.out.println("\n=== ACTUALIZANDO CONTACTO 003 ===");
            agenda.updateContact("003",
                    "Carlos Andrés",
                    "3000000000",
                    "c.andres@mail.com",
                    "Bogotá"
            );

            System.out.println("Después de actualizar:");
            agenda.getContact("003").showInfo();

            // -------------------------------------------------------------
            //                   ELIMINAR CONTACTO
            // -------------------------------------------------------------
            System.out.println("\n=== ELIMINANDO CONTACTO 004 ===");
            agenda.deleteContact("004");

            System.out.println("\n=== LISTA FINAL ===");
            agenda.showAll();

            // -------------------------------------------------------------
            //                   PRUEBA ERROR (ID repetido)
            // -------------------------------------------------------------
            System.out.println("\n=== PROBANDO ERROR DE DUPLICADO ===");
            agenda.addContact(new Contact("001", "Otro", "300", "x@x.com", "Pasto"));

        } catch (DuplicateContactException e) {
            System.out.println("❌ Error: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.out.println("❌ Datos inválidos: " + e.getMessage());
        } catch (ContactNotFoundException e) {
            System.out.println("❌ No encontrado: " + e.getMessage());
        }

    }
}
