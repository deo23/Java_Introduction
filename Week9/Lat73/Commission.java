/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lat73;

/**
 *
 * @author HP
 */
public class Commission extends Hourly{
   private double totalSales;
   private double comRate;
   
   public Commission(String name,String address,String phone,String social,double rate, double com){
       super(name, address, phone, social, rate);
       comRate = com;
   }
   public void addSales(double totalSales){
       this.totalSales += totalSales;
   }
   public double pay()
   {
      double commission = totalSales * comRate/100;
      double payment = super.pay() + commission;

      totalSales = 0;
      return payment;
   }
   public String toString(){
      String result = super.toString();

      result += "\nTotal Sales: " + totalSales;

      return result;
   }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getComRate() {
        return comRate;
    }

    public void setComRate(double comRate) {
        this.comRate = comRate;
    }
   
   
}

