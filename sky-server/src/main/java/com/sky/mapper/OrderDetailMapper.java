package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    /**
     * 批量插入订单明细
     *
     * @param orderDetailList
     */
    public void insertBatch(List<OrderDetail> orderDetailList);

    /**
     * 根据订单id查询订单明细
     *
     * @param orderId
     * @return
     */
    @Select("select id, name, image, order_id, dish_id, setmeal_id, dish_flavor, number, amount " +
            "from order_detail where order_id = #{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);
}
