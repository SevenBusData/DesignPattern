package com.cn.builderModel;

public class Client {
    public static void main(String[] args) {
        //  动态确定套餐种类
        MealBuilder mealBuilder = (MealBuilder) XMLUtil.getClassName();
        //  服务员是指挥者
        KFCWaiter waiter = new KFCWaiter();
        //  服务员指定套餐
        waiter.setMealBuilder(mealBuilder);
        //  客户获得套餐
        Meal meal = waiter.constructMeal();

        System.out.println("套餐组成:");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
