package com.mvc.Inventory.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.Inventary.Dao.RawMaterialDao;
import com.mvc.Inventory.Model.RawMaterial;

@Controller
public class RawMaterialController 
{
ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	
	RawMaterialDao rm= (RawMaterialDao)context.getBean("rawMaterialDao");
	
	@RequestMapping("/addRawMaterialForm")
	public String add()
	{
		return "dashboard";
	}
	
	@RequestMapping(path="/addRawMaterial")
	public RedirectView insertRawMaterial(@ModelAttribute RawMaterial rawMaterial,HttpServletRequest request)
	{
//		RawMaterial s = context.getBean("rawMaterial", RawMaterial.class);
//		s.setId(4);
//		s.setPname("plastic");
//		s.setQuantity(23);
//		s.setUnit("kg");
//		s.setCost(2000);
		int r=rm.insert(rawMaterial);
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewRaw");
		return redirectview;
			
	}
	@RequestMapping("/viewRaw")
	public String viewRaw(Model m)
	{
		
		List<RawMaterial> rawMaterial= rm.getAllRawMaterial();
		m.addAttribute("rawMaterial",rawMaterial);
		return "viewRaw";
		
	}
	@RequestMapping(path="/delete/{id}",method=RequestMethod.GET)
	public RedirectView deleteRawMaterial(@PathVariable("id") int id, HttpServletRequest request)
	{
		rm.deleteRawMaterial(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRaw");
		return redirectView;
	}

}
