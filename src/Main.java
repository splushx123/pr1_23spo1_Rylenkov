//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Lab1_var15_23spo1_Rylenkov {
    public static void main(String[] args) {
        double fC = 8.0;
        double d = 250.0;
        double fP = 52.50;
        double tF = (fC / 100) * d;
        double tC = tF * fP;

        System.out.println("=== Задание 1: Расчет стоимости поездки ===");
        System.out.printf("Расход топлива: %.1f л/100 км%n", fC);
        System.out.printf("Расстояние: %.1f км%n", d);
        System.out.printf("Стоимость бензина: %.2f руб./л%n", fP);
        System.out.printf("Общий расход топлива: %.2f л%n", tF);
        System.out.printf("Общая стоимость поездки: %.2f руб.%n%n", tC);
        String pC = "123456";

        System.out.println("=== Задание 2: Почтовый индекс ===");
        System.out.println("Мой почтовый индекс: " + pC);
        System.out.println();
        boolean eR = (true && false) || (true && !false);

        System.out.println("=== Задание 3: Логическое выражение ===");
        System.out.println("Выражение: (true && false) || (true && !false)");
        System.out.println("Результат: " + eR);
        System.out.println("\nПошаговое вычисление:");
        System.out.println("1. true && false = " + (true && false));
        System.out.println("2. !false = " + (!false));
        System.out.println("3. true && !false = " + (true && !false));
        System.out.println("4. (false) || (true) = " + (false || true));
    }
}