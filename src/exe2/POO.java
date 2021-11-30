package exe2;

public class POO extends EngenhariadaComputação implements IPOO{
    public float getNota(){
        return this.nota;
    }
    @Override
    public void setNota(float nota) {
        this.nota = nota;
    }
}
