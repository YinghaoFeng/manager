package com.zeus.manager.common.param;

/**
 * Created by fengyinghao on 2018/10/15.
 */
public class ResultParam {
    private int code;

    private String msg;

    private Object data;

    /** 操作成功 */
    public static final ResultParam SUCCESS_RESULT = new ResultParam(0, "操作成功!!!");

    /** 系统异常 */
    public static final ResultParam SYSTEM_ERROR_RESULT = new ResultParam(1, "系统异常, 请稍后重试!!!");

    /** 登录异常 */
    public static final ResultParam LOGIN_ERROR_RESULT = new ResultParam(2, "登录信息已失效, 请重新登录!!!");

    /** 请求参数异常 */
    public static final ResultParam PARAM_ERROR_RESULT = new ResultParam(3, "请求参数异常, 请重试!!!");

    /** 操作失败 */
    public static final ResultParam FAIL_RESULT = new ResultParam(4, "操作失败, 请重试!!!");

    /** 默认错误编码 */
    public static final int ERROR = 9;

    /** 校验存在活动改价 */
    public static final int CHECK_ACT_PRICE = 929;

    /** 成功编码 */
    public static final int SUCCESS = 0;


    public ResultParam() {
    }

    public ResultParam(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultParam(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultParam(ResultParam param, Object data) {
        this.code = param.getCode();
        this.msg = param.getMsg();
        this.data = data;
    }

    public static ResultParam error(String message) {
        return new ResultParam(ERROR, message);
    }

    public static ResultParam data(Object data) {
        return new ResultParam(SUCCESS_RESULT, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
