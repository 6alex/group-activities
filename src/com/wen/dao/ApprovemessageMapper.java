package com.wen.dao;

import com.wen.po.Approvemessage;
import com.wen.po.ApprovemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovemessageMapper {
	
	Approvemessage getById(int aid);
	
    long countByExample(ApprovemessageExample example);

    int deleteByExample(ApprovemessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Approvemessage record);

    int insertSelective(Approvemessage record);

    List<Approvemessage> selectByExample(ApprovemessageExample example);

    Approvemessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Approvemessage record, @Param("example") ApprovemessageExample example);

    int updateByExample(@Param("record") Approvemessage record, @Param("example") ApprovemessageExample example);

    int updateByPrimaryKeySelective(Approvemessage record);

    int updateByPrimaryKey(Approvemessage record);
}