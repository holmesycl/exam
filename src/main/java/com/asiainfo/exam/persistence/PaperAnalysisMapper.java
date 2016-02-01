package com.asiainfo.exam.persistence;

import com.asiainfo.exam.domain.PaperAnalysis;
import com.asiainfo.exam.domain.PaperAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperAnalysisMapper {
    int countByExample(PaperAnalysisExample example);

    int deleteByExample(PaperAnalysisExample example);

    int deleteByPrimaryKey(Integer analysisId);

    int insert(PaperAnalysis record);

    int insertSelective(PaperAnalysis record);

    List<PaperAnalysis> selectByExample(PaperAnalysisExample example);

    PaperAnalysis selectByPrimaryKey(Integer analysisId);

    int updateByExampleSelective(@Param("record") PaperAnalysis record, @Param("example") PaperAnalysisExample example);

    int updateByExample(@Param("record") PaperAnalysis record, @Param("example") PaperAnalysisExample example);

    int updateByPrimaryKeySelective(PaperAnalysis record);

    int updateByPrimaryKey(PaperAnalysis record);
}