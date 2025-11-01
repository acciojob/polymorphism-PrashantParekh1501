package com.driver;

public class Main {
   public static void main(String[] args) {
      Product p = new Product();

      int res1 = p.product(2, 3);           // 2 integers
      int res2 = p.product(2, 3, 4);        // 3 integers
      double res3 = p.product(2.5, 2.5);    // 2 doubles

      System.out.println(res1);
      System.out.println(res2);
      System.out.println(res3);
   }
}
