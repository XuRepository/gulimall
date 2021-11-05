package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xujunyang
 * @email 502864930@qq.com
 * @date 2021-11-03 00:16:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
