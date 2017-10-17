package com.insigma.mvc.service.resources.SXJY_RLZYSC_004_002;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ac01;
import com.insigma.mvc.model.Ee14;
import com.insigma.mvc.model.Ee15;
import com.insigma.mvc.model.Ef11;

public interface RecruitDataEntryService {
	//获取招聘数据的信息
	public HashMap<String,Object> getRecruitData( Ee15 ee15);

	public Ef11 getOrganizationNameById(String aef101);
	
	public AjaxReturnMsg saveRecruitData(Ee15 ee15);

	//通过主键查询数据
	public Ee15 getEe15ById(String id);
	
	//修改录入招聘数据
	public AjaxReturnMsg upDateAgencyData(Ee15 ee15);
	
	public HashMap<String,Object> getData( Ee15 ee15);
	

}
