package com.insigma.mvc.service.resources.SXJY_RLZYSC_003_001;


import java.util.HashMap;
import java.util.List;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ac01;
import com.insigma.mvc.model.CodeValue;
import com.insigma.mvc.model.Ee11;
import com.insigma.mvc.model.SGroup;

public interface AnnouncementInformEe11Service {
	//保存发布信息
	public AjaxReturnMsg saveDemoData(Ee11 ee11);
    //获取信息直接显示在主页
	public Ee11 getEe11NameById(String id);
    //获取公告信息
	public HashMap<String, Object> getEe11List(Ee11 ee11);
	//通过id删除人员Ee11信息
	public AjaxReturnMsg deleteDemoById(String id);
	//批量删除
	public AjaxReturnMsg batDeleteDemoData(Ee11 ee11);
	//通过主键查询数据
	public Ee11 getEe11ById(String id);
	
	
	//从缓存中获取代码值
		public HashMap<String, List<CodeValue>> getCodeValueFromCache(CodeValue codevalue);
	
	public List<CodeValue> getCodeValueTree(CodeValue codevalue);
	
	
	//服务机构树
	public List<CodeValue> getAllGroupList(CodeValue codevalue);
	public AjaxReturnMsg getGroupDataById(String id);
	
	

}
