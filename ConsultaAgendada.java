public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        this.nomePaciente = "";
        this.nomeMedico = "";
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String paciente, String medico) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = paciente;
        this.nomeMedico = medico;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String paciente, String medico) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = paciente;
        this.nomeMedico = medico;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data.setDia(d);
        this.data.setMes(m);
        this.data.setAno(a);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHora(int h, int mi, int s) {
        this.hora.setHora(h);
        this.hora.setMinuto(mi);
        this.hora.setSegundo(s);
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setNomePaciente(String paciente) {
        this.nomePaciente = paciente;
    }

    public void setNomePaciente() {
        this.nomePaciente = "";
    }

    public void setNomeMedico(String medico) {
        this.nomeMedico = medico;
    }

    public void setNomeMedico() {
        this.nomeMedico = "";
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data.getData();
    }

    public String getHora() {
        return hora.formatHora();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}
