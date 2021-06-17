package com.flowstatements;

public class Main {

    public static void main(String[] args) {
        Printer myprinter = new Printer(40, false);
        Printer myBrandNewPrinter = new Printer(75, true);
        myprinter.pagesToBePrinted(11);
        myBrandNewPrinter.pagesToBePrinted(27);
        myprinter.addTonerLevel(70);
        myprinter.addTonerLevel(40);
        myBrandNewPrinter.addTonerLevel(23);
        System.out.println("initial pages printed for myprinter=="+myprinter.getPagesPrinted());
    }
}
