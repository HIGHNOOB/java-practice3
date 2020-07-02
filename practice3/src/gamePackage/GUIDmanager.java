package gamePackage;

public class GUIDmanager {
	public static final int GUID_DECIMAL = (int) 1E4;
	public static int GUID_EIGENVAL = 0;

	public static final int GUID_CHARACTER = 1001;

	public static final int GUID_ITEM_EQUIPMENT_WEAPON = 2001;
	public static final int GUID_ITEM_EQUIPMENT_HAT = 2002;
	public static final int GUID_ITEM_EQUIPMENT_CLOTH = 2003;
	public static final int GUID_ITEM_EQUIPMENT_SHOSE = 2004;

	public static final int GUID_ITEM_USABLE_UPGRADE = 3001;
	public static final int GUID_ITEM_USABLE_POTION = 3002;

	public static long makeGUID(int guidType) {
		long GUID;
		long GUID_start = (guidType);
		long GUID_end = GUID_EIGENVAL++;
		
		GUID = (GUID_start * GUID_DECIMAL) + GUID_end;

		System.out.printf("[GUIDmanager] GUID: %d »ý¼º%n", GUID);
		return GUID;
	}

}
