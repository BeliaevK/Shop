package Crud;

import Entities.GoodsStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 21.11.2016.
 */
public class Delete {
    private static Delete instance;

    public static Delete getInstance() {
        if (instance == null) {
            instance = new Delete();
        }
        return instance;
    }

    public ArrayList<GoodsStock> deleteForIdRecord (ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите идентификатор для удаления записи");
        int recordField = Integer.parseInt(reader.readLine());
        for (int i = 0; i < goodsStockArrayList.size(); i++) {
            if (recordField == goodsStockArrayList.get(i).getId())
                goodsStockArrayList.remove(i);
        }
        return goodsStockArrayList;
    }
}
