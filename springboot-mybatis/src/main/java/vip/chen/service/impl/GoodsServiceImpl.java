package vip.chen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.chen.mapper.GoodsMapper;
import vip.chen.pojo.Goods;
import vip.chen.service.GoodsService;

import java.util.List;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 11:05
 * @Github: https://github.com/TrueNewBee
 * @Description: goods的Service
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    @Override
    public int deleteGoodsById(Integer id) {
        return goodsMapper.deleteGoodsById(id);
    }

    @Override
    public Goods findGoodsById(Integer id) {
        return goodsMapper.findGoodsById(id);
    }

    @Override
    public int updateGoodsById(Goods goods) {
        return goodsMapper.updateGoodsById(goods);
    }
}
