/*
 * File: MainController.java
 * Author: Hajdara Patrik
 * Copyright: &copy; 2023 | Hajdara Patrik
 * Group: SZOFT II/2/N
 * Date: 2023-10-05
 * Github: https://github.com/06776/
 */

package controllers;

import java.util.ArrayList;
import models.Employee;
import models.Filereader;
import views.MainConsole;

public class MainController {

  public MainController() {
    Filereader beolvasas = new Filereader();
    ArrayList<Employee> dolgozok = beolvasas.loadData();
    MainConsole.showData(dolgozok);
  }
}
