package demo.utils;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

public class RandomUtils {

  private static final Faker faker = new Faker();

  public static String generateRandomFoodName() {

    List<String> itemData = new ArrayList<>();
    itemData.add(faker.food().dish());
    itemData.add(faker.food().fruit());
    itemData.add(faker.food().spice());
    itemData.add(faker.food().sushi());
    itemData.add(faker.food().vegetable());

    return itemData.stream().findAny().orElse("Food Name Not Generated");
  }

  public static String generateRandomCategoryName(){
    return "Category-" + System.currentTimeMillis();
  }

  public static String generateRandomModifierName(){
    return "Modifier-" + System.currentTimeMillis();
  }

  public static String generateRandomSKU(){
    return "SKU-" + System.currentTimeMillis();
  }

  public static String generateRandomItemPrice(){
    return String.valueOf(faker.number().numberBetween(10000, 100000));
  }

  public static String generateRandomModifierPrice(){
    return String.valueOf(faker.number().numberBetween(1000, 10000));
  }
}
