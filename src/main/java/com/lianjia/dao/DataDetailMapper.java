package com.lianjia.dao;

import com.lianjia.model.entity.DataDetail;
import com.lianjia.model.entity.DataDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDetailMapper {
    int countByExample(DataDetailExample example);

    int deleteByExample(DataDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataDetail record);

    int insertSelective(DataDetail record);

    List<DataDetail> selectByExample(DataDetailExample example);

    DataDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataDetail record, @Param("example") DataDetailExample example);

    int updateByExample(@Param("record") DataDetail record, @Param("example") DataDetailExample example);

    int updateByPrimaryKeySelective(DataDetail record);

    int updateByPrimaryKey(DataDetail record);
}