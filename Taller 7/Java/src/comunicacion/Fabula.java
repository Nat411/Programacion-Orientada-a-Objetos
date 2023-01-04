package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }
    @Override
    public int palabrasTotales(int pags){
        return this.getPaginas()*pags*1;

    }
    @Override
    public String interpretacion(){
        return this.getInterpretacion();

    }
    @Override
    public String toString(){
        return getOrigen()+"\n"+  getTitulo()+"\n"+  getAutor()+"\n"+ getPaginas()+"\n"+ getEnsenanza();
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
