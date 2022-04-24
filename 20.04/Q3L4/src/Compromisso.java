import java.util.Calendar;
import java.util.Date;

public class Compromisso {
    private String titulo;
    private String descricao;
    private Calendar data;
    private String local;

    public Compromisso(String tit, String desc, String local) {
        this.titulo = tit;
        this.descricao = desc;
        this.data = Calendar.getInstance();
        this.local = local;
    }

    public String getTitulo() {
        return this.titulo;
    }


    public String getDescricao() {
        return this.descricao;
    }

    public String getLocal() {
        return this.local;
    }

    public Calendar getData() {
        return this.data;
    }
}
