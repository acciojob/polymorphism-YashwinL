package com.driver;

public class Main {

    static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public double product(double x, double y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,5);
        p.product(5,5,5);
        p.product(4.4,5.5);

    }




}