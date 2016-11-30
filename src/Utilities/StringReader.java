package Utilities;

import Entities.ConsoleDispatcher;
import Entities.GoodsStock;
import Entities.OperationDispatcher;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Scala on 20.11.2016.
 */
public class StringReader {
    private static StringReader instance;

    public static StringReader getInstance() {
        if (instance == null) {
            instance = new StringReader();
        }
        return instance;
    }

    public static ArrayList<GoodsStock> orderRead(ArrayList<GoodsStock> homeAccountingArrayList) throws IOException {
        String readLine = ConsoleDispatcher.readLine();
        if (checkOrderFieldsIsCorrect(readLine)) {
            switch (readLine) {
                case "c":
                    OperationDispatcher.getInstance().createRecord(homeAccountingArrayList);
                    break;
                case "r":
                    OperationDispatcher.getInstance().readRecord(homeAccountingArrayList);
                    break;
                case "u":
                    OperationDispatcher.getInstance().updateForIdRecord(homeAccountingArrayList);
                    break;
                case "d":
                    OperationDispatcher.getInstance().deleteForIdRecord(homeAccountingArrayList);
                    break;
            }
        } else {
            System.out.println("Неверный запрос. Пример: \n c - создать запись, r - просмотреть список, u - " +
                    "обновить запись, d - удалить запись");
        }
        return homeAccountingArrayList;
    }

    private static boolean checkOrderFieldsIsCorrect(String readLine) {
        boolean isCorrect = false;
        if (readLine.equals("c") || readLine.equals("r")|| readLine.equals("u")|| readLine.equals("d")) isCorrect = true;
        return isCorrect;
    }
}
