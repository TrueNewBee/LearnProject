package vip.chen.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 11:16
 * @Github: https://github.com/TrueNewBee
 * @Description:   统一返回数据 json 格式 前后端 分离 json
 */
@Data
public class Res {

    // 状态值
    private Boolean success;

    // 状态码
    private Integer code;

    // 数据
    private String message;

    private Map<String, Object> data = new HashMap<String,Object>();

    private Res(){}


    public static Res ok(){
        Res res = new Res();
        res.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        res.setCode(ResultCodeEnum.SUCCESS.getCode());
        res.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return res;
    }

    public static Res error(){
        Res res = new Res();
        res.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        res.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        res.setMessage(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return res;
    }

    public static Res setResult(ResultCodeEnum resultCodeEnum){
        Res res = new Res();
        res.setSuccess(resultCodeEnum.getSuccess());
        res.setCode(resultCodeEnum.getCode());
        res.setMessage(resultCodeEnum.getMessage());
        return res;
    }

    public Res success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Res message(String message) {
        this.setMessage(message);
        return this;
    }

    public Res code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Res data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Res data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

}
