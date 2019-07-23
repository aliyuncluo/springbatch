package net.xyt.payment.batch;

/**  
* <p>Title: JobEnum</p>  
*/
public enum JobEnum {
	/**
	 * 定时
	 */
	JOB_TIMING("定时"),
	/**
	 * 手动
	 */
	JOB_MANUAL("手动");
	private String desc;//中文描述
	 /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    private  JobEnum(String desc){
        this.desc=desc;
    }

	public String getDesc() {
		return desc;
	}

	/*public void setDesc(String desc) {
		this.desc = desc;
	}*/
}
