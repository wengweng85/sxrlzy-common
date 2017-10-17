package com.insigma.mvc.service.resources.SXJY_RLZYSC_005_001;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ee13;

public interface ComplaintsReportManageService {
	
	//查询Ee13信息
    public HashMap<String,Object> getEe13List(Ee13 ee13 );
	
	public AjaxReturnMsg<String> deleteEe13ById(String eee131);
	
	public AjaxReturnMsg<String> batDeleteEe13Data(Ee13 ee13);
	
	public Ee13 getEe13ById(String eee131);
	
	public Ee13 getEe13NameById(String eee131); 
	
	public AjaxReturnMsg<String> saveEe13Data(Ee13 ee13);
	
	public AjaxReturnMsg<String> updateEe13FileUuid(Ee13 ee13);
	
	public AjaxReturnMsg<String> deletefile(Ee13 ee13);
      //受理
	public AjaxReturnMsg updateEe13data(Ee13 ee13);
      //删除
	public AjaxReturnMsg deleteEe13Data(Ee13 ee13);

	public HashMap<String, Object> getEe13ByPhone(Ee13 ee13);
	
	
	
}
