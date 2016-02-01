package com.asiainfo.exam.persistence;

import com.asiainfo.exam.domain.ChoiceAnswer;
import com.asiainfo.exam.domain.ChoiceAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceAnswerMapper {
    int countByExample(ChoiceAnswerExample example);

    int deleteByExample(ChoiceAnswerExample example);

    int deleteByPrimaryKey(Integer choiceAnswerId);

    int insert(ChoiceAnswer record);

    int insertSelective(ChoiceAnswer record);

    List<ChoiceAnswer> selectByExample(ChoiceAnswerExample example);

    ChoiceAnswer selectByPrimaryKey(Integer choiceAnswerId);

    int updateByExampleSelective(@Param("record") ChoiceAnswer record, @Param("example") ChoiceAnswerExample example);

    int updateByExample(@Param("record") ChoiceAnswer record, @Param("example") ChoiceAnswerExample example);

    int updateByPrimaryKeySelective(ChoiceAnswer record);

    int updateByPrimaryKey(ChoiceAnswer record);
}