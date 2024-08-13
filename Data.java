public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2024;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getData() {
        return String.format("%02d/%02d/%02d", dia, mes, ano % 100);
    }
}
