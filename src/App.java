public class App {
    public static void main(String[] args) throws Exception {

        Holydayzer holiday = new Holydayzer();

        System.out.println("O melhor feriado: ");
        holiday.getHoliday("21/04/2023");

        System.out.println("Todos os feriados: ");
        holiday.getAll();
    }
}
