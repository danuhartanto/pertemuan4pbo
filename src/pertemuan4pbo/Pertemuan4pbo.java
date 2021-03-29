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
public class Pertemuan4pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
               
   System.out.println("matriks D :"); 
        Matrix D = new Matrix(d);
        D.show();        
       System.out.println();
        System.out.println("Matrik A :"); 

        Matrix A = Matrix.random(3, 3);
        A.show(); 
        System.out.println();

      

        
   System.out.println("Pertanyaan no 1 :");     
//ini yang tugas, yang atas nyobak memanggil semua fungsi yang ada di library matrix.java
 D.show();
 System.out.println();
 A.swap(1, 2);
 A.show();
  System.out.println("Pertanyaan transpose matriks 3x3 :"); 
        Matrix B = A.transpose();
        B.show(); 
       System.out.println();
       
         System.out.println("Pertanyaan matriks identitas 3x3 :"); 

        Matrix C = Matrix.identity(3);
        C.show(); 
      System.out.println();

        A.plus(B).show();
     System.out.println();

        B.times(A).show();
       System.out.println();

        // shouldn't be equal since AB != BA in general    
        System.out.println(A.times(B).eq(B.times(A)));
        System.out.println();

        Matrix b = Matrix.random(3, 1);
        b.show();
       System.out.println();

        Matrix x = A.solve(b);
        x.show();
        System.out.println();

        A.times(x).show();
 System.out.println();
 // shouldn't be equal since AB != BA in general
 System.out.println(A.times(B).eq(B.times(A)));
 System.out.println();

 b.show();
 System.out.println();

 x.show();
 System.out.println();
 A.times(x).show();
 
   System.out.println("Pertanyaan no 2 :");  
     // membuat objek CPU kelas luar
        CPU cpu = new CPU();

       // membuat objek prosesor kelas dalam menggunakan kelas luar
        CPU.Processor processor = cpu.new Processor();

        // membuat objek RAM kelas dalam menggunakan CPU kelas luar
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
         System.out.println(); 
        
         System.out.println("Pertanyaan no 3 :"); 
          // create an object of the static nested class
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts());

    }
    
}
