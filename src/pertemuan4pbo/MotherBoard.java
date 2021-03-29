/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4pbo;

/**
 *
 * @author Administrator
 */
public class MotherBoard {
    String model;
   public MotherBoard(String model) {
       this.model = model;
   }
   // static nested class
 static class USB{
 int getTotalPorts(){
      int usb2 = 2;
       int usb3 = 1;
     return usb2 + usb3;
 }
 }

 
   
}
