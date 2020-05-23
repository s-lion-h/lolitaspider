package com.slionh.lolitaspider.mapper;

import com.slionh.lolitaspider.entity.Productdetail;
import com.slionh.lolitaspider.entity.ProductdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductdetailMapper {
    int countByExample(ProductdetailExample example);

    int deleteByExample(ProductdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productdetail record);

    int insertSelective(Productdetail record);

    List<Productdetail> selectByExample(ProductdetailExample example);

    Productdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);

    int updateByExample(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);

    int updateByPrimaryKeySelective(Productdetail record);

    int updateByPrimaryKey(Productdetail record);
}