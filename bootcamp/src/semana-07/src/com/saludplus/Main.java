package com.saludplus;

import com.saludplus.modelo.Medicine;
import com.saludplus.servicio.PharmacyService;
import com.saludplus.excepciones.InvalidMedicineException;
import com.saludplus.excepciones.MedicineNotFoundException;
import com.saludplus.excepciones.StockException;

/**
 * Main de demostración para la Semana 07 - Manejo de paquetes y excepciones.
 * Muestra casos de éxito y manejo de errores con try-catch-finally.
 */
public class Main {
    public static void main(String[] args) {
        PharmacyService service = new PharmacyService();

        // Caso 1: Agregar medicamentos válidos (ÉXITO)
        try {
            Medicine m1 = new Medicine(1, "Dolex", "Lafrancol", 8500.0, 10);
            Medicine m2 = new Medicine(2, "Acetaminofén", "Genfar", 6000.0, 5);
            Medicine m3 = new Medicine(3, "Ibuprofeno", "MK", 12000.0, 0); // stock 0
            service.addMedicine(m1);
            service.addMedicine(m2);
            service.addMedicine(m3);
            System.out.println(" Caso 1: Medicamentos agregados correctamente.");
        } catch (InvalidMedicineException ime) {
            System.out.println(" Caso 1: Error al agregar medicamento: " + ime.getMessage());
        } finally {
            System.out.println("⏹ Caso 1 finalizado.\n");
        }

        // Caso 2: Vender un medicamento con stock suficiente (ÉXITO)
        try {
            service.sellMedicine(1, 2); // vende 2 Dolex
            System.out.println(" Caso 2: Venta exitosa de 2 unidades de id=1.");
            System.out.println("   Stock restante: " + service.getMedicineById(1).getStock());
        } catch (MedicineNotFoundException | StockException e) {
            System.out.println(" Caso 2: Error en la venta: " + e.getMessage());
        } finally {
            System.out.println("️ Caso 2 finalizado.\n");
        }

        // Caso 3: Intentar vender más de lo que hay (ERROR: StockException)
        try {
            service.sellMedicine(2, 10); // tiene solo 5
            System.out.println(" Caso 3: Venta exitosa (esto no debería imprimirse).");
        } catch (StockException se) {
            System.out.println(" Caso 3: Stock insuficiente: " + se.getMessage());
        } catch (MedicineNotFoundException mnfe) {
            System.out.println(" Caso 3: Medicamento no encontrado: " + mnfe.getMessage());
        } finally {
            System.out.println("Caso 3 finalizado.\n");
        }

        // Caso 4: Intentar vender un id inexistente (ERROR: MedicineNotFoundException)
        try {
            service.sellMedicine(99, 1);
            System.out.println(" Caso 4: Venta exitosa (no esperado).");
        } catch (MedicineNotFoundException mnfe) {
            System.out.println(" Caso 4: Medicamento no existe: " + mnfe.getMessage());
        } catch (StockException se) {
            System.out.println(" Caso 4: Stock error: " + se.getMessage());
        } finally {
            System.out.println("️ Caso 4 finalizado.\n");
        }

        // Caso 5: Intentar agregar medicamento inválido (ERROR: InvalidMedicineException)
        try {
            Medicine bad = new Medicine(4, "", "LabX", 0.0, -1);
            service.addMedicine(bad);
            System.out.println(" Caso 5: Medicamento inválido agregado (no debería).");
        } catch (InvalidMedicineException ime) {
            System.out.println(" Caso 5: Validación fallida al agregar medicamento: " + ime.getMessage());
        } finally {
            System.out.println("⏹ Caso 5 finalizado.\n");
        }

        // Caso 6: Mostrar inventario final
        System.out.println(" Inventario final:");
        service.listAll().forEach(m -> System.out.println("   - " + m));
    }
}
