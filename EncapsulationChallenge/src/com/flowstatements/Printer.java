package com.flowstatements;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel>-1 &&tonerLevel<=100){
        this.tonerLevel = tonerLevel;
        }else{
            System.out.println("Invalid Toner Level input added.");
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }
    public int addTonerLevel(int amountAdded){
        if(tonerLevel+amountAdded>100){
            System.out.println("Invalid toner level added");
            System.out.println("The toner level limit cannot exceed more than "+(100-tonerLevel));
            return -1;
        }else{

            System.out.println("the toner level after filling the tank is == "+(tonerLevel+amountAdded));
            return amountAdded;
        }
    }

    public int pagesToBePrinted(int newpagesToPrint){
        if(duplexPrinter){
            pagesPrinted += (newpagesToPrint/2)+(newpagesToPrint%2);
            System.out.println("New pages Printed for Duplex Printer = ="+pagesPrinted);
            return pagesPrinted;
        }else{
            pagesPrinted +=newpagesToPrint;
            System.out.println("New pages printed for normal printer == "+pagesPrinted);
            return pagesPrinted;
        }
    }

    public int getTonelLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
