package com.insigma.mvc.service.resources.SXJY_RLZYSC_004_002;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ac01;
import com.insigma.mvc.model.Ee14;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;

public interface RecruitDataEntryService {
	//��ȡ��Ƹ���ݵ���Ϣ
	public HashMap<String,Object> getRecruitData( Ee15 ee15);

	public Ef11 getOrganizationNameById(String aef101);
	
	public AjaxReturnMsg saveRecruitData(Ee15 ee15);

	//ͨ��������ѯ����
	public Ee15 getEe15ById(String id);
	
	//�޸�¼����Ƹ����
	public AjaxReturnMsg upDateAgencyData(Ee15 ee15);
	
	public HashMap<String,Object> getData( Ee15 ee15);
	

}
