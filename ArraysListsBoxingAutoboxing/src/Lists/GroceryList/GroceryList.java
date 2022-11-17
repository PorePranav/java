package Lists.GroceryList;
import java.util.ArrayList;

public class GroceryList{
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addGrocery(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in the list");

        for(int i = 0; i < groceryList.size(); i++)
            System.out.println((i + 1) + ". " + groceryList.get(i));
    }

    public void modifyGroceryItem(String oldItem, String newItem){
        int index = getIndex(oldItem);

        if(index >= 0) {
            String oldName = groceryList.get(index);
            groceryList.set(index, newItem);
            System.out.println("Grocery item " + oldName + " has been modified to " + newItem);
        }
        else
            System.out.println("There is no item " + oldItem + " in the grocery list");
    }

    public void removeItem(String itemName){
        int index = getIndex(itemName);

        if(index >= 0) {
            groceryList.remove(itemName);
            System.out.println("Item " + itemName + " removed from the list");
        }
        else
            System.out.println("The item " + itemName + " was not found in the list");
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);

        if(position >= 0)
            return groceryList.get(position);

        return null;
    }

    public int getIndex(String groceryItem){
        return groceryList.indexOf(groceryItem);
    }
}
