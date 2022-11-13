import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class FamilyBudget {
    private static int money;

    public static void set_value(int value) {
        money = value;
    }

    public static int get_value() {
        return money;
    }

    public static void alter_value(int value, boolean donate) {
        money = donate == true ? money + value : money - value;
        String cond = family_condition();
        write_to_file(cond);
    }

    public static String family_condition() {
        if (money > 40000) return "Rich";
        if (money > 10000) return "Normal";
        return "Poor";
    }

    public static void write_to_file(String cond) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("budget.txt", true));
            writer.write(cond + "\n");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}