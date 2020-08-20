package cn.smartyouth.friday.common.util;

public enum ResultCode {

    UNAUTHORIZED("401", "暂未登录或token已经过期"),
    SUCCESS("0000", "操作成功"),
    FAILED("9999", "系统繁忙"),
    FORBIDDEN("403", "没有相关权限");

    private String code;
    private String message;

    private ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
