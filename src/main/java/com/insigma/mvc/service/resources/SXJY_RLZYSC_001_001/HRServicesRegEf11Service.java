package com.insigma.mvc.service.resources.SXJY_RLZYSC_001_001;

import java.util.HashMap;
import java.util.List;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ec11;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;


public interface HRServicesRegEf11Service {
	
	//保存
	public AjaxReturnMsg saveEf11Data(Ef11 ef11);
	
	//更改数据
	public AjaxReturnMsg editHRServicesRegData(Ef11 ef11);
	
	//获取ef11数据=机构信息
	public HashMap<String,Object> getEf11List(Ef11 ef11 );
	
	//跳转至编辑页面
	public  Ef11  getEf11ById(String aef101);
	
	 //注销
	public AjaxReturnMsg cancelEf11Data(Ef11 ef11);
	
	//获取机构名称
		public List<Ef11> getEf11ByAef101(String id);
		
		
		//通过编号查询数据
		public Ef11 getEf11ByAef(String id);

		public Ec11 getEc11ById(String id);

		public AjaxReturnMsg<String> saveEc11Data(Ec11 ec11);

		public AjaxReturnMsg deleteAagencyPersonByEec111(String id);

		public AjaxReturnMsg<String> batDeleteAgencyPersonInfo(Ec11 ec11);

		public HashMap<String, Object> getEc11List(Ec11 ec11);

		public Ec11 getEc11NameById(String id);
	
	
	
	
	
   
	

	


}
