package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_007;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.EE18;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;
import com.insigma.mvc.model.Ef12;

public interface HRAgencyReportService {

	//��ȡ������Ϣ
	HashMap<String, Object> getEf11List(Ef11 ef11);

	 //�������
	AjaxReturnMsg singleAuditHRAgencyReportdata(Ef12 ef12);
     //������˲�ͨ��ҳ��
	Ef11 getEf11InfoById(String id);
     //���浥��ҳ����˲�ͨ���ĵ�����
	AjaxReturnMsg saveNotPassAuditData(Ef12 ef12);
  
	 //��ѯ������Ϣ+Ee13
	Ee15 getEf11Ee15Info(String id);
	
	EE18 getEf11Ee18Info(EE18 ee18);

	AjaxReturnMsg batAuditHRAgencyRegdata(Ef12 ef12);

}
