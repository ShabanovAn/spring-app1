package test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        System.out.println(close10(5, 5));

    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }
}


//        int x = 0;
//        List<Integer> integers = Arrays.asList(a,b,c);
//        // integers.sort(Collections.reverseOrder());
//        integers.stream().sorted().mapToInt(Integer::intValue).toString();
//        for (Integer integer : integers)
//            x = integer;

//        int x = Integer.MIN_VALUE;
//        int[] d = {a,b,c};
//        Arrays.sort(d);
//        for (int i : d)
//        x = i;
//        return x;





//    public static int getWords(String s) {
//        return (int) Arrays.stream(s.split("^ ")).distinct().count();

//class TransactionService {
//    enum Type {PAYMENT, REFUND}
//
//    static class TransactionData {
//        final Type type;
//        final String currency;
//        final Long amount;
//
//        TransactionData(Type type,
//                        String currency,
//                        Long amount) {
//            this.type = type;
//            this.currency = currency;
//            this.amount = amount;
//        }
//
//        String getCurrency() {
//            return currency;
//        }
//
//        Long getAmount() {
//            return amount;
//        }
//
//        Type getType() {
//            return type;
//        }
//    }
//
//    Map<String, Double> getAverageDepositMapByCurrency(List<TransactionData> transactionDataList) {
//        transactionDataList.stream().collect(Collectors.groupingBy(p1 -> p1.getCurrency(), p2 -> p2.getAmount()));
//
//
//    }
//}







//// String[] result = {str};
// String result = "";
////        for (int i = 0; i < result.length; i++) {
////            for (String s : result) {
//                if (str.startsWith("oz")) {
//                        return "oz";
//                        }
//                        if (str.startsWith("z",2)) {
//                        return "z";
//                        }
//                        if (str.startsWith("o")) {
//                        return "o";
//
//                        } else {
//                        return "";