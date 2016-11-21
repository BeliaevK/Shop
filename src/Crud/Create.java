package Crud;

import Entities.GoodsStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 21.11.2016.
 */
public class Create {

    private static Create instance;

    public static Create getInstance() {
        if (instance == null) {
            instance = new Create();
        }
        return instance;
    }

    public ArrayList<GoodsStock> createRecord (ArrayList<GoodsStock> homeAccountingArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Создание записи: Наименование | Тип | Цена");
        String[] recordField = reader.readLine().split("\\|");
        if (checkOrderFieldsIsCorrect(recordField)) {
            homeAccountingArrayList.add(new GoodsStock(homeAccountingArrayList.size() + 1, recordField[0],
                    GoodsStock.TypeGoods.valueOf(recordField[1]), Integer.parseInt(recordField[2])));
        }
        else {
            System.out.println("Неверный формат записи. Пример: \n Наименование | Тип | Цена");
        }
        return homeAccountingArrayList;
    }

    private static boolean checkOrderFieldsIsCorrect(String[] recordField) {
        boolean isCorrect = true;
        if (recordField.length < 3 || recordField.length > 3) isCorrect = false;
        return isCorrect;
    }
}
