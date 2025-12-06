package com.saludplus.servicio;

import com.saludplus.modelo.Medicine;
import com.saludplus.excepciones.InvalidMedicineException;
import com.saludplus.excepciones.MedicineNotFoundException;
import com.saludplus.excepciones.StockException;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Servicio simple para manejar medicamentos de la farmacia SaludPlus.
 * Implementa validaciones y lanza excepciones checked apropiadas.
 */
public class PharmacyService {
    private final Map<Integer, Medicine> inventory = new ConcurrentHashMap<>();

    /**
     * Agrega un medicamento al inventario. Valida datos mínimos.
     *
     * @throws InvalidMedicineException si los datos son inválidos
     */
    public void addMedicine(Medicine m) throws InvalidMedicineException {
        if (m == null) {
            throw new InvalidMedicineException("El medicamento no puede ser null.");
        }
        if (m.getName() == null || m.getName().isBlank()) {
            throw new InvalidMedicineException("El nombre del medicamento es obligatorio.");
        }
        if (m.getLaboratory() == null || m.getLaboratory().isBlank()) {
            throw new InvalidMedicineException("El laboratorio es obligatorio.");
        }
        if (m.getPrice() <= 0) {
            throw new InvalidMedicineException("El precio debe ser mayor a 0.");
        }
        if (m.getStock() < 0) {
            throw new InvalidMedicineException("El stock no puede ser negativo.");
        }
        inventory.put(m.getId(), m);
    }

    /**
     * Obtiene un medicamento por id.
     */
    public Medicine getMedicineById(int id) throws MedicineNotFoundException {
        Medicine m = inventory.get(id);
        if (m == null) {
            throw new MedicineNotFoundException("Medicamento con id " + id + " no encontrado.");
        }
        return m;
    }

    /**
     * Vende una cantidad de un medicamento.
     *
     * @throws MedicineNotFoundException si el medicamento no existe
     * @throws StockException            si la cantidad solicitada excede el stock
     */
    public void sellMedicine(int id, int quantity) throws MedicineNotFoundException, StockException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        Medicine m = getMedicineById(id); // puede lanzar MedicineNotFoundException
        synchronized (m) {
            if (m.getStock() < quantity) {
                throw new StockException("Stock insuficiente para '" + m.getName() +
                        "'. Stock actual: " + m.getStock() + ", solicitado: " + quantity);
            }
            m.decreaseStock(quantity);
        }
    }

    public Collection<Medicine> listAll() {
        return inventory.values();
    }
}
