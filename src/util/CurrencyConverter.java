package util;

public class CurrencyConverter {

    public static double dollars;
    public static double dollarPrice;

    public CurrencyConverter() { }

    public static double iofDollar(){
        return dollars * dollarPrice * 0.06;
    }
    public static double conversioDollar(){
        return dollars * dollarPrice + iofDollar();
    }

}
