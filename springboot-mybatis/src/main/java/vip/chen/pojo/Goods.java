package vip.chen.pojo;

import lombok.Data;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 10:43
 * @Github: https://github.com/TrueNewBee
 * @Description:
 */
@Data
public class Goods {
    private long id;
    private String goodsName;
    private double goodsPrice;
    private long goodsNum;
    private String goodsType;
    private String remark;
}
