
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class FamilyMember {
    private String name, lastName, status;
    private int age;

    public FamilyMember(String name, String lastName, String status, int age) {
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.age = age;
    }

    public void write_to_file() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("family.txt", true));
            String string_to_writer = String.format("%s, %s, %s, %d", this.name, this.lastName, this.status, this.age);
            writer.write(string_to_writer + "\n");
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void demand_money(int demanded_money) {
        int amount;
        if ((amount = FamilyBudget.get_value()) > demanded_money) {
            System.out.println(amount + "$ was taken out of the family budget");
            FamilyBudget.alter_value(amount, false);
        }
        else System.out.println("Not enough amount of money in the family budget!");
    }

}
