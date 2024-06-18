package com.mw.db.dao;

import java.util.HashMap;

public class AjaxResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /** 状态码 */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";


    public AjaxResult() {
    }

    public static AjaxResult success() {
        return new AjaxResult().code(200).msg("操作成功");
    }

    public static AjaxResult error() {
        return new AjaxResult().code(500).msg("操作失败");
    }

    public static AjaxResult bad() {
        return new AjaxResult().code(400).msg("请求错误");
    }

    public AjaxResult code(int code) {
        super.put(CODE_TAG, code);
        return this;
    }

    public AjaxResult msg(String msg) {
        super.put(MSG_TAG, msg);
        return this;
    }

    public AjaxResult data(Object data) {
        super.put(DATA_TAG, data);
        return this;
    }

    /*
     * 方便链式调用
     */
    @Override
    public AjaxResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
