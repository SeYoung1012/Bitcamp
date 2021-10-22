package jdbc.store.vo;

public class StoreVO {

	private String storeName;
	private String storeCall;
	private String storeAddress;
	private String storeMail;
	private String storeTime;

	

	public StoreVO(String storeName, String storeCall, String storeAddress, String storeMail, String storeTime) {

		this.storeName = storeName;
		this.storeCall = storeCall;
		this.storeAddress = storeAddress;
		this.storeMail = storeMail;
		this.storeTime = storeTime;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreCall() {
		return storeCall;
	}

	public void setStoreCall(String storeCall) {
		this.storeCall = storeCall;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreMail() {
		return storeMail;
	}

	public void setStoreMail(String storeMail) {
		this.storeMail = storeMail;
	}

	public String getStoreTime() {
		return storeTime;
	}

	public void setStoreTime(String storeTime) {
		this.storeTime = storeTime;
	}

	@Override
	public String toString() {
		return "StoreVO [storeName=" + storeName + ", storeCall=" + storeCall + ", storeAddress=" + storeAddress
				+ ", storeMail=" + storeMail + ", storeTime=" + storeTime + "]";
	}

}
