package DSA_Assignments;

import java.util.Scanner;

public class Calculate_MarksTotalAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String students[] = {"stud1","stud2","stud3"};
        String subjects[] = {"sub1","sub2","sub3"};

        int marks[][] = new int[3][3];
        //enter marks for each student in each subject
        for(int i=0;i< students.length;i++){
            System.out.println("Enter each persons marks"+students[i]+"in all the subjects");
            for (int j=0;j< subjects.length;i++){
                marks[i][j] = sc.nextInt();
            }
        }

        int[] totalSubjects = new int[3];
        double averageSubjects[] = new double[3];
        for (int i=0;i<subjects.length;i++){
            for (int j=0;j< students.length;j++){
                totalSubjects[i]+=marks[i][j];
            }
            averageSubjects[i]+= totalSubjects[i]/ students.length;
        }

        int[] totalStudents = new int[3];
        double averageStudents[] = new double[3];
        for(int i=0;i< students.length;i++){
            for(int j=0;j< subjects.length;j++){
                totalStudents[i]+=marks[i][j];
            }
            averageStudents[i]+=totalStudents[i]/ averageStudents.length;
        }

        System.out.println("Total and average marks in each subject");
        for (int i=0;i< subjects.length;i++){
            System.out.println("student "+ students[i]+"totalSubjects"+totalSubjects[i]+"average marks"+averageSubjects[i]);
        }

        for(int i=0;i< subjects.length;i++){
            System.out.println("student "+ students[i]+"totalMarks"+totalStudents[i]+"average Students"+averageStudents[i]);
        }


    }

}
