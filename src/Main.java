import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) {
        Scanner scanner_obj = new Scanner(System.in);
        boolean choice = true;

        List<FamilyMember> family_members = new ArrayList<FamilyMember>();

        do {
            FamilyMember family_member = create_human(scanner_obj);
            family_members.add(family_member);

            System.out.println("create one more human? (1 = yes / 0 = no)");

            choice = scanner_obj.nextInt() == 1 ? true : false;

            scanner_obj = new Scanner(System.in);

        }
        while (choice == true);

        scanner_obj.close();

        for (FamilyMember member : family_members) {
            member.write_to_file();
        }

    }

    public static FamilyMember create_human(Scanner scanner_obj) {

        String name, lastName, status;
        int age;

        System.out.println("Input name: ");
        name = scanner_obj.nextLine();

        System.out.println("Input lastName: ");
        lastName = scanner_obj.nextLine();

        System.out.println("Input status: ");
        status = scanner_obj.nextLine();

        System.out.println("Input age");
        age = scanner_obj.nextInt();

        return new FamilyMember(name, lastName, status, age);
    }

}
