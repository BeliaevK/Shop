package Entities;

import Utilities.IdGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by k.beliaev on 30.11.2016.
 */
public class OperationDispatcher {

    private static OperationDispatcher instance;

    public static OperationDispatcher getInstance() {
        if (instance == null) {
            instance = new OperationDispatcher();
        }
        return instance;
    }

    public ArrayList<GoodsStock> createRecord (ArrayList<GoodsStock> homeAccountingArrayList) throws IOException {
        ConsoleDispatcher.sendMessage(Messages.MSG_REQUEST_PRODUCT_INFO);
        String[] recordField = ConsoleDispatcher.readLine().split("\\|");
        if (checkOrderFieldsIsCorrect(recordField)) {
            homeAccountingArrayList.add(new GoodsStock(IdGenerator.nextId(), recordField[0],
                    GoodsStock.TypeGoods.valueOf(recordField[1]), GoodsStock.CategoriesGoods.valueOf(recordField[2]), Integer.parseInt(recordField[3])));
        }
        else {
            System.out.println("Неверный формат записи. Пример: \n Наименование | Тип | Цена");
        }
        return homeAccountingArrayList;
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

    public ArrayList<GoodsStock> readRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        System.out.println("Вывод списка: all - вывести все записи, ввести Id записи");
        String recordField = ConsoleDispatcher.readLine();
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
        int recordField = Integer.parseInt(ConsoleDispatcher.readLine());
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

    private static boolean checkOrderFieldsIsCorrect(String[] recordField) {
        boolean isCorrect = true;
        if (recordField.length < 3 || recordField.length > 3) isCorrect = false;
        return isCorrect;
    }

    public ArrayList<GoodsStock> updateForIdRecord(ArrayList<GoodsStock> goodsStockArrayList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите идентификатор для редактирования записи");
        int recordField = Integer.parseInt(reader.readLine());

        for (int i = 0; i < goodsStockArrayList.size(); i++) {
            if (recordField == goodsStockArrayList.get(i).getId()){
                System.out.println("Введите: Наименование | Тип | Категория");
                String[] updateField = reader.readLine().split("\\|");
                if(checkStringUpdeteFieldsIsCorrect(updateField)){
                    goodsStockArrayList.add( new GoodsStock(IdGenerator.nextId(),updateField[0], GoodsStock.TypeGoods.valueOf(updateField[1]),
                            GoodsStock.CategoriesGoods.valueOf(updateField[2]),goodsStockArrayList.get(i).getSum()));
                }
            }
        }
        return goodsStockArrayList;
    }

    private static boolean checkStringUpdeteFieldsIsCorrect(String[] readLine) {
        boolean isCorrect = false;
        if (!readLine[0].equals("") | !readLine[1].equals("") | !readLine[2].equals("")) isCorrect = true;
        return isCorrect;
    }
}
