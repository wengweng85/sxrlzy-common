package com.insigma.mvc.service.resources.SXJY_RLZYSC_006_003;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee11;
import com.insigma.mvc.model.Ee14;
import com.insigma.mvc.model.Ee17;
import com.insigma.mvc.model.Ef11;

public interface OpinionSuggetionEe17Service {
	
	/**
	 * 服务机构意见建议
	 */
	
	//获取意见信息
	public HashMap<String, Object> getEe17List(Ee17 ee17);
	
	//根据标题查信息
	public HashMap<String, Object> selectHui(Ee17 ee17);
		
	//增加服务机构意见建议信息
	public AjaxReturnMsg addSuggetion(Ee17 ee17,Ef11 ef11 );
	
	//修改意见
	public AjaxReturnMsg updateSuggetion(Ee17 ee17);
	
	//受理意见
	public AjaxReturnMsg replySuggetion(Ee17 ee17);
	
//	//批量删除
//	public AjaxReturnMsg batDeleteDemoData(Ee17 ee17);
	
	//批量删除=状态
	public AjaxReturnMsg<String> batDeleteReleasedata(Ee17 ee17);
	
	//通过主键查询数据
	public Ee17 getEe17ById(String id);
	
	//通过主键查询数据ONE
	public Ee17 getEe17ByIdOpin(String eee171);
	
	public Ee17 getEe17NameById(String eee171);
	
	//通过机构编号获取机构的名称
	public Ef11 getOrganizationNameById(String aef101);
	
	
}
