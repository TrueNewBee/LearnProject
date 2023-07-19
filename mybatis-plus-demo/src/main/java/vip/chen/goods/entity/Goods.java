package vip.chen.goods.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Data
public class Goods implements Serializable {
    private Integer id;

    private String goodsname;

    private BigDecimal goodsprice;

    private Integer goodsnum;

    private Integer goodstype;

    private String remark;

    private static final long serialVersionUID = 1L;

}