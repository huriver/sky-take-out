package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id数组查询对应的套餐id
     *
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<String> dishIds);

    /**
     * 批量保存套餐和菜品的关联关系
     *
     * @param setmealDishList
     */
    void insertBatch(List<SetmealDish> setmealDishList);
}
