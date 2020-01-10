package com.practicehouse.convertion2;

import java.text.NumberFormat;
import java.util.Locale;

public class String2DoubleWithThousandSeparators {

    public static void main(String[] args) {

        // String to int Convertion and then put thousand seperator
        String intString = "123456543";
        int convertedString = Integer.parseInt(intString);

        NumberFormat format = NumberFormat.getNumberInstance();
        System.out.println(format.format(convertedString)); // 123,456,543

        // If you want to add currency
        NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(format2.format(convertedString)); // $123,456,543.00

        // IF you dont want to specify the LOCALE
        NumberFormat format3 = NumberFormat.getCurrencyInstance();
        System.out.println(format3.format(convertedString)); // MYR123,456,543.00 ( Currently i am in Malaysia )

        String number = "1234256790.00";

        double convertedNumber = Double.parseDouble(number);

        NumberFormat formatter = NumberFormat.getInstance();

        System.out.println(formatter.format(convertedNumber)); //  1,234,256,790

        // Zero was missing in this way but if its not zero it will show
        // see the example
        String number2 = "1234256790.45";
        double convertedNumber2 = Double.parseDouble(number2);

        System.out.println(formatter.format(convertedNumber2)); // 1,234,256,790.45

        // with currencyInstance will not be problem to show zeros
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance();

        System.out.println(formatter2.format(convertedNumber)); // MYR1,234,256,790.00

        System.out.println(formatter2.format(convertedNumber2)); // MYR1,234,256,790.45

        String number3 = "133456787699.00";
        double convertedNumber3 = Double.parseDouble(number3);

        // formatter we are using from line No 29
        String result = formatter.format(convertedNumber3);

        System.out.println(result); //133,456,787,699

        if (!result.contains(".")) {
            result += ".00";
        }

        System.out.println(result); //133,456,787,699.00

    }
}
