import java.util.Scanner;
import java.util.regex.Pattern;

public class TesteConsultaAgendada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 45, 15, 8, 2024, "Vinícius Pontes", "Dr. Tuller");

        System.out.println("Propriedades de p1:");
        exibirPropriedades(p1);
        System.out.println();

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("Digite os dados para a consulta agendada p2:");
        System.out.println();
        int dia = obterDia(scanner);
        int mes = obterMes(scanner);
        int ano = obterAno(scanner);
        int horas = obterHoras(scanner);
        int minutos = obterMinutos(scanner);
        scanner.nextLine();
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = obterNome(scanner);
        System.out.print("Digite o nome do médico: ");
        String nomeMedico = obterNome(scanner);

        p2.setData(dia, mes, ano);
        p2.setHora(horas, minutos, 0);
        p2.setNomePaciente(nomePaciente);
        p2.setNomeMedico(nomeMedico);
        System.out.println();
        System.out.println("Propriedades de p2:");
        exibirPropriedades(p2);
        System.out.println();

        System.out.println("Digite os novos dados para substituir p1:");
        System.out.println();
        dia = obterDia(scanner);
        mes = obterMes(scanner);
        ano = obterAno(scanner);
        horas = obterHoras(scanner);
        minutos = obterMinutos(scanner);
        scanner.nextLine();
        System.out.print("Digite o nome do paciente: ");
        nomePaciente = obterNome(scanner);
        System.out.print("Digite o nome do médico: ");
        nomeMedico = obterNome(scanner);

        p1.setData(dia, mes, ano);
        p1.setHora(horas, minutos, 0);
        p1.setNomePaciente(nomePaciente);
        p1.setNomeMedico(nomeMedico);
        System.out.println();
        System.out.println("Propriedades de p1 após substituição:");
        exibirPropriedades(p1);
        System.out.println();

        System.out.println("Quantidade final de consultas: " + ConsultaAgendada.getQuantidade());

        scanner.close();
    }

    private static void exibirPropriedades(ConsultaAgendada consulta) {
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Nome do Paciente: " + consulta.getNomePaciente());
        System.out.println("Nome do Médico: " + consulta.getNomeMedico());
    }

    private static int obterDia(Scanner scanner) {
        int dia;
        do {
            System.out.print("Digite o dia (1 a 31): ");
            dia = scanner.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Dia inválido, tente novamente.");
            }
        } while (dia < 1 || dia > 31);
        return dia;
    }

    private static int obterMes(Scanner scanner) {
        int mes;
        do {
            System.out.print("Digite o mês (1 a 12): ");
            mes = scanner.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Mês inválido, tente novamente.");
            }
        } while (mes < 1 || mes > 12);
        return mes;
    }

    private static int obterAno(Scanner scanner) {
        int ano;
        do {
            System.out.print("Digite o ano (a partir de 2024): ");
            ano = scanner.nextInt();
            if (ano < 2024) {
                System.out.println("Ano inválido, deve ser 2024 ou posterior. Tente novamente.");
            }
        } while (ano < 2024);
        return ano;
    }

    private static int obterHoras(Scanner scanner) {
        int horas;
        do {
            System.out.print("Digite a hora (0 a 23): ");
            horas = scanner.nextInt();
            if (horas < 0 || horas > 23) {
                System.out.println("Hora inválida, tente novamente.");
            }
        } while (horas < 0 || horas > 23);
        return horas;
    }

    private static int obterMinutos(Scanner scanner) {
        int minutos;
        do {
            System.out.print("Digite o minuto (0 a 59): ");
            minutos = scanner.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Minuto inválido, tente novamente.");
            }
        } while (minutos < 0 || minutos > 59);
        return minutos;
    }

    private static String obterNome(Scanner scanner) {
        String nome;
        Pattern pattern = Pattern.compile("[a-zA-Z]+( [a-zA-Z]+)*");
        do {
            nome = scanner.nextLine().trim();
            if (!pattern.matcher(nome).matches()) {
                System.out.println("Nome inválido, deve conter apenas letras e espaços. Tente novamente.");
            }
        } while (!pattern.matcher(nome).matches());
        return nome;
    }
}
