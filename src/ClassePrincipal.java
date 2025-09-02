public class ClassePrincipal {
    public static void main(String[] args) {
        // Testando as classes
        ClasseAutomotores automotor1 = new ClasseAutomotores("Azul", "Toyota", "Corolla", "Carro");
        System.out.println("Veículo: " + automotor1.getMarcaAt() + " " + automotor1.getModeloAt());
    }
}
