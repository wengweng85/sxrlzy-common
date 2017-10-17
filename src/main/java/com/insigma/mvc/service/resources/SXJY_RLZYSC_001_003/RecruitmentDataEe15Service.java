package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_003;

import java.util.List;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ee16;

public interface RecruitmentDataEe15Service {



	List<Ee16> getEe16ById(String id);

	AjaxReturnMsg getEe15ByAef101(String id);

	//查询业务报告
	List<Ee15> getEe15ById(Ee15 id);
    //审核业务报告
	List<Ee15> getEe15ByAab998(Ee15 model);
    //单个查询-该机构有木有Ee15数据
	List getEe15SingleByAab998(Ee15 model);

}
