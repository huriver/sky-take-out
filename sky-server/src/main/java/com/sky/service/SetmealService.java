package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {


    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     *
     * @param setmealDTO
     */
    void saveWithSetmealDish(SetmealDTO setmealDTO);
}
