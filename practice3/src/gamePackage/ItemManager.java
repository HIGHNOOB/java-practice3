package gamePackage;

public class ItemManager {

	public boolean useItem(Item item) {
		if (!item.isUsable(item.getItemCode())) {
			System.out.printf("[%s]����� �� �ִ� �������� �ƴ�\n", item.getName());
			return false;
		}
		//TODO ������ ��� (����-1)
		return true;
	}
	

}
