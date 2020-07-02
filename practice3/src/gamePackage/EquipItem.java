package gamePackage;

public class EquipItem extends Item{

	private int mSlotIdx = 0;
	private boolean mIsEquipped = false;
	
	public EquipItem(String name, int itemCode, int itemCount, long guid, int slotIdx){
		super(name, itemCode, itemCount, guid);
		mSlotIdx = slotIdx;
		mIsEquipped = false;
	}
	
	public void equip(boolean isEquipped) {
		mIsEquipped = isEquipped;
	}
}
