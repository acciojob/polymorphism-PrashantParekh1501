package com.driver;

public class Main {
   public static void main(String[] args) {
      Product p = new Product();

      int prod2 = p.product(2, 3);
      System.out.println("product of 2 numbers :" + prod2);

      int prod3 = p.product(4,5,6);
      System.out.println("product of 3 numbers :" + prod3);

      double prod4 = p.product(2.3,3.4);
      System.out.println("product of 2 numbers :" + prod4);

   }
}