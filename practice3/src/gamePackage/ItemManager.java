package gamePackage;

public class ItemManager {

	public boolean useItem(Item item) {
		if (!item.isUsable(item.getItemCode())) {
			System.out.printf("[%s]사용할 수 있는 아이템이 아님\n", item.getName());
			return false;
		}
		//TODO 아이템 사용 (갯수-1)
		return true;
	}
	

}
