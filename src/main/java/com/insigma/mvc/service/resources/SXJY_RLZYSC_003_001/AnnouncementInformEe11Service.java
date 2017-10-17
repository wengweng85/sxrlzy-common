package com.insigma.mvc.service.resources.SXJY_RLZYSC_003_001;


import java.util.HashMap;
import java.util.List;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ac01;
import com.insigma.mvc.model.CodeValue;
import com.insigma.mvc.model.Ee11;
import com.insigma.mvc.model.SGroup;

public interface AnnouncementInformEe11Service {
	//���淢����Ϣ
	public AjaxReturnMsg saveDemoData(Ee11 ee11);
    //��ȡ��Ϣֱ����ʾ����ҳ
	public Ee11 getEe11NameById(String id);
    //��ȡ������Ϣ
	public HashMap<String, Object> getEe11List(Ee11 ee11);
	//ͨ��idɾ����ԱEe11��Ϣ
	public AjaxReturnMsg deleteDemoById(String id);
	//����ɾ��
	public AjaxReturnMsg batDeleteDemoData(Ee11 ee11);
	//ͨ��������ѯ����
	public Ee11 getEe11ById(String id);
	
	
	//�ӻ����л�ȡ����ֵ
		public HashMap<String, List<CodeValue>> getCodeValueFromCache(CodeValue codevalue);
	
	public List<CodeValue> getCodeValueTree(CodeValue codevalue);
	
	
	//���������
	public List<CodeValue> getAllGroupList(CodeValue codevalue);
	public AjaxReturnMsg getGroupDataById(String id);
	
	

}
