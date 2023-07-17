package vip.chen.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import vip.chen.pojo.Goods;

import java.util.List;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 10:44
 * @Github: https://github.com/TrueNewBee
 * @Description: 商品的Mapper接口
 */
@Mapper
public interface GoodsMapper {

    /**
     * 返回商品所有信息
     * @return 商品所有信息
     */
    List<Goods> getGoodsList();

    /**
     * 添加商品信息
     *
     * @param goods 商品
     * @return
     */
    int addGoods(Goods goods);

    /**
     * 根据id删除商品信息
     *
     * @param id id
     * @return
     */
    int deleteGoodsById(@Param("id") Integer id);

    /**
     * 根据id查询商品信息
     *
     * @param id id
     * @return
     */
    Goods findGoodsById(@Param("id") Integer id);

    /**
     * 根据id修改商品信息
     *
     * @param goods 商品
     * @return
     */
    int updateGoodsById(Goods goods);
}
