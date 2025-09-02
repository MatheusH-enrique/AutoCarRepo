public class ClassePrincipal {
    public static void main(String[] args) {
        // Criando objetos para testar as subclasses
        ClasseCarros carro = new ClasseCarros("Preto", "Honda", "Civic", "Carro");
        System.out.println("Carro: " + carro.getMarcaAt() + " " + carro.getModeloAt());
        
        ClasseCaminhoes caminhao = new ClasseCaminhoes("Branco", "Volvo", "FH", "Caminhão", 30000);
        System.out.println("Caminhão: " + caminhao.getMarcaAt() + " " + caminhao.getModeloAt() + ", Carga Suportada: " + caminhao.getCargaSuportadaAt() + " kg");
    }
}