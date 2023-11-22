package com.mvc.Inventary.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mvc.Inventory.Model.RawMaterial;

@Component
public class RawMaterialDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(RawMaterial rawMaterial)
	{
		Integer i= (Integer) this.hibernateTemplate.save(rawMaterial);
		return i;
	}
	public RawMaterial get(int id)
	{
		RawMaterial rawMaterial= this.hibernateTemplate.get(RawMaterial.class,id);
		return rawMaterial;
	}
	public List<RawMaterial> getAllRawMaterial()
	{
		List<RawMaterial> RawMaterials = this.hibernateTemplate.loadAll(RawMaterial.class);
		return RawMaterials;
	}
	@Transactional
	public void deleteRawMaterial(int RawMaterialid)
	{
		RawMaterial rawMaterial=this.hibernateTemplate.get(RawMaterial.class, RawMaterialid);
		this.hibernateTemplate.delete(rawMaterial);
	}
	@Transactional
	public void updateRawMaterial(RawMaterial rawMaterial)
	{
		this.hibernateTemplate.update(rawMaterial);
	}
}
