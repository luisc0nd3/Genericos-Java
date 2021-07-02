package Pojos;

public class JsonError {
	private String msg;

	private String numReference;
	
	private Integer code;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getNumReference() {
		return numReference;
	}

	public void setNumReference(String numReference) {
		this.numReference = numReference;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}