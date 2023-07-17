package vip.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vip.chen.pojo.Goods;
import vip.chen.service.GoodsService;
import vip.chen.util.Res;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: TrueNewBee
 * @Date: 2023/7/17 11:37
 * @Github: https://github.com/TrueNewBee
 * @Description:
 */
@RestController
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/getAll")
    public Res getAll() {
        List<Goods> goodsList = goodsService.getGoodsList();
        return Res.ok().data("goodsList", goodsList);
    }

    @PostMapping("/addGoods")
    public Res addGoods(Goods goods) {
        int i = goodsService.addGoods(goods);
        return Res.ok().data("goods", i);
    }

    @PostMapping("/deleteGoods")
    public Res deleteGoodsById(@RequestParam("id") Integer id) {
        int i = goodsService.deleteGoodsById(id);
        return Res.ok().data("deleteGoods", i);
    }

    @PostMapping("/getGoods")
    public Res getGoodsById(@RequestParam("id") Integer id) {
        Goods goods = goodsService.findGoodsById(id);
        return Res.ok().data("goods", goods);
    }

    @PostMapping("/updateGoods")
    public Res updateGoodsById(Goods goods) {
        int i = goodsService.updateGoodsById(goods);
        return Res.ok().data("updateGoods", i);
    }
}
