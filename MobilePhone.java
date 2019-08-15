/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilephone;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class MobilePhone implements Serializable {
    private int iterator =0;// do sterowania w swingu
    private List<Contacts> mates = new ArrayList<>();
    public void addToList(String name,int number){
    //if(!mates.contains(new Contacts(name,number) ))
    mates.add(new Contacts(name,number));
    }
    public int retrSize(){
    return mates.size();
    }
    public void shiftIterator(boolean logic){
    if(logic){
    if(     iterator<mates.size()-1) ++iterator;   //++true 
    }else
    if( iterator>0) --iterator;//-- false
    }
    public String extract(){
    return mates.get(getIterator()).toString();
    }
    public void removeFromList(){
    mates.remove(getIterator());
    if(iterator>0) --iterator;
    }
    public void changetElemet(int iter, String newname, int newnumber){
      mates.get(iter).Exchange(newname, newnumber);
    }
    
    /**
     * @return the iterator
     */
    public String getStringIterator() {
        return Integer.toString(iterator);
    }
    public int getIterator(){
     return iterator;  
    }
    public String notToString(){//wypis
    return mates.get(iterator).getName()+" "+mates.get(iterator).getNumber();
    }
    
    


    
}
