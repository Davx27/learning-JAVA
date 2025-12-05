public class MainSemana04 {
    public static void main(String[] args) {

        // Crear empleados de diferentes tipos
        EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto(
                "Carlos Gómez", "Administrador", "Mañana", 1800000, 350000
        );

        EmpleadoTiempoParcial empTP = new EmpleadoTiempoParcial(
                "Laura Martínez", "Vendedora", "Tarde", 0, 80, 18000
        );

        Contratista contratista = new Contratista(
                "Miguel Rojas", "Técnico Mantenimiento", "Flexible", 0, 420000, 4
        );

        // Mostrar información general
        System.out.println("===== INFORMACIÓN GENERAL =====");
        empTC.mostrarInfo();
        empTP.mostrarInfo();
        contratista.mostrarInfo();

        // Mostrar métodos específicos
        System.out.println("===== MÉTODOS ESPECÍFICOS =====");
        empTC.mostrarContrato();
        empTP.mostrarHoras();
        contratista.mostrarContrato();

        // Demostración de polimorfismo
        System.out.println("===== CÁLCULO DE SALARIOS =====");

        Empleado[] empleados = { empTC, empTP, contratista };

        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " gana: $" + emp.calcularSalario());
        }
    }
}
