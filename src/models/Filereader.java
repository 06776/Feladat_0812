/*
 * File: Filereader.java
 * Author: Hajdara Patrik
 * Copyright: &copy; 2023 | Hajdara Patrik
 * Group: SZOFT II/2/N
 * Date: 2023-10-05
 * Github: https://github.com/06776/
 */

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

  private final String FILENAME = "filbt.txt";
  private ArrayList<Employee> dolgozok = new ArrayList<>();

  public ArrayList<Employee> loadData() {
    try {
      tryLoadData();
    } catch (FileNotFoundException e) {
      System.err.println("Unable to open file: " + FILENAME);
      System.err.println(e.getMessage());
    }

    return dolgozok;
  }

  public ArrayList<Employee> tryLoadData() throws FileNotFoundException {
    File file = new File(FILENAME);
    Scanner sc = new Scanner(file, "UTF-8");

    while (sc.hasNextLine()) {
      String[] splittedLine = sc.nextLine().split(":");
      Employee employee = new Employee();
      employee.setNev(splittedLine[0]);
      employee.setTelepules(splittedLine[1]);
      employee.setCim(splittedLine[2]);
      employee.setSzuletes(splittedLine[3]);
      employee.setFizetes(Integer.parseInt(splittedLine[4]));
      dolgozok.add(employee);
    }
    return dolgozok;
  }
}
