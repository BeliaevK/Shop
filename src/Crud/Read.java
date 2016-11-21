package Crud;

import Entities.GoodsStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 21.11.2016.
 */
public class Read {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Read instance;

    public static Read getInstance() {
        if (instance == null) {
            instance = new Read();
        }
        return instance;
    }

    public ArrayList<GoodsStock> readRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        System.out.println("Вывод списка: all - вывести все записи, ввести Id записи");
        String recordField = reader.readLine();
        if (checkStringFieldsIsCorrect(recordField)) {
            goodsStockArrayList.forEach(System.out::println);
        }
        else {
            System.out.println("Неверный формат записи. Пример: \n all - вывести все записи");
        }
        return goodsStockArrayList;
    }

    public void findAllRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
            goodsStockArrayList.forEach(System.out::println);
    }

    public void findForIdRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        int recordField = Integer.parseInt(reader.readLine());
            for (GoodsStock aGoodsStockArrayList : goodsStockArrayList) {
                if (recordField == aGoodsStockArrayList.getId())
                    System.out.println(aGoodsStockArrayList);
            }
    }

    private static boolean checkStringFieldsIsCorrect(String recordField) {
        boolean isCorrect = false;
        if (recordField.equals("all")) isCorrect = true;
        return isCorrect;
    }

    private static boolean checkIntFieldsIsCorrect(int recordField) {
        boolean isCorrect = false;
        if (recordField == (0-Integer.MAX_VALUE)) isCorrect = true;
        return isCorrect;
    }
}
