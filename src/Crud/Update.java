package Crud;

import Entities.GoodsStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 21.11.2016.
 */
public class Update {
    private static Update instance;

    public static Update getInstance() {
        if (instance == null) {
            instance = new Update();
        }
        return instance;
    }

    public ArrayList<GoodsStock> updateForIdRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите идентификатор для редактирования записи");
        int recordField = Integer.parseInt(reader.readLine());

        for (int i = 0; i < goodsStockArrayList.size(); i++) {
            if (recordField == goodsStockArrayList.get(i).getId()){
                System.out.println("Введите: Наименование | Тип | Категория");
                String[] updateField = reader.readLine().split("\\|");
                if(checkStringFieldsIsCorrect(updateField)){
/*                    goodsStockArrayList.add(IdGenerator.nextId(),updateField[0], GoodsStock.TypeGoods.valueOf(updateField[1]),
                            GoodsStock.CategoriesGoods.valueOf(updateField[2]),goodsStockArrayList.get(i).getSum());*/
                }
            }
        }
        return goodsStockArrayList;
    }

    private static boolean checkStringFieldsIsCorrect(String[] readLine) {
        boolean isCorrect = false;
        if (!readLine[0].equals("") | !readLine[1].equals("") | !readLine[2].equals("")) isCorrect = true;
        return isCorrect;
    }
}
