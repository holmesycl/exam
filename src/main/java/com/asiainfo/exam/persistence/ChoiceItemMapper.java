package com.asiainfo.exam.persistence;

import com.asiainfo.exam.domain.ChoiceItem;
import com.asiainfo.exam.domain.ChoiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceItemMapper {
    int countByExample(ChoiceItemExample example);

    int deleteByExample(ChoiceItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ChoiceItem record);

    int insertSelective(ChoiceItem record);

    List<ChoiceItem> selectByExample(ChoiceItemExample example);

    ChoiceItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ChoiceItem record, @Param("example") ChoiceItemExample example);

    int updateByExample(@Param("record") ChoiceItem record, @Param("example") ChoiceItemExample example);

    int updateByPrimaryKeySelective(ChoiceItem record);

    int updateByPrimaryKey(ChoiceItem record);
}