package Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManager teacherManager = new TeacherManager();
        int choice;
        do {
            System.out.println("------Menu------");
            System.out.println("1.Add Teacher");
            System.out.println("2.Remove Teacher by Id");
            System.out.println("3.Display Teachers");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    teacherManager.addTeacher(scanner);
                    break;
                case 2:
                    teacherManager.removeTeacherById(scanner);
                    break;
                case 3:
                    teacherManager.displayTeacher();
                    break;
        }
        }
        while (choice !=0);
    }
}
