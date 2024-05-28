package com.product.dao;

import com.product.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * (Product)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-24 17:44:25
 */
public interface ProductDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Product queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param product 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Product> queryAllByLimit(Product product, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param product 查询条件
     * @return 总行数
     */
    long count(Product product);

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int insert(Product product);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Product> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Product> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Product> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Product> entities);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

