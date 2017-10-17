package com.insigma.mvc.service.resources.SXJY_RLZYSC_006_001;

import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.Ac01;
import com.insigma.mvc.model.Ee14;
import com.insigma.mvc.model.Ef11;

public interface InfoReleaseManageService {

	public HashMap<String,Object> getEe14List(Ee14 ee14);
	
	public AjaxReturnMsg saveEe14Data(Ee14 ee14);
	
	public Ee14 getEe14ById(String eee141);
	
	public Ee14 getEe14NameById(String eee141);
	
	public AjaxReturnMsg<String> deleteReleaseInfoById(String eee141);
	
	public AjaxReturnMsg<String> batDeleteReleasedata(Ee14 ee14);
}
