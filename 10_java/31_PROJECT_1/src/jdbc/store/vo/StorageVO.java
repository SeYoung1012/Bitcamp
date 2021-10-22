

package jdbc.store.vo;

public class StorageVO {

	private int id;
	private String storename;
	private int bookid;
	private int bookcnt;

	public StorageVO(int id, String storename, int bookid, int bookcnt) {

		this.id = id;
		this.storename = storename;
		this.bookid = bookid;
		this.bookcnt = bookcnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getBookcnt() {
		return bookcnt;
	}

	public void setBookcnt(int bookcnt) {
		this.bookcnt = bookcnt;
	}

	@Override
	public String toString() {
		return "StorageVO [id=" + id + ", storename=" + storename + ", bookid=" + bookid + ", bookcnt=" + bookcnt + "]";
	}

}
