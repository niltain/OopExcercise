package Bai7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManager {
   ArrayList<Teacher> teachers = new ArrayList<>();

    public static Teacher createTeacher(Scanner scanner) {
        System.out.println("Enter Teacher Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Teacher age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Teacher hometown: ");
        String hometown = scanner.nextLine();
        System.out.println("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Teacher salary before taxes: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter Teacher salary bonus: ");
        double bonus = scanner.nextDouble();
        System.out.println("Enter Teacher penalty fee: ");
        double penalty = scanner.nextDouble();
        double finalIncome = salary + bonus - penalty;
        return new Teacher(name, age, hometown, id, salary, bonus, penalty, finalIncome);

    }


    public void addTeacher(Scanner scanner) {
        Teacher teacher = createTeacher(scanner);
        teachers.add(teacher);
        writeDocuments(teachers);
    }

    public void removeTeacherById(Scanner scanner) {
        System.out.println("Enter the teacher Id you wanted to remove: ");
        int id = scanner.nextInt();
        int check = 0;
        scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                teachers.remove(i);
                i--;
                check++;
            }
        }
        if (check == 0) {
            System.out.println("No matches ID");
        }
    }

    public void displayTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    public void writeDocuments(ArrayList<Teacher>teachers){
        File file = new File ("TeacherInformation.txt");
        try {
            if (file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(teachers);
            objectOutputStream.close();
    } catch (Exception e) {
            System.out.println("File has already exist!");
        }
    }

    public void readDocuments (){
        File file = new File("TeacherInformation.txt");
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            teachers = (ArrayList<Teacher>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            System.out.println("Error!!!");
        }
    }
}
