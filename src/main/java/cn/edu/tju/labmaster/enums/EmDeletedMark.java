package cn.edu.tju.labmaster.enums;

public enum EmDeletedMark {

    VALID(1, "ÓÐÐ§"),
    INVALID(0, "ÎÞÐ§"),;
    
    private int code;

    private String value;

    EmDeletedMark(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}