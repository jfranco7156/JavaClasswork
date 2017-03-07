package introduction;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		String[] justDescriptions= getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
		
	}

	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>(); //1 point
		for(String s: justDescriptions){
			shoppingList.add(new Item(s));
		}
		//this answer is also possible
//		for(int i=0; i<justDescriptions.length;i++){//.5 point
//			shoppingList.add(new Item(justDescriptions[i]));//.5 adding, 1 point creating Item
//		}
	}

	private static void printPurchasedItems() {
		for(int i=0;i<shoppingList.size();i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				//you can do this:
//				System.out.println(shoppingList.remove(i).getDescription());
				//1 point for removal
				//1 point for purchased
			}
		}
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static String[] getDescriptions() {
		String[] test= {"coffee","video games","potato chips","a life"};
		return test;
	}

}
