package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_001;

import java.util.HashMap;
import java.util.List;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ec11;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;


public interface HRServicesRegEf11Service {
	
	//����
	public AjaxReturnMsg saveEf11Data(Ef11 ef11);
	
	//��������
	public AjaxReturnMsg editHRServicesRegData(Ef11 ef11);
	
	//��ȡef11����=������Ϣ
	public HashMap<String,Object> getEf11List(Ef11 ef11 );
	
	//��ת���༭ҳ��
	public  Ef11  getEf11ById(String aef101);
	
	 //ע��
	public AjaxReturnMsg cancelEf11Data(Ef11 ef11);
	
	//��ȡ��������
		public List<Ef11> getEf11ByAef101(String id);
		
		
		//ͨ����Ų�ѯ����
		public Ef11 getEf11ByAef(String id);

		public Ec11 getEc11ById(String id);

		public AjaxReturnMsg<String> saveEc11Data(Ec11 ec11);

		public AjaxReturnMsg deleteAagencyPersonByEec111(String id);

		public AjaxReturnMsg<String> batDeleteAgencyPersonInfo(Ec11 ec11);

		public HashMap<String, Object> getEc11List(Ec11 ec11);

		public Ec11 getEc11NameById(String id);
	
	
	
	
	
   
	

	


}
