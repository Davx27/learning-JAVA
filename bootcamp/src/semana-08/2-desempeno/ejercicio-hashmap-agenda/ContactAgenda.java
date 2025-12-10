import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {

    private HashMap<String, Contact> contacts;

    public ContactAgenda() {
        this.contacts = new HashMap<>();
    }

    // ------------------------------
    //         CRUD PRINCIPAL
    // ------------------------------

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getId())) {
            System.out.println("❌ Ya existe un contacto con ese ID.");
            return;
        }
        contacts.put(contact.getId(), contact);
        System.out.println("✔️ Contacto agregado correctamente.");
    }

    public Contact getContact(String id) {
        if (!contacts.containsKey(id)) {
            System.out.println("❌ Contacto no encontrado.");
            return null;
        }
        return contacts.get(id);
    }

    public void updateContact(String id, Contact newData) {
        if (!contacts.containsKey(id)) {
            System.out.println("❌ No se puede actualizar, no existe.");
            return;
        }
        contacts.put(id, newData);
        System.out.println("✔️ Contacto actualizado.");
    }

    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            System.out.println("❌ No existe el contacto.");
            return;
        }
        contacts.remove(id);
        System.out.println("✔️ Contacto eliminado.");
    }

    // ------------------------------
    //     MÉTODOS DE BÚSQUEDA
    // ------------------------------

    public void searchByName(String name) {
        boolean found = false;
        for (Contact c : contacts.values()) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.showInfo();
                found = true;
            }
        }
        if (!found)
            System.out.println("❌ Ningún contacto encontrado con ese nombre.");
    }

    public void searchByCity(String city) {
        boolean found = false;
        for (Contact c : contacts.values()) {
            if (c.getCity().equalsIgnoreCase(city)) {
                c.showInfo();
                found = true;
            }
        }
        if (!found)
            System.out.println("❌ No se encontraron contactos en esa ciudad.");
    }

    public void searchByEmail(String email) {
        boolean found = false;
        for (Contact c : contacts.values()) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                c.showInfo();
                found = true;
            }
        }
        if (!found)
            System.out.println("❌ Ningún contacto tiene ese correo.");
    }

    // ------------------------------
    //        ITERACIÓN
    // ------------------------------

    public void showKeys() {
        System.out.println("🔑 Claves (ID de contactos):");
        for (String key : contacts.keySet()) {
            System.out.println(key);
        }
    }

    public void showValues() {
        System.out.println("📇 Contactos:");
        for (Contact c : contacts.values()) {
            System.out.println(c);
        }
    }

    public void showEntries() {
        System.out.println("📌 Lista completa (ID -> Contacto):");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // ------------------------------
    //     CONTACTOS ORDENADOS
    // ------------------------------

    public void showContactsSortedByName() {
        System.out.println("📑 Contactos ordenados por nombre:");

        contacts.values().stream()
                .sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
                .forEach(c -> {
                    System.out.println(c.getName() + " (" + c.getPhone() + ")");
                });
    }

    // ------------------------------
    //   TAMAÑO GENERAL DE CONTACTOS
    // ------------------------------

    public int size() {
        return contacts.size();
    }
}
