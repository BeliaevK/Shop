package Utilities;

import Crud.Create;
import Crud.Delete;
import Crud.Read;
import Crud.Update;
import Entities.GoodsStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = reader.readLine();
        if (checkOrderFieldsIsCorrect(readLine)) {
            switch (readLine) {
                case "c":
                    Create.getInstance().createRecord(homeAccountingArrayList);
                    break;
                case "r":
                    Read.getInstance().readRecord(homeAccountingArrayList);
                    break;
                case "u":
                    Update.getInstance().updateForIdRecord(homeAccountingArrayList);
                    break;
                case "d":
                    Delete.getInstance().deleteForIdRecord(homeAccountingArrayList);
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
