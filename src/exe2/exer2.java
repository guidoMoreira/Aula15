package exe2;
//Classe principal
public class exer2 {
    public static void main(String[] args) {
        POO materia = new POO();

        try {
            materia.setNota(6);
        }catch (Exception e){
            System.out.println("Erro ao definir nota causado por\n"+e);
        }
        try {
            System.out.println("Nota registrada é: "+materia.getNota());
        }catch (Exception e){
            System.out.println("Erro ao ler nota causada por\n"+e);
        }
    }
}
