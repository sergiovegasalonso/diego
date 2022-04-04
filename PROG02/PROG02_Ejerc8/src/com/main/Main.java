package com.main;

public class Main {
    public static void main(String[] args) {
        int codingStudents = Utils.readIntegerFromStdin("Introduzca el número de estudiantes de programación:");
        int environmentsStudents = Utils.readIntegerFromStdin("Introduzca el número de estudiantes de entornos de desarrollo:");
        int databaseStudents = Utils.readIntegerFromStdin("Introduzca el número de estudiantes de bases de datos:");

        int totalStudents = codingStudents + environmentsStudents + databaseStudents;

        float codingStudentPercentage = codingStudents * 100 / totalStudents;
        float environmentsStudentsPercentage = environmentsStudents * 100 / totalStudents;
        float databaseStudentsPercentage = databaseStudents * 100 / totalStudents;

        System.out.printf("Número total de alumnos: %d\n", totalStudents);
        System.out.printf("Estudiantes de programación: %.1f%%\n", codingStudentPercentage);
        System.out.printf("Estudiantes de entornos de desarrollo %.1f%%\n", environmentsStudentsPercentage);
        System.out.printf("Estudiantes de bases de datos %.1f%%\n", databaseStudentsPercentage);
    }
}
