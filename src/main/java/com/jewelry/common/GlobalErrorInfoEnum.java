package com.jewelry.common;

public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS("200", "success"),
    OPERATION_FAILED("201","operation failed"),
    NOT_FOUND("404", "service not found"),
    CHANGE_ERROR("500","change exception"),
    ITEM_NOTFOUND("202","该商品不在出货范围内"),
    CONNOT_UPDATE("203","更新失败,库区内有货,暂时不能停用");



    private String code;

    private String msg;

    GlobalErrorInfoEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode(){
        return this.code;
    }

    public String getMsg(){
        return this.msg;
    }
}
