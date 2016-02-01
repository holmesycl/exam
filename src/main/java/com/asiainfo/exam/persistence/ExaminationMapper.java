package com.asiainfo.exam.persistence;

import com.asiainfo.exam.domain.Examination;
import com.asiainfo.exam.domain.ExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaminationMapper {
    int countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExample(ExaminationExample example);

    Examination selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByPrimaryKeySelective(Examination record);

    int updateByPrimaryKey(Examination record);
}