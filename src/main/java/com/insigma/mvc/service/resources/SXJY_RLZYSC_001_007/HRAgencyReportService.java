package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_007;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.EE18;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;

public interface HRAgencyReportService {

	//获取机构信息
	HashMap<String, Object> getEf11List(Ef11 ef11);

	 //单个审核
	AjaxReturnMsg singleAuditHRAgencyReportdata(Ef12 ef12);
     //单个审核不通过页面
	Ef11 getEf11InfoById(String id);
     //储存单个页面审核不通过的的数据
	AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);
  
	 //查询基本信息+Ee13
	Ee15 getEf11Ee15Info(String id);
	
	EE18 getEf11Ee18Info(EE18 ee18);

	AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);

}
