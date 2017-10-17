package com.insigma.mvc.service.resources.SXJY_RLZYSC_006_003;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee11;
import com.insigma.mvc.model.Ee14;
import com.insigma.mvc.model.Ee17;
import com.insigma.mvc.model.Ef11;

public interface OpinionSuggetionEe17Service {
	
	/**
	 * ��������������
	 */
	
	//��ȡ�����Ϣ
	public HashMap<String, Object> getEe17List(Ee17 ee17);
	
	//���ݱ������Ϣ
	public HashMap<String, Object> selectHui(Ee17 ee17);
		
	//���ӷ���������������Ϣ
	public AjaxReturnMsg addSuggetion(Ee17 ee17,Ef11 ef11 );
	
	//�޸����
	public AjaxReturnMsg updateSuggetion(Ee17 ee17);
	
	//�������
	public AjaxReturnMsg replySuggetion(Ee17 ee17);
	
//	//����ɾ��
//	public AjaxReturnMsg batDeleteDemoData(Ee17 ee17);
	
	//����ɾ��=״̬
	public AjaxReturnMsg<String> batDeleteReleasedata(Ee17 ee17);
	
	//ͨ��������ѯ����
	public Ee17 getEe17ById(String id);
	
	//ͨ��������ѯ����ONE
	public Ee17 getEe17ByIdOpin(String eee171);
	
	public Ee17 getEe17NameById(String eee171);
	
	//ͨ��������Ż�ȡ����������
	public Ef11 getOrganizationNameById(String aef101);
	
	
}
