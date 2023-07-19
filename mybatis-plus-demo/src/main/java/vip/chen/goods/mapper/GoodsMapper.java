package vip.chen.goods.mapper;

import org.apache.ibatis.annotations.Mapper;
import vip.chen.goods.entity.Goods;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}