package com.slionh.lolitaspider.mapper;

import com.slionh.lolitaspider.entity.Brands;
import com.slionh.lolitaspider.entity.BrandsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandsMapper {
    int countByExample(BrandsExample example);

    int deleteByExample(BrandsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Brands record);

    int insertSelective(Brands record);

    List<Brands> selectByExample(BrandsExample example);

    Brands selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Brands record, @Param("example") BrandsExample example);

    int updateByExample(@Param("record") Brands record, @Param("example") BrandsExample example);

    int updateByPrimaryKeySelective(Brands record);

    int updateByPrimaryKey(Brands record);
}