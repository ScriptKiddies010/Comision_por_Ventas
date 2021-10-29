/*
Comision por ventas()
Utilice un arreglo de una dimension para resolver el siguiente problema: 

Una compañia paga a sus vendedores por comision. 

Los vendedores reciben 200$ por semana mas el 9% de sus ventas totales de esta semana. 

Por ejemplo un vendedor que acumule,5000$ en ventas en una semana recibira 200$ mas el 9% de 5000$, 
a un total de 650$. 

Escriba una app (Utilizar un arreglo de contadores) que determine cuantos venderodres recibieron el 
salario en cada uno de los siguientes rangos.


(suponga que el salario de c/ vendedor se trunca a una cantidad entera):
a) 200 - 299
b) 300 - 399
c) 400 - 499
d) 500 - 599
e) 600 - 699
f) 700 - 799
g) 800 - 899
h) 900 - 999
i) 1000 - en adelante

Muestre los datos que se piden mediante, la clase System.out.Print
 */
package comision;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

 class Comision extends JFrame implements ActionListener{
     
  //Declaramos arreglo rangos_venta
        String [] rango = new String[9];
  //Declaramos e inicializamos los contadores
        int a=0,b=0,c=0,d=0,ee=0,f=0,g=0,h=0,ii=0;
  
        int vta = 0,i, vendedor=1, vendedoralert=0;
  //Declaramos los objetos
    JButton btsig, btcalcular;
    JLabel lbventas;
    JTextField tfventas;
    
    public Comision(){
        
        //Constructor
        super("Comision");
        Container contenedor=getContentPane();
            contenedor.setLayout(new FlowLayout());
            
            btsig= new JButton("Registrar");
            btcalcular= new JButton("Calcular");
            lbventas= new JLabel("Ingresa las ventas totales de esta semana del vendedor numero 1: ");
            tfventas= new JTextField(5);
         
            
            contenedor.add(lbventas);
            contenedor.add(tfventas);
            contenedor.add(btsig);
            contenedor.add(btcalcular);
            
            btsig.addActionListener(this);
            setVisible (true);
                    
            btcalcular.addActionListener(this);
            setVisible (true);
            setSize(700,100);
            
    }
    
    public void actionPerformed(ActionEvent e){
         //se inicializa el arreglo
        
      
     
        //Si presionamos el boton registrar se calcula la comision y se le agregan $200
        if(e.getSource()==btsig){
        vendedor=vendedor+1;
        vendedoralert=vendedoralert+1;
        
        vta=Integer.parseInt(tfventas.getText());
        lbventas.setText("Ingresa las ventas totales de esta semana del vendedor numero "+vendedor+": ");
        
        
        vta=(int)(vta*0.09F+200);
        //System.out.println("Total de la venta: "+vta);
        //Borramos el campo de texto para permitir ingresar un nuevo numero
       
       
        
        //
          //este if nos ayuda a comparar entre 2 cantidades
         if (vta >= 200 && vta <= 299){
             //incrementamos el contador
            a=a+1;
            //asignamos valores al arreglo
            rango[0]= "a) 200 - 299 : "+a+"\n";
             //System.out.println(rango[0]);
        }
         else if(vta >= 300 && vta <= 399) {
         b=b+1;
            rango[1]= "b) 300 - 399 : "+b+"\n";
             //System.out.println(rango[1]);
        }
        else if(vta >= 400 && vta <= 499) {
          c=c+1;
            rango[2]= "c) 400 - 499 : "+c+"\n";
             //System.out.println(rango[2]);
        }
         else if(vta >= 500 && vta <= 599) {
          d=d+1;
            rango[3]= "d) 500 - 599 : "+d+"\n";
             //System.out.println(rango[3]);
        }
        else if(vta >= 600 && vta <= 699) {
            ee=ee+1;
            rango[4]= "e) 600 - 699 : "+ee+"\n";
             System.out.println(rango[4]);
        }
        else if(vta >= 700 && vta <= 799) {
          f=f+1;
            rango[5]= "f) 700 - 799 : "+f+"\n";
             //System.out.println(rango[5]);
        }
        else if(vta >= 800 && vta <= 899) {
         g=g+1;
            rango[6]= "g) 800 - 899 : "+g+"\n";
             //System.out.println(rango[6]);
        }
         else if(vta >= 900 && vta <= 999) {
        h=h+1;
            rango[7]= "h) 900 - 999 : "+h+"\n";
             //System.out.println(rango[7]);
        }
        else if(vta >= 1000) {
             ii=ii+1;
            rango[8]= "i) 1000 - en adelante : "+ii+"\n";
             //System.out.println(rango[8]);
        }
         
          tfventas.setText(null);
        JOptionPane.showMessageDialog(null, "Total de la venta: "+vta+"\n"+"Se registro el vendedor: "+vendedoralert);

         } //cierrra if
   
         
        //Si se presiona el boton calcular
           if(e.getSource()==btcalcular){
                    System.out.println("Rango          Cantidad de vendedores");
                    
           
             for (int i = 0; i < 9; i++) {
                 
                 //Si no existen registros de ese rango no imprime y sale del for
                  if(rango[i]!=null){
			System.out.print(" "+rango[i]+"\n");
                  }
			
		}
      
       
        }
        
    } //cierra actionPreformed
    
    //Metodo main
    public static void main(String[] args) {
        Comision g=new Comision();
    }
    
}//Termina class Comision
//si