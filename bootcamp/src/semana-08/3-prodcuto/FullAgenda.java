import import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import exceptions.ContactNotFoundException;
import exceptions.DuplicateContactException;
import exceptions.InvalidDataException;

public class FullAgenda {

    // Lista completa de contactos
    private List<Contact> contactList;

    // Mapa rápido para búsquedas por ID
    private HashMap<String, Contact> contactMap;

    public FullAgenda() {
        contactList = new ArrayList<>();
        contactMap = new HashMap<>();
    }

    // ------------------------------------------------------------
    //                      VALIDACIONES
    // ------------------------------------------------------------

    private void validateContact(Contact c) throws InvalidDataException {
        if (c.getId() == null || c.getId().isEmpty())
            throw new InvalidDataException("El ID no puede estar vacío.");

        if (c.getName() == null || c.getName().isEmpty())
            throw new InvalidDataException("El nombre no puede estar vacío.");

        if (c.getPhone() == null || c.getPhone().isEmpty())
            throw new InvalidDataException("El teléfono no puede estar vacío.");
    }

    private void validateDuplicate(String id) throws DuplicateContactException {
        if (contactMap.containsKey(id)) {
            throw new DuplicateContactException("Ya existe un contacto con el ID " + id);
        }
    }

    // ------------------------------------------------------------
    //                      CRUD PRINCIPAL
    // ------------------------------------------------------------

    public void addContact(Contact contact)
            throws InvalidDataException, DuplicateContactException {

        validateContact(contact);
        validateDuplicate(contact.getId());

        contactList.add(contact);
        contactMap.put(contact.getId(), contact);

        System.out.println("✔ Contacto agregado exitosamente.");
    }

    public Contact getContact(String id)
            throws ContactNotFoundException {

        if (!contactMap.containsKey(id)) {
            throw new ContactNotFoundException("No se encontró el contacto con ID " + id);
        }
        return contactMap.get(id);
    }

    public void updateContact(String id, String name, String phone, String email, String city)
            throws ContactNotFoundException {

        Contact c = getContact(id);

        if (name != null && !name.isEmpty()) c.setName(name);
        if (phone != null && !phone.isEmpty()) c.setPhone(phone);
        if (email != null) c.setEmail(email);
        if (city != null) c.setCity(city);

        System.out.println("✔ Contacto actualizado.");
    }

    public void deleteContact(String id)
            throws ContactNotFoundException {

        Contact c = getContact(id);

        contactList.remove(c);
        contactMap.remove(id);

        System.out.println("✔ Contacto eliminado.");
    }

    // ------------------------------------------------------------
    //                      BÚSQUEDAS
    // ------------------------------------------------------------

    public List<Contact> searchByName(String name) {
        List<Contact> results = new ArrayList<>();

        for (Contact c : contactList) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(c);
            }
        }
        return results;
    }

    public List<Contact> searchByCity(String city) {
        List<Contact> results = new ArrayList<>();

        for (Contact c : contactList) {
            if (c.getCity().equalsIgnoreCase(city)) {
                results.add(c);
            }
        }
        return results;
    }

    public List<Contact> searchStartsWith(char letter) {
        List<Contact> results = new ArrayList<>();

        for (Contact c : contactList) {
            if (c.getName().toLowerCase().startsWith(String.valueOf(letter).toLowerCase())) {
                results.add(c);
            }
        }
        return results;
    }

    // ------------------------------------------------------------
    //                 LISTADO GENERAL
    // ------------------------------------------------------------

    public void showAll() {
        if (contactList.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("=== CONTACTOS REGISTRADOS ===");
        for (Contact c : contactList) {
            c.showInfo();
        }
    }

    // ------------------------------------------------------------
    //                 MÉTODOS AUXILIARES
    // ------------------------------------------------------------

    public int totalContacts() {
        return contactList.size();
    }

    public boolean exists(String id) {
        return contactMap.containsKey(id);
    }

}
