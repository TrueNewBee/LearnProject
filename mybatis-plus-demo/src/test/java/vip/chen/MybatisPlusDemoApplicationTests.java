package vip.chen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.chen.goods.entity.Goods;
import vip.chen.goods.mapper.GoodsMapper;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private GoodsMapper goodsMapper;
    @Test
    void contextLoads() {
        Goods goods = goodsMapper.selectByPrimaryKey(1);
        System.out.println(goods.toString());
    }
}
