package com;

public class Info extends Products{
    private char symbol = 'L';
    String products = "mango";
    String info;
    Info() {}

    Info(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getProducts() {
        info = this.symbol + " " + super.products + " " + this.products;
        return info;
    }

    public int getNUmber() {
        return 0;
    }
}

class Products{
    protected String products = "bananas";

    protected String products() {
        return this.products;
    }
}
