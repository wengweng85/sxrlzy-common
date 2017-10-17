package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_008;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;

public interface HRAgencyDeleteAuditService {

	//获取机构的信息
	HashMap<String, Object> getEf11List(Ef11 ef11);

	//单个审核
	AjaxReturnMsg singleAuditHRAgencyReportdata(Ef12 ef12);

	//审核不通过页面
	Ef11 getEf11InfoById(String id, String flag);
    //保存不通过的数据
	AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);

	//详细页面的 id
	Ef11 getEf11ById(String id);

	//批量审核
	AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);

}
