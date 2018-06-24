package com.lianjia.dao;

import com.lianjia.model.entity.DataList;
import com.lianjia.model.entity.DataListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataListMapper {
    int countByExample(DataListExample example);

    int deleteByExample(DataListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataList record);

    int insertSelective(DataList record);

    List<DataList> selectByExample(DataListExample example);

    DataList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataList record, @Param("example") DataListExample example);

    int updateByExample(@Param("record") DataList record, @Param("example") DataListExample example);

    int updateByPrimaryKeySelective(DataList record);

    int updateByPrimaryKey(DataList record);
}