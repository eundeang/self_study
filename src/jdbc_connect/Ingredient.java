package jdbc_connect;

public interface Ingredient {
    void insert();
    void findIngredientsByFoodName(String foodName);
    void update();
    void delete();
    void printAll();
}
