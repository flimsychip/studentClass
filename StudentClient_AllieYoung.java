package asmt04;
import java.util.Scanner;

/**
 * Please implement class StudentClient by adding code to it.
 * Please DO NOT change the provided code. ONLY add more code.
 * 
 * Class:       StudentClient
 * File Name:   StudentClient.java
 *
 * @author Duc Ta
 */

public class StudentClient_AllieYoung {
    static Scanner input = new Scanner(System.in);
    static Student[] students = {new Student(), new Student(), new Student()};


    public static void main(String[] args) {
        getInputs();
        System.out.println("[+] The 3 students created:");
        displayInfo();
        offerUpdate();
        System.out.println("[+] The 3 students updated:");
        displayInfo();
    }

    static void getInputs() {
        System.out.println("[+] Creating 3 students...");
        for(int i = 0; i < 3; i++) {
            System.out.printf("- Enter a name for student #%d: ", i+1);
            students[i].setName(input.nextLine());
            System.out.printf("- Enter a GPA for student #%d: ", i+1);
            students[i].setGpa(input.nextDouble());
            System.out.println();
            input.nextLine();
        }
    }

    static void displayInfo() {
        System.out.println(students[0] + "\n" + students[1] + "\n" + students[2] + "\n");
    }

    static void offerUpdate() {
        System.out.print("[-] Enter a student's full name to update the student: ");
        String name = input.nextLine();
        int indexStuToUpdate = 0;
        //goes through array of students and checks if name entered matches any of their names. if there is a match, sets index of student to update to that index
        for(int i = 0; i < 3; i++) {
            if(name.equalsIgnoreCase(students[i].getName())) {
                indexStuToUpdate = i;
            }
        }
        System.out.print("[-] Enter new student name: ");
        students[indexStuToUpdate].setName(input.nextLine());
        System.out.print("[-] Enter new student GPA: ");
        students[indexStuToUpdate].setGpa(input.nextDouble());
        System.out.println();
    }
}
