package vip.chen.service;

import vip.chen.pojo.Goods;

import java.util.List;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 11:03
 * @Github: https://github.com/TrueNewBee
 * @Description: Goods的service接口
 */
public interface GoodsService {
    List<Goods> getGoodsList();

    int addGoods(Goods goods);

    int deleteGoodsById(Integer id);

    Goods findGoodsById(Integer id);

    int updateGoodsById(Goods goods);
}
