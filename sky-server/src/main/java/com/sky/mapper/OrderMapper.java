package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface OrderMapper {

    /**
     * 插入订单数据
     *
     * @param orders
     */
    void insert(Orders orders);

    /**
     * 根据订单号查询订单
     *
     * @param orderNumber
     */
    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * 修改订单信息
     *
     * @param orders
     */
    void update(Orders orders);

    /**
     * 分页条件查询并按下单时间排序
     *
     * @param ordersPageQueryDTO
     */
    Page<Orders> pageQuery(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 根据id查询订单
     *
     * @param id
     * @return
     */
    @Select("select id, number, status, user_id, address_book_id, order_time, checkout_time, pay_method, " +
            "pay_status, amount, remark, phone, address, user_name, consignee, cancel_reason, " +
            "rejection_reason, cancel_time, estimated_delivery_time, delivery_status, delivery_time, " +
            "pack_amount, tableware_number, tableware_status " +
            "from orders where id = #{id}")
    Orders getById(Long id);

    /**
     * 根据状态统计订单数量
     *
     * @param status
     * @return
     */
    @Select("select count(id) from orders where status = #{status}")
    Integer countStatus(Integer status);

    /**
     * 根据状态和下单时间查询订单
     *
     * @param status
     * @param orderTime
     * @return
     */
    @Select("select id, number, status, user_id, address_book_id, order_time, checkout_time, pay_method, " +
            "pay_status, amount, remark, phone, address, user_name, consignee, cancel_reason, " +
            "rejection_reason, cancel_time, estimated_delivery_time, delivery_status, delivery_time, " +
            "pack_amount, tableware_number, tableware_status " +
            "from orders where status = #{status} and order_time < #{orderTime}")
    List<Orders> getByStatusAndOrderTimeLT(Integer status, LocalDateTime orderTime);
}
