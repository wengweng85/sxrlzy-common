package com.insigma.mvc.service.resources.SXJY_RLZYSC_004_001;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ee16;
import com.insigma.mvc.model.Ef11;


public interface AgencyOtherDataEntryService {

	    //��ȡ����������Դ��Ƹ���ݵ���Ϣ
		public HashMap<String,Object> getAgencyData( Ee15 ee15);	
		
		//��������������Ƹ����
		public AjaxReturnMsg saveAddRecruitData(Ee15 ee15);
		
		//�޸�¼����Ƹ����
		public AjaxReturnMsg upDateAgencyData(Ee15 ee15);
		
		//ͨ��������ѯ����
		public Ee15 getEe15ById(String id);
		
		//ͨ��������Ż�ȡ����������
		public Ef11 getOrganizationNameById(String aef101);

}
