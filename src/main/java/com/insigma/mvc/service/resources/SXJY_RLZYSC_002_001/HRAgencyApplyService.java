package com.insigma.mvc.service.resources.SXJY_RLZYSC_002_001;


import java.util.HashMap;

import com.insigma.dto.AjaxReturnMsg;
import com.insigma.mvc.model.EF11_DECLARE;
import com.insigma.mvc.model.Ec11;
import com.insigma.mvc.model.Ef11;





/**
 * ef11 service
 * @author pangyy
 *
 */
public interface HRAgencyApplyService {
	
	public AjaxReturnMsg getHRAgencyChangeById(String aab998);
	
	public AjaxReturnMsg saveEf11Data(EF11_DECLARE ef11_declare);
	
	public AjaxReturnMsg editEf11Data(Ef11 ef11);
	
	public AjaxReturnMsg cancelEf11Data(Ef11 ef11);
	
	public AjaxReturnMsg getAgencyInfoByAab998(String aab998);
	
	public AjaxReturnMsg getHRAgencyDeclareInfoById(String aab998);
	
	public AjaxReturnMsg getAgencyEf11InfoByAab998(String aab998);
	
	public HashMap<String,Object> getEc11List(Ec11 ec11);
	
	public AjaxReturnMsg saveEc11Data(Ec11 ec11);
	
	public AjaxReturnMsg editEc11Data(Ec11 ec11);
	
	public AjaxReturnMsg deleteEc11Data(Ec11 ec11);
	
    public Ec11 getEc11ById(String eec111);
    
    public Ec11 getEc11NameById(String eec111);
	
	public AjaxReturnMsg deleteAgencyPersonInfoById(String eec111);
	
	public AjaxReturnMsg batDeleteAgencyPersonInfo(Ec11 ec11);
	
	public AjaxReturnMsg deleteAagencyPersonByEec111(String eec111);

}
