/*
 * File: Employee.java
 * Author: Hajdara Patrik
 * Copyright: &copy; 2023 | Hajdara Patrik
 * Group: SZOFT II/2/N
 * Date: 2023-10-05
 * Github: https://github.com/06776/
 */

package models;

public class Employee {

  private String nev;
  private String telepules;
  private String cim;
  private String szuletes;
  private int fizetes;

  public Employee() {}

  public String getNev() {
    return nev;
  }

  public void setNev(String nev) {
    this.nev = nev;
  }

  public String getTelepules() {
    return telepules;
  }

  public void setTelepules(String telepules) {
    this.telepules = telepules;
  }

  public String getCim() {
    return cim;
  }

  public void setCim(String cim) {
    this.cim = cim;
  }

  public String getSzuletes() {
    return szuletes;
  }

  public void setSzuletes(String szuletes) {
    this.szuletes = szuletes;
  }

  public int getFizetes() {
    return fizetes;
  }

  public void setFizetes(int fizetes) {
    this.fizetes = fizetes;
  }
}
