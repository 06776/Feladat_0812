/*
 * File: MainConsole.java
 * Author: Hajdara Patrik
 * Copyright: &copy; 2023 | Hajdara Patrik
 * Group: SZOFT II/2/N
 * Date: 2023-10-05
 * Github: https://github.com/06776/
 */

package views;

import java.util.ArrayList;
import models.Employee;

public class MainConsole {

  public static void showData(ArrayList<Employee> dolgozok) {
    for (Employee employee : dolgozok) {
      System.out.print("Név: " + employee.getNev() + "\n");
      System.out.print("Település: " + employee.getTelepules() + "\n");
      System.out.print("Cím: " + employee.getCim() + "\n");
      System.out.print("Születési dátum: " + employee.getSzuletes() + "\n");
      System.out.print("Fizetés: " + employee.getFizetes() + "\n");
      System.out.println("\n");
    }
    System.out.println("'Created by Hajdara Patrik | 2023'");
  }
}
