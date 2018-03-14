package practice13.common;

public class Employee extends Person {
	
	
	private String departmentNm;
	/** 部署人数 */
	private int departmentCnt;

	/**
	 * 部署名を取得します
	 * @return	部署名
	 */
	public String getDepartmentNm() {
		return departmentNm;
	}

	/**
	 * 部署名を設定します
	 * @param departmentNm	設定したい部署名
	 */
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	/**
	 * 部署人数を取得します
	 * @return	部署人数
	 */
	public int getDepartmentCnt() {
		return departmentCnt;
	}

	/**
	 * 部署人数を設定します
	 * @param departmentCnt	設定したい部署人数
	 */
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}


}
