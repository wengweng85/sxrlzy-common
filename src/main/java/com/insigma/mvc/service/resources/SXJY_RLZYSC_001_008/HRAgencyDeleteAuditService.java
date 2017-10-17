package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_008;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;

public interface HRAgencyDeleteAuditService {

	//��ȡ��������Ϣ
	HashMap<String, Object> getEf11List(Ef11 ef11);

	//�������
	AjaxReturnMsg singleAuditHRAgencyReportdata(Ef12 ef12);

	//��˲�ͨ��ҳ��
	Ef11 getEf11InfoById(String id, String flag);
    //���治ͨ��������
	AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);

	//��ϸҳ��� id
	Ef11 getEf11ById(String id);

	//�������
	AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);

}
