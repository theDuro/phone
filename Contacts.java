/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilephone;

/**
 *
 * @author LENOVO
 */
public class Contacts {
 private String name;
 private int number;
  public Contacts(String name,int number){
  this.name = name== null ? "unidentified" : name;
  this.number=number; 
}
  public void Exchange(String exname,int exnumber){
      number = exnumber;
      name = exname== null ? "unidentified" : exname;    
  }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String toString(){
    return name + number;
    }
}
