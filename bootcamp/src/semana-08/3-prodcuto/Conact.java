public class Contact {

    private String id;       // Puede ser número de teléfono o identificación
    private String name;
    private String phone;
    private String email;
    private String city;

    public Contact(String id, String name, String phone, String email, String city) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.city = city;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getCity() { return city; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setCity(String city) { this.city = city; }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Teléfono: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Ciudad: " + city);
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
