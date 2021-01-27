package org.spinoso.design.pattern.creational.abstractfactory;

public class HDFCBank implements Bank {

    private final String BNAME;  
    public HDFCBank(){  
           BNAME="HDFC BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   } 

}
